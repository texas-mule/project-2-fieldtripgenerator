package transportation.vehicle;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
  @Autowired
  VehicleRepository vehiclerepository;

  @Transactional
  public List<Vehicle> getAllVehicles() {
    return this.vehiclerepository.findAll();
  }

  @Transactional
  public List<Vehicle> unoptimize(int passengers, List<Vehicle> vehiclestable) {
    int passengersleft = passengers;
    int totalvehiclecapacity = 0;
    ArrayList<Vehicle> availablevehicles = new ArrayList<Vehicle>();
    ArrayList<Vehicle> reservedvehicles = new ArrayList<Vehicle>();

    for (Vehicle vehiclerow : vehiclestable) {
      if (vehiclerow.getAvailability()) {
        availablevehicles.add(vehiclerow);
        totalvehiclecapacity += vehiclerow.getTotal_seats();
      }
    }

    if (passengers > totalvehiclecapacity) {
      return null;
    } else if (passengers == totalvehiclecapacity) {
      return availablevehicles;
    } else {
      while (passengersleft > 0) {
        int highestcapacity = 0;
        Vehicle tempvehicle = null;
        for (Vehicle vehicle : availablevehicles) {
          if (vehicle.getTotal_seats() > highestcapacity) {
            highestcapacity = vehicle.getTotal_seats();
            tempvehicle = vehicle;
          }
        }
        reservedvehicles.add(tempvehicle);
        passengersleft -= tempvehicle.getTotal_seats();
        availablevehicles.remove(tempvehicle);
      }
      return reservedvehicles;
    }
  }

  @Transactional
  public List<Vehicle> optimize(int passengers, List<Vehicle> vehiclestable) {
    boolean finalvehicles = false;
    int passengersleft = passengers;
    int totalvehiclecapacity = 0;
    int finalpasses = 0;
    ArrayList<Vehicle> availablevehicles = new ArrayList<Vehicle>();
    ArrayList<Vehicle> reservedvehicles = new ArrayList<Vehicle>();
    ArrayList<Vehicle> sugestedvehicles = new ArrayList<Vehicle>();
    ArrayList<Vehicle> segmentvehicles = new ArrayList<Vehicle>();

    for (Vehicle vehiclerow : vehiclestable) {
      if (vehiclerow.getAvailability()) {
        availablevehicles.add(vehiclerow);
        totalvehiclecapacity += vehiclerow.getTotal_seats();
      }
    }

    if (passengers > totalvehiclecapacity) {
      return null;
    } else if (passengers == totalvehiclecapacity) {
      return availablevehicles;
    } else {
      while (passengersleft > 0) {
        double highestcapacityscore = 0.0;
        Vehicle tempvehicle = null;
        for (Vehicle vehicle : availablevehicles) {
          if (vehicle.getTotal_seats() > passengersleft) {
            finalvehicles = true;
            if (finalvehicles) {
              finalpasses++;
            } 
            if (finalpasses == 1) {
              segmentvehicles.add(vehicle);
            }
            if (passengersleft
                * vehicle.getAverage_mpg() > highestcapacityscore) {
              tempvehicle = vehicle;
              highestcapacityscore = passengersleft * vehicle.getAverage_mpg();
            }
          } else {
            if (vehicle.getTotal_seats()
                * vehicle.getAverage_mpg() > highestcapacityscore) {
              tempvehicle = vehicle;
              highestcapacityscore = vehicle.getTotal_seats()
                  * vehicle.getAverage_mpg();
            }
          }
        }
        if (!finalvehicles) {
          reservedvehicles.add(tempvehicle);
          passengersleft -= tempvehicle.getTotal_seats();
          availablevehicles.remove(tempvehicle);
        } else {
          sugestedvehicles.add(tempvehicle);
          passengersleft -= tempvehicle.getTotal_seats();
          availablevehicles.remove(tempvehicle);
        }
      }
      double sugestedvehiclesgallons = 0.0;
      for (Vehicle vehicle : sugestedvehicles) {
        sugestedvehiclesgallons += 1000 / vehicle.getAverage_mpg();
      }
      double segmentvehiclelowestgallons =  1000 / segmentvehicles.get(0).getAverage_mpg();
      Vehicle tempvehicle = segmentvehicles.get(0);
      for (Vehicle vehicle : segmentvehicles) {
        if (segmentvehiclelowestgallons < 1000 / vehicle.getAverage_mpg()) {
          segmentvehiclelowestgallons = 1000 / vehicle.getAverage_mpg();
          tempvehicle = vehicle;
        }
      }
      if (sugestedvehiclesgallons < segmentvehiclelowestgallons) {
        for (Vehicle vehicle : sugestedvehicles) {
          reservedvehicles.add(vehicle);
        }
      } else {
        reservedvehicles.add(tempvehicle);
      }
      return reservedvehicles;
    }
  }

  @Transactional
  public double estimate(double distances, double gascost,
      List<Vehicle> vehiclestable) {
    double estimatecost = 0.0;
    for (Vehicle vehicle : vehiclestable) {
      double estimatedgallonsfortrip = distances / vehicle.getAverage_mpg();
      estimatecost += estimatedgallonsfortrip * gascost;
    }
    return estimatecost;
  }

}

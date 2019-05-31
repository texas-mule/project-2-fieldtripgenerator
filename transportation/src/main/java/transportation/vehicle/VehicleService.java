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
  public Vehicle getvehiclebyid (int id) {
    return this.vehiclerepository.findById(id);
  }
  
  @Transactional
  public Vehicle getvehiclebylicenseplate (String licenseplate) {
    return this.vehiclerepository.findByLicenseplate(licenseplate);
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
        totalvehiclecapacity += vehiclerow.getTotalseats();
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
          if (vehicle.getTotalseats() > highestcapacity) {
            highestcapacity = vehicle.getTotalseats();
            tempvehicle = vehicle;
          }
        }
        reservedvehicles.add(tempvehicle);
        passengersleft -= tempvehicle.getTotalseats();
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
        totalvehiclecapacity += vehiclerow.getTotalseats();
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
          if (vehicle.getTotalseats() > passengersleft) {
            finalvehicles = true;
            if (finalvehicles) {
              finalpasses++;
            } 
            if (finalpasses == 1) {
              segmentvehicles.add(vehicle);
            }
            if (passengersleft
                * vehicle.getAveragempg() > highestcapacityscore) {
              tempvehicle = vehicle;
              highestcapacityscore = passengersleft * vehicle.getAveragempg();
            }
          } else {
            if (vehicle.getTotalseats()
                * vehicle.getAveragempg() > highestcapacityscore) {
              tempvehicle = vehicle;
              highestcapacityscore = vehicle.getTotalseats()
                  * vehicle.getAveragempg();
            }
          }
        }
        if (!finalvehicles) {
          reservedvehicles.add(tempvehicle);
          passengersleft -= tempvehicle.getTotalseats();
          availablevehicles.remove(tempvehicle);
        } else {
          sugestedvehicles.add(tempvehicle);
          passengersleft -= tempvehicle.getTotalseats();
          availablevehicles.remove(tempvehicle);
        }
      }
      double sugestedvehiclesgallons = 0.0;
      for (Vehicle vehicle : sugestedvehicles) {
        sugestedvehiclesgallons += 1000 / vehicle.getAveragempg();
      }
      double segmentvehiclelowestgallons =  1000 / segmentvehicles.get(0).getAveragempg();
      Vehicle tempvehicle = segmentvehicles.get(0);
      for (Vehicle vehicle : segmentvehicles) {
        if (segmentvehiclelowestgallons < 1000 / vehicle.getAveragempg()) {
          segmentvehiclelowestgallons = 1000 / vehicle.getAveragempg();
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
  public double estimate(double lat1, double lat2, double lng1, double lng2, double gascost,
      List<Vehicle> vehiclestable) {
	  double distance;
	  distance = Math.sqrt(Math.pow((lat2-lat1)*68.703,2)+Math.pow((lng2-lng1)*68.703,2));
    double estimatecost = 0.0;
    for (Vehicle vehicle : vehiclestable) {
      double estimatedgallonsfortrip = distance / vehicle.getAveragempg();
      estimatecost += estimatedgallonsfortrip * gascost;
    }
    return estimatecost;
  }

}

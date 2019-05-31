package transportation.vehicle;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
  public double estimate (double distances, double gascost, List<Vehicle> vehiclestable) {
   double estimatecost = 0.0;
    for (Vehicle vehicle : vehiclestable) {
      double estimatedgallonsfortrip = distances / vehicle.getAverage_mpg();
      estimatecost += estimatedgallonsfortrip * gascost;
    }
    return estimatecost;
  }

  
}

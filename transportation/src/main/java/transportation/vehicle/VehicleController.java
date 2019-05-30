package transportation.vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

  @Autowired
  VehicleService vehicleservice;

  @GetMapping
  public List<Vehicle> getAll() {
    return vehicleservice.getAllVehicles();
  }

  @GetMapping("/optimize")
  public List<Vehicle> optimize(
      @RequestParam(value = "passengers") int passengers) {
    int passengersleft = passengers;
    int totalbuscapacity = 0;
    List<Vehicle> vehiclestable = vehicleservice.getAllVehicles();
    ArrayList<Vehicle> availablevehicles = new ArrayList<Vehicle>();
    List<Integer> bestbusesindex = null;
    for (Vehicle vehiclerow : vehiclestable) {
      totalbuscapacity += vehiclerow.getTotal_seats();
      if (vehiclerow.getAvailability()) {
        availablevehicles.add(vehiclerow);
      }
    }
    if (passengers > totalbuscapacity) {
      return null;
    } else {
      while (passengersleft > 0) {
        int index = 0;
        int indexofhighest = 0;
        double highestcalculation = 0;
        for (Vehicle vehicleobject : availablevehicles) {
          if (vehicleobject.getTotal_seats() > passengersleft) {
            if ((passengersleft*vehicleobject.getAverage_mpg()) > highestcalculation) {
              indexofhighest = index;
              highestcalculation = passengersleft*vehicleobject.getAverage_mpg();
            }
          } else {
            if ((vehicleobject.getTotal_seats()*vehicleobject.getAverage_mpg()) > highestcalculation) {
              indexofhighest = index;
              highestcalculation = vehicleobject.getTotal_seats()*vehicleobject.getAverage_mpg();
            }
          }
          index++;
        }
        bestbusesindex.add(indexofhighest);
      }
      List<Vehicle> bestbuses = null;
      for (Integer index : bestbusesindex) {
        bestbuses.add(vehiclestable.get(index));
      }
    }
    return null;
  }

  @GetMapping("/test")
  public String test() {
    return "hello";
  }

  @GetMapping("/testvehicle")
  public Vehicle vehicle(@RequestParam(value = "id") int id,
      @RequestParam(value = "license_plate") String license_plate,
      @RequestParam(value = "registration_number") String registration_number,
      @RequestParam(value = "owner") String owner,
      @RequestParam(value = "overall_mileage") int overall_mileage,
      @RequestParam(value = "total_seats") int total_seats,
      @RequestParam(value = "average_mpg") double average_mpg,
      @RequestParam(value = "availability") boolean availability) {
    return new Vehicle(id, license_plate, registration_number, owner,
        overall_mileage, total_seats, average_mpg, availability);
  }

}
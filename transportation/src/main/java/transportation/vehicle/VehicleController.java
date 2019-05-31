package transportation.vehicle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
  
  List<Vehicle> cachedvehicles = new ArrayList<Vehicle>();

  @Autowired
  VehicleService vehicleservice;

  @GetMapping
  public List<Vehicle> getAll() {
    return vehicleservice.getAllVehicles();
  }
  
  @GetMapping("/unoptimize")
  public List<Vehicle> unoptimize(@RequestParam(value = "passengers") int passengers) {
    cachedvehicles = vehicleservice.unoptimize(passengers, getAll());
    return cachedvehicles;
  }
  
  @GetMapping("/optimize")
  public List<Vehicle> optimize(@RequestParam(value = "passengers") int passengers) {
   cachedvehicles = vehicleservice.optimize(passengers, getAll());
   return cachedvehicles;
  }
  
  @GetMapping("/estimate")
  public double estimate (@RequestParam(value = "distance") double distance, @RequestParam(value = "gascost") double gascost) {
    return vehicleservice.estimate(distance, gascost, cachedvehicles);
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
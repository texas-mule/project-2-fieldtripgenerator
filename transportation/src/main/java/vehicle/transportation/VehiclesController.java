package vehicle.transportation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController {
  
  @RequestMapping("/get/testvehicle")
  public Vehicles vehicle(@RequestParam(value="id") int id, @RequestParam(value="license_plate") String license_plate, @RequestParam(value="license_location") String license_location, @RequestParam(value="registration_number") int registration_number, @RequestParam(value="owner") String owner, @RequestParam(value="overall_mileage") int overall_mileage, @RequestParam(value="total_seats") int total_seats, @RequestParam(value="average_mpg") double average_mpg, @RequestParam(value="maintance_status") int maintance_status) {
    return new Vehicles (id, license_plate, license_location, registration_number, owner, overall_mileage, total_seats, average_mpg, maintance_status);
  }
  
}
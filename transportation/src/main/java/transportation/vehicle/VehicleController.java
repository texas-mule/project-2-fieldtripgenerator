package transportation.vehicle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public double estimate(@RequestParam(value = "lat1") double lat1, @RequestParam(value = "lat2") double lat2,
			@RequestParam(value = "lng1") double lng1, @RequestParam(value = "lng1") double lng2,
			@RequestParam(value = "gascost") double gascost) {
		return vehicleservice.estimate(lat1, lat2, lng1, lng2, gascost, cachedvehicles);
	}

	@GetMapping("/id/{id}")
	public Vehicle getvehiclebyid(@PathVariable(value = "id") int id) {
		return vehicleservice.getvehiclebyid(id);
	}

	@GetMapping("/licenseplate/{licenseplate}")
	public Vehicle getvehiclebylicenseplate(@PathVariable(value = "licenseplate") String licenseplate) {
		return vehicleservice.getvehiclebylicenseplate(licenseplate);
	}

	@GetMapping("/test")
	public String test() {
		return "hello";
	}

	@GetMapping("/testvehicle")
	public Vehicle vehicle(@RequestParam(value = "id") int id,
			@RequestParam(value = "licenseplate") String licenseplate,
			@RequestParam(value = "registrationnumber") String registrationnumber,
			@RequestParam(value = "owner") String owner, @RequestParam(value = "overallmileage") int overallmileage,
			@RequestParam(value = "totalseats") int totalseats, @RequestParam(value = "averagempg") double averagempg,
			@RequestParam(value = "availability") boolean availability) {
		return new Vehicle(id, licenseplate, registrationnumber, owner, overallmileage, totalseats, averagempg,
				availability);
	}

}
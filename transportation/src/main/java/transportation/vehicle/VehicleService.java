package transportation.vehicle;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
  @Autowired
  VehicleRepository vehiclerepository;
  
  @Transactional
  public List<Vehicle> getAllVehicles () {
    return this.vehiclerepository.findAll();
  }
}

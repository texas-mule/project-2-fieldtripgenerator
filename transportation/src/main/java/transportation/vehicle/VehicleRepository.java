package transportation.vehicle;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
  Vehicle findById(int id);
  Vehicle findByLicenseplate(String licenseplate);
  
}

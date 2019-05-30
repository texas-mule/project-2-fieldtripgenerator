package transportation.vehicle;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
  Vehicle findById(int id);
  
}

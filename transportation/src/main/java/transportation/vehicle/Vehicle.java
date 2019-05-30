package transportation.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "vehicle")
public class Vehicle {
  
  @Id
  private int id;
  @Pattern(regexp="[a-zA-Z0-9]+")
  @NotBlank
  private String license_plate;
  @Pattern(regexp="[0-9]+")
  @NotBlank
  private String registration_number;
  @Pattern(regexp="[a-zA-Z]+")
  @NotBlank
  private String owner;
  @NotBlank
  private int overall_mileage;
  @NotBlank
  private int total_seats;
  @NotBlank
  private double average_mpg;
  @NotBlank
  private boolean availability;
  
  public Vehicle(int id, String license_plate, String registration_number,
      String owner, int overall_mileage, int total_seats, double average_mpg,
      boolean availability) {
    super();
    this.id = id;
    this.license_plate = license_plate;
    this.registration_number = registration_number;
    this.owner = owner;
    this.overall_mileage = overall_mileage;
    this.total_seats = total_seats;
    this.average_mpg = average_mpg;
    this.availability = availability;
  }
  
  public Vehicle () {
    super();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLicense_plate() {
    return license_plate;
  }

  public void setLicense_plate(String license_plate) {
    this.license_plate = license_plate;
  }

  public String getRegistration_number() {
    return registration_number;
  }

  public void setRegistration_number(String registration_number) {
    this.registration_number = registration_number;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getOverall_mileage() {
    return overall_mileage;
  }

  public void setOverall_mileage(int overall_mileage) {
    this.overall_mileage = overall_mileage;
  }

  public int getTotal_seats() {
    return total_seats;
  }

  public void setTotal_seats(int total_seats) {
    this.total_seats = total_seats;
  }

  public double getAverage_mpg() {
    return average_mpg;
  }

  public void setAverage_mpg(double average_mpg) {
    this.average_mpg = average_mpg;
  }

  public boolean getAvailability() {
    return availability;
  }

  public void setAvailability(boolean availability) {
    this.availability = availability;
  }

  @Override
  public String toString() {
    return "Vehicle [id=" + id + ", license_plate=" + license_plate
        + ", registration_number=" + registration_number + ", owner=" + owner
        + ", overall_mileage=" + overall_mileage + ", total_seats="
        + total_seats + ", average_mpg=" + average_mpg + ", availability="
        + availability + "]";
  }
  
  
  
}

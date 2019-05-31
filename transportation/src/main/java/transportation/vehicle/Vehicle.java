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
  @Pattern(regexp = "[a-zA-Z0-9]+")
  @NotBlank
  private String licenseplate;
  @Pattern(regexp = "[0-9]+")
  @NotBlank
  private String registrationnumber;
  @Pattern(regexp = "[a-zA-Z]+")
  @NotBlank
  private String owner;
  @NotBlank
  private int overallmileage;
  @NotBlank
  private int totalseats;
  @NotBlank
  private double averagempg;
  @NotBlank
  private boolean availability;

  public Vehicle(int id, String licenseplate, String registrationnumber,
      String owner, int overallmileage, int totalseats, double averagempg,
      boolean availability) {
    super();
    this.id = id;
    this.licenseplate = licenseplate;
    this.registrationnumber = registrationnumber;
    this.owner = owner;
    this.overallmileage = overallmileage;
    this.totalseats = totalseats;
    this.averagempg = averagempg;
    this.availability = availability;
  }

  public Vehicle() {
    super();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLicenseplate() {
    return licenseplate;
  }

  public void setLicenseplate(String licenseplate) {
    this.licenseplate = licenseplate;
  }

  public String getRegistrationnumber() {
    return registrationnumber;
  }

  public void setRegistrationnumber(String registrationnumber) {
    this.registrationnumber = registrationnumber;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getOverallmileage() {
    return overallmileage;
  }

  public void setOverallmileage(int overallmileage) {
    this.overallmileage = overallmileage;
  }

  public int getTotalseats() {
    return totalseats;
  }

  public void setTotalseats(int totalseats) {
    this.totalseats = totalseats;
  }

  public double getAveragempg() {
    return averagempg;
  }

  public void setAveragempg(double averagempg) {
    this.averagempg = averagempg;
  }

  public boolean getAvailability() {
    return availability;
  }

  public void setAvailability(boolean availability) {
    this.availability = availability;
  }

  @Override
  public String toString() {
    return "Vehicle [id=" + id + ", licenseplate=" + licenseplate
        + ", registrationnumber=" + registrationnumber + ", owner=" + owner
        + ", overallmileage=" + overallmileage + ", totalseats="
        + totalseats + ", averagempg=" + averagempg + ", availability="
        + availability + "]";
  }

}

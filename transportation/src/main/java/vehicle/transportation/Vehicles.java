package vehicle.transportation;

public class Vehicles {
  
  private int id;
  private String license_plate;
  private String license_location;
  private int registration_number;
  private String owner;
  private int overall_mileage;
  private int total_seats;
  private double average_mpg;
  private int maintance_status;
  
  public Vehicles(int id, String license_plate, String license_location,
      int registration_number, String owner, int overall_mileage,
      int total_seats, double average_mpg, int maintance_status) {
    super();
    this.id = id;
    this.license_plate = license_plate;
    this.license_location = license_location;
    this.registration_number = registration_number;
    this.owner = owner;
    this.overall_mileage = overall_mileage;
    this.total_seats = total_seats;
    this.average_mpg = average_mpg;
    this.maintance_status = maintance_status;
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

  public String getLicense_location() {
    return license_location;
  }

  public void setLicense_location(String license_location) {
    this.license_location = license_location;
  }

  public int getRegistration_number() {
    return registration_number;
  }

  public void setRegistration_number(int registration_number) {
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

  public int getMaintance_status() {
    return maintance_status;
  }

  public void setMaintance_status(int maintance_status) {
    this.maintance_status = maintance_status;
  }
  
}

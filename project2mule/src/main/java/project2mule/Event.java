package project2mule;

public class Event {
    
    private Long id;
    private String description;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String name;
    public Event(long id, String description, String address, String city, String state, int zip, String name) {
        super();
        this.id = id;
        this.description = description;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Facility [id=" + id + ", name=" + name + ", description=" + description + ", address=" + address
                + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
    }
    public Event() {
        super();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
}

public class Address {
    private String street;
    private Integer buildingNumber;
    private String zipCode;

    public Address( String street, Integer buildingNumber, String zipCode) {
this.buildingNumber = buildingNumber;
        this.street = street;
        this.zipCode = zipCode;
    }
    public String toString() {
        return street + " " + buildingNumber + " "+ zipCode;
    }
}
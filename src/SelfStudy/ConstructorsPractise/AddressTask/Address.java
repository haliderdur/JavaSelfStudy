package SelfStudy.ConstructorsPractise.AddressTask;

/*
Address Task:
2.1 Create a class named Address
    Attributes:
         buildingNumber, street, city, state, zipCode;
    Add a constructor to set all the fields
    Actions
         toString: returns the address
    EX:
        7925 Jones Branch Dr
        McLean Va, 22012
 */
public class Address {
    public int buildingNumber;
    public String street, city, state;
    public int zipCode;

    public Address(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address: \n" +
                buildingNumber + " " + street + " \n" +
                city + " " + state + ", " + zipCode;
    }

    public static void main(String[] args) {
        Address address1 = new Address(7925, "Jones Branch DR", "McLean", "VA", 22012);
        System.out.println(address1);
    }
}

/**
 * This class gathers and prints out information about the manufacturer of the vehicle
 */

public class Manufacturer {

    private String name;
    private String country;
    // constructor
    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }
    // getter for name
    public String getName() {
        return this.name;
    }
    // getter for country
    public String getCountry() {
        return this.country;
    }
    // to string method for manufacturer
    @Override
    public String toString() {
        return this.name + ", " + this.country;
    }
}

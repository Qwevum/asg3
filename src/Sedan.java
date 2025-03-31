/**
 * this is a subclass of the Vehicle class and it gathers information if the vehicle is a sedan
 */

public class Sedan extends Vehicle{
    // constructor
    public Sedan(Manufacturer manufacturer, AutoModel model, int mpg) {
        super(manufacturer, model, mpg);
    }
    // getter for number of wheels
    @Override
    public int numberOfWheels() {
        return 4;
    }
    // to string method for sedan
    @Override
    public String toString() {
        return String.format("(%s) %s, mpg: %d", getManufacturer(), getModel(), getMpg());
    }
}

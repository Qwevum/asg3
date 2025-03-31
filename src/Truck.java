/**
 * this is a subclass of the vehicle class and gathers information if the vehicle is a truck
 */

public class Truck extends Vehicle{
    // fields
    private Manufacturer manufacturer;
    private boolean isDually;
    private AutoModel model;
    private int mpg;
    // constructor
    public Truck(Manufacturer manufacturer, boolean isDually, AutoModel model, int mpg) {
        super(manufacturer, model, mpg);
        this.manufacturer = manufacturer;
        this.isDually = isDually;
        this.model = model;
        this.mpg = mpg;
    }
    // check number of wheels
    @Override
    public int numberOfWheels() {
        if (this.isDually) {
            return 6;
        }
        else {
            return 4;
        }
    }
    // to string method for truck
    @Override
    public String toString() {
        return String.format("(%s) %s, mpg: %d, is dually = %b", this.manufacturer, this.model, this.mpg, this.isDually);
    }
}

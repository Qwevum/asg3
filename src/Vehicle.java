import java.time.Year;

/**
 * Vehicle class is abstract and is instantiated by using either the Truck subclass or the Sedan subclass
 */

public abstract class Vehicle implements Comparable<Vehicle> {
    // fields
    private Manufacturer manufacturer;
    private AutoModel model;
    private int mpg;
    // constructor
    public Vehicle(Manufacturer manufacturer, AutoModel model, int mpg) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.mpg = mpg;
    }
    // getter for manufacturer
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    // getter for model
    public AutoModel getModel() {
        return model;
    }
    // getter for mpg
    public int getMpg() {
        return mpg;
    }
    // abstract number of wheels method
    public abstract int numberOfWheels();
    // calculate how far vehicle will go with the mpg
    public int howFarWith(int numOfGallons){
        return numOfGallons * mpg;
    }
    // getter for year
    public Year getYear(){
        return model.getFirstYear().get(0);
    }
    // comparable method
    @Override
    public int compareTo(Vehicle o) {
        if (this.getYear().equals(o.getYear())){
            return 0;
        }
        else if (this.getYear().isAfter(o.getYear())){
            return 1;
        }
        else {
            return -1;
        }
    }
}

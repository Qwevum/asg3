import java.util.ArrayList;
import java.util.Collections;

/**
 * this is how the vehicles are put into an ArrayList and are sorted accordingly
 */

public class Garage {

    private ArrayList<Vehicle> vehicles;
    // constructor
    public Garage(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    // adder for garage to add vehicle
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    // clears garage
    public void emptyGarage(){
        vehicles.clear();
    }
    // sort garage
    public void sortByReleaseYear(){
        Collections.sort(vehicles);
    }
    // to string method for garage
    @Override
    public String toString(){
        String allVehicles = "";
        for (Object vehicle : vehicles){
            allVehicles += vehicle + "\n";
        }
        return allVehicles;
    }

}

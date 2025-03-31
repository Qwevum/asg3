import java.time.Year;
import java.util.ArrayList;
import java.util.List;

/**
 * This program takes in information about multiple vehicles and sorts them in a garage.
 */

public class Tester {

    public static void main(String[] args) {

        ArrayList<Year> year1 = new ArrayList<>();
        for (int i = 2020; i <= 2022; i++){
            year1.add(Year.of(i));
        }
        AutoModel am1 = new AutoModel("F150", true, year1);
        Manufacturer m1 = new Manufacturer("Ford", "USA");
        Vehicle v1 = new Truck(m1, false, am1, 20);

        ArrayList<Year> year2 = new ArrayList<>();
        for (int i = 1996; i <= 1998; i++){
            year2.add(Year.of(i));
        }
        AutoModel am2 = new AutoModel("Civic LX", false, year2);
        Manufacturer m2 = new Manufacturer("Honda", "Japan");
        Vehicle v2 = new Sedan(m2, am2, 28);

        ArrayList<Year> year3 = new ArrayList<>();
        for (int i = 2015; i <= 2018; i++){
            year3.add(Year.of(i));
        }
        AutoModel am3 = new AutoModel("M3 Limited", false, year3);
        Manufacturer m3 = new Manufacturer("BMW", "Germany");
        Vehicle v3 = new Sedan(m3, am3, 30);

        ArrayList<Year> year4 = new ArrayList<>();
        for (int i = 1987; i <= 1988; i++){
            year4.add(Year.of(i));
        }
        AutoModel am4 = new AutoModel("Tundra", false, year4);
        Manufacturer m4 = new Manufacturer("Toyota", "Japan");
        Vehicle v4 = new Truck(m4, true, am4, 30);

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(List.of(new Vehicle[]{v1, v2, v3, v4}));
        Garage g = new Garage(vehicles);

        System.out.println("Before sorting: ");
        System.out.println(g);

        g.sortByReleaseYear();

        System.out.println("After sorting: ");
        System.out.println(g);
    }

}

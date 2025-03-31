import java.time.Year;
import java.util.List;

/**
 * This class gathers information about the model of the vehicle
 */

public class AutoModel {

    private String modelName;
    private boolean inProduction;
    private List<Year> firstYear;
    // constructor
    public AutoModel(String modelName, boolean inProduction, List<Year> firstYear) {
        this.modelName = modelName;
        this.inProduction = inProduction;
        this.firstYear = firstYear;

        if (firstYear.isEmpty()) {
            throw new IllegalArgumentException("There has to be a production year");
        }
    }
    // getter for years list
    public List<Year> getFirstYear() {
        return firstYear;
    }
    // to string method for AutoModel
    @Override
    public String toString() {
        return String.format("%s, in production = %b, %s", this.modelName, this.inProduction, this.firstYear);
    }
}

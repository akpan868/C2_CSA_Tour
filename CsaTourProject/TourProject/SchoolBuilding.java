package TourProject;
import java.util.*;
import java.time.LocalDate;

public class SchoolBuilding {
    private final String IAaddress = "125 Milton Ave, Alpharetta, GA 30009";
    private String TourDate;
    ArrayList<ArrayList<String>> schoolPlan = new ArrayList<>();
    public SchoolBuilding() {
            LocalDate currentDate = LocalDate.now();
            TourDate = "" + currentDate;

    }
}
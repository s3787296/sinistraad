import java.util.ArrayList;

// class to house location lists which contain location objects
public class LocationList {

    // method to generate location objects, and store in corresponding arraylist
    public static void createLocation() {
        // arraylist to store location objects a1...a5 at corresponding index
        ArrayList<Location> aList = new ArrayList<>();
        aList.set(1, new Location("A1", " A1 NAME", "A1 description"));
        aList.set(2, new Location("A2", " A2 NAME", "A2 description"));
        aList.set(3, new Location("A3", " A3 NAME", "A3 description"));
        aList.set(4, new Location("A4", " A4 NAME", "A4 description"));
        aList.set(5, new Location("A5", " A5 NAME", "A5 description"));

        // arraylist to store location objects b1...b5 at corresponding index
        ArrayList<Location> bList = new ArrayList<>();
        bList.set(1, new Location("B1", " B1 NAME", "B1 description"));
        bList.set(2, new Location("B2", " B2 NAME", "B2 description"));
        bList.set(3, new Location("B3", " B3 NAME", "B3 description"));
        bList.set(4, new Location("B4", " B4 NAME", "B4 description"));
        bList.set(5, new Location("B5", " B5 NAME", "B5 description"));

        // arraylist to store location objects c1...c5 at corresponding index
        ArrayList<Location> cList = new ArrayList<>();
        cList.set(1, new Location("C1", " C1 NAME", "C1 description"));
        cList.set(2, new Location("C2", " C2 NAME", "C2 description"));
        cList.set(3, new Location("C3", " C3 NAME", "C3 description"));
        cList.set(4, new Location("C4", " C4 NAME", "C4 description"));
        cList.set(5, new Location("C5", " C5 NAME", "C5 description"));

        // arraylist to store location objects d1...d5 at corresponding index
        ArrayList<Location> dList = new ArrayList<>();
        dList.set(1, new Location("D1", " D1 NAME", "D1 description"));
        dList.set(2, new Location("D2", " D2 NAME", "D2 description"));
        dList.set(3, new Location("D3", " D3 NAME", "D3 description"));
        dList.set(4, new Location("D4", " D4 NAME", "D4 description"));
        dList.set(5, new Location("D5", " D5 NAME", "D5 description"));

        // arraylist to store location objects e1...e5 at corresponding index
        ArrayList<Location> eList = new ArrayList<>();
        eList.set(1, new Location("E1", " E1 NAME", "E1 description"));
        eList.set(2, new Location("E2", " E2 NAME", "E2 description"));
        eList.set(3, new Location("E3", " E3 NAME", "E3 description"));
        eList.set(4, new Location("E4", " E4 NAME", "E4 description"));
        eList.set(5, new Location("E5", " E5 NAME", "E5 description"));
    }
}

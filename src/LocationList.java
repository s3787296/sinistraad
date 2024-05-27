import java.util.ArrayList;

// class to house location lists which contain location objects
public class LocationList {

    // arraylist to store location objects a1...a5 at corresponding index
    public static ArrayList<Location> aList = new ArrayList<Location>();

    // arraylist to store location objects b1...b5 at corresponding index
    public static ArrayList<Location> bList = new ArrayList<Location>();

    // arraylist to store location objects c1...c5 at corresponding index
    public static ArrayList<Location> cList = new ArrayList<Location>();

    // arraylist to store location objects c1...c5 at corresponding index
    public static ArrayList<Location> dList = new ArrayList<Location>();

    // arraylist to store location objects e1...e5 at corresponding index
    public static ArrayList<Location> eList = new ArrayList<Location>();

    // method to generate location objects, and store in corresponding arraylist
    public static void createLocations() {
        // creating and setting location objects at corresponding index value
        Location nullLocation = new Location("NULL", "NULL", "NULL");
        //
        aList.add(nullLocation);
        //
        Location a1Location = new Location("A1", " A1 NAME", "A1 description");
        aList.add(a1Location);
        //
        Location a2Location = new Location("A2", " A2 NAME", "A2 description");
        aList.add(a2Location);
        //
        Location a3Location = new Location("A3", " A3 NAME", "A3 description");
        aList.add(a3Location);
        //
        Location a4Location = new Location("A4", " A4 NAME", "A4 description");
        aList.add(a4Location);
        //
        Location a5Location = new Location("A5", " A5 NAME", "A5 description");
        aList.add(a5Location);
        //
        bList.add(nullLocation);
        //
        Location b1Location = new Location("B1", " B1 NAME", "B1 description");
        bList.add(b1Location);
        //
        Location b2Location = new Location("B2", " B2 NAME", "B2 description");
        bList.add(b2Location);
        //
        Location b3Location = new Location("B3", " B3 NAME", "B3 description");
        bList.add(b3Location);
        //
        Location b4lLocation = new Location("B4", " B4 NAME", "B4 description");
        bList.add(b4lLocation);
        //
        Location b5Location = new Location("B5", " B5 NAME", "B5 description");
        bList.add(b5Location);
        //
        cList.add(nullLocation);
        //
        Location c1Location = new Location("C1", " C1 NAME", "C1 description");
        cList.add(c1Location);
        //
        Location c2Location = new Location("C2", " C2 NAME", "C2 description");
        cList.add(c2Location);
        //
        Location c3Location = new Location("C3", " C3 NAME", "C3 description");
        cList.add(c3Location);
        //
        Location c4Location = new Location("C4", " C4 NAME", "C4 description");
        cList.add(c4Location);
        //
        Location c5Location = new Location("C5", " C5 NAME", "C5 description");
        cList.add(c5Location);
        //
        Location d1Location = new Location("D1", " D1 NAME", "D1 description");
        dList.add(d1Location);
        //
        Location d2Location = new Location("D2", " D2 NAME", "D2 description");
        dList.add(d2Location);
        //
        Location d3Location = new Location("D3", " D3 NAME", "D3 description");
        dList.add(d3Location);
        //
        Location d4Location = new Location("D4", " D4 NAME", "D4 description");
        dList.add(d4Location);
        //
        Location d5Location = new Location("D5", " D5 NAME", "D5 description");
        dList.add(d5Location);
        //
        eList.add(nullLocation);
        //
        Location e1Location = new Location("E1", " E1 NAME", "E1 description");
        eList.add(e1Location);
        //
        Location e2Location = new Location("E2", " E2 NAME", "E2 description");
        eList.add(e2Location);
        //
        Location e3Location = new Location("E3", " E3 NAME", "E3 description");
        eList.add(e3Location);
        //
        Location e4Location = new Location("E4", " E4 NAME", "E4 description");
        eList.add(e4Location);
        //
        Location e5Location = new Location("E5", " E5 NAME", "E5 description");
        eList.add(e5Location);
    }
}

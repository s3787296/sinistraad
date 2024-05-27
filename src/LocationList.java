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
        Location a1Location = new Location("A1", "CASTLE ARMOURY", "A1 description");
        aList.add(a1Location);
        //
        Location a2Location = new Location("A2", "CASTLE INTERIOR", "A2 description");
        aList.add(a2Location);
        //
        Location a3Location = new Location("A3", "CASTLE COURTYARD", "A3 description");
        aList.add(a3Location);
        //
        Location a4Location = new Location("A4", "DUSKWOOD FOREST", "A4 description");
        aList.add(a4Location);
        //
        Location a5Location = new Location("A5", "NOT ACCESSIBLE", "Something has gone wrong.");
        aList.add(a5Location);
        //
        bList.add(nullLocation);
        //
        Location b1Location = new Location("B1", "CASTLE INTERIOR", "B1 description");
        bList.add(b1Location);
        //
        Location b2Location = new Location("B2", "CASTLE INTERIOR", "B2 description");
        bList.add(b2Location);
        //
        Location b3Location = new Location("B3", "CASTLE INTERIOR", "B3 description");
        bList.add(b3Location);
        //
        Location b4lLocation = new Location("B4", "DUSKWOOD FOREST", "B4 description");
        bList.add(b4lLocation);
        //
        Location b5Location = new Location("B5", "DUSKWOOD FOREST", "B5 description");
        bList.add(b5Location);
        //
        cList.add(nullLocation);
        //
        Location c1Location = new Location("C1", "CASTLE CATHEDRAL", "C1 description");
        cList.add(c1Location);
        //
        Location c2Location = new Location("C2", "DUSKWOOD CLEARING", "C2 description");
        cList.add(c2Location);
        //
        Location c3Location = new Location("C3", "DUSKWOOD FOREST", "C3 description");
        cList.add(c3Location);
        //
        Location c4Location = new Location("C4", "DUSKWOOD FOREST", "C4 description");
        cList.add(c4Location);
        //
        Location c5Location = new Location("C5", "DUSKWOOD DEN", "C5 description");
        cList.add(c5Location);
        //
        dList.add(nullLocation);
        //
        Location d1Location = new Location("D1", "CASTLE CHAMBERS", "D1 description");
        dList.add(d1Location);
        //
        Location d2Location = new Location("D2", "MYSTIC", "D2 description");
        dList.add(d2Location);
        //
        Location d3Location = new Location("D3", "DUSKWOOD FOREST", "D3 description");
        dList.add(d3Location);
        //
        Location d4Location = new Location("D4", "DUSKWOOD FOREST", Dialogue.D4Text());
        dList.add(d4Location);
        //
        Location d5Location = new Location("D5", "DUSKWOOD FOREST", "D5 description");
        dList.add(d5Location);
        //
        eList.add(nullLocation);
        //
        Location e1Location = new Location("E1", "THRONE ROOM", "E1 description");
        eList.add(e1Location);
        //
        Location e2Location = new Location("E2", "NOT ACCESSIBLE", "Something has gone wrong.");
        eList.add(e2Location);
        //
        Location e3Location = new Location("E3", "TWISTED CAVE", "E3 description"); // E3Text, but TODO make another for once arachnid matriarch is defeated/you return.
        eList.add(e3Location);
        //
        Location e4Location = new Location("E4", "TILLED PLAINS", Dialogue.E4Text()); // Call FarmerText, if arachnid defeated, call FarmerReturnText
        eList.add(e4Location);
        //
        Location e5Location = new Location("E5", "OLD TOWN", Dialogue.E5Text());
        eList.add(e5Location);
    }
}

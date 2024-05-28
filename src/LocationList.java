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
        Location a1Location = new Location("A1", "CASTLE ARMOURY", Story.a1Story(), EnemyList.forgemasterFuego(), ItemList.forgemastersGreatsword());
        aList.add(a1Location);
        //
        Location a2Location = new Location("A2", "CASTLE INTERIOR", Story.a2Story(), EnemyList.stoneskinGargoyle());
        aList.add(a2Location);
        //
        Location a3Location = new Location("A3", "CASTLE COURTYARD", Story.a3Story(), EnemyList.gatekeeperSyek(), ItemList.gateKey());
        aList.add(a3Location);
        //
        Location a4Location = new Location("A4", "DUSKWOOD FOREST", Story.a4Story(), EnemyList.feralDuskwolf());
        aList.add(a4Location);
        //
        Location a5Location = new Location("A5", "NOT ACCESSIBLE", "Something has gone wrong.");
        aList.add(a5Location);
        //
        bList.add(nullLocation);
        //
        Location b1Location = new Location("B1", "CASTLE INTERIOR", Story.b1Story(), EnemyList.stoneskinGargoyle());
        bList.add(b1Location);
        //
        Location b2Location = new Location("B2", "CASTLE INTERIOR", Story.b2Story(), EnemyList.stoneskinGargoyle());
        bList.add(b2Location);
        //
        Location b3Location = new Location("B3", "CASTLE INTERIOR", Story.b3Story(), EnemyList.animatedGuard());
        bList.add(b3Location);
        //
        Location b4lLocation = new Location("B4", "DUSKWOOD FOREST", Story.b4Story(), EnemyList.feralDuskwolf());
        bList.add(b4lLocation);
        //
        Location b5Location = new Location("B5", "DUSKWOOD FOREST", Story.b5Story(), EnemyList.feralDuskwolf());
        bList.add(b5Location);
        //
        cList.add(nullLocation);
        //
        Location c1Location = new Location("C1", "CASTLE CATHEDRAL", Story.c1Story(), EnemyList.animatedGuard());
        cList.add(c1Location);
        //
        Location c2Location = new Location("C2", "DUSKWOOD CLEARING", Story.c2Story());
        cList.add(c2Location);
        //
        Location c3Location = new Location("C3", "DUSKWOOD FOREST", Story.c3Story(), EnemyList.arachnidSpawn());
        cList.add(c3Location);
        //
        Location c4Location = new Location("C4", "DUSKWOOD FOREST", Story.c4Story(), EnemyList.feralDuskwolf());
        cList.add(c4Location);
        //
        Location c5Location = new Location("C5", "DUSKWOOD DEN", Story.c5Story(), EnemyList.alphaDuskwolf(), ItemList.wolfhideArmour());
        cList.add(c5Location);
        //
        dList.add(nullLocation);
        //
        Location d1Location = new Location("D1", "CASTLE CHAMBERS", Story.d1Story(), EnemyList.animatedGuard());
        dList.add(d1Location);
        //
        Location d2Location = new Location("D2", "MYSTIC LAKE", Story.d2Story(), EnemyList.lostMaiden(), ItemList.maidensBlessing());
        dList.add(d2Location);
        //
        Location d3Location = new Location("D3", "DUSKWOOD FOREST", Story.d3Story(), EnemyList.arachnidSpawn());
        dList.add(d3Location);
        //
        Location d4Location = new Location("D4", "DUSKWOOD FOREST", Story.d4Story(), EnemyList.arachnidSpawn());
        dList.add(d4Location);
        //
        Location d5Location = new Location("D5", "DUSKWOOD FOREST", Story.d5Story(), EnemyList.arachnidSpawn());
        dList.add(d5Location);
        //
        eList.add(nullLocation);
        //
        Location e1Location = new Location("E1", "THRONE ROOM", Story.e1Story(), EnemyList.lordEripmav());
        eList.add(e1Location);
        //
        Location e2Location = new Location("E2", "NOT ACCESSIBLE", "Something has gone wrong.");
        eList.add(e2Location);
        //
        Location e3Location = new Location("E3", "TWISTED CAVE", Story.e3Story(), EnemyList.arachnidMatriarch(), ItemList.matriarchsBlood());
        eList.add(e3Location);
        //
        Location e4Location = new Location("E4", "TILLED PLAINS", Story.e4Story());
        eList.add(e4Location);
        //
        Location e5Location = new Location("E5", "OLD TOWN", Story.e5Story());
        eList.add(e5Location);
    }
}

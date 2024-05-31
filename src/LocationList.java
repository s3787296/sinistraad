import java.util.ArrayList;

/**
 * LocationList class contains methods to create and store objects of Location.
 * 
 * @author  Max
 * @author  Jude
 * @version 1.0
 */
public class LocationList {

    /**
     * Arraylist to store location objects a1...a5 at corresponding index.
     */
    public static ArrayList<Location> aList = new ArrayList<Location>();

    /**
     * Arraylist to store location objects b1...b5 at corresponding index.
     */
    public static ArrayList<Location> bList = new ArrayList<Location>();

    /**
     * Arraylist to store location objects c1...c5 at corresponding index.
     */
    public static ArrayList<Location> cList = new ArrayList<Location>();

    /**
     * Arraylist to store location objects c1...c5 at corresponding index.
     */
    public static ArrayList<Location> dList = new ArrayList<Location>();

    /**
     * Arraylist to store location objects e1...e5 at corresponding index.
     */
    public static ArrayList<Location> eList = new ArrayList<Location>();

    /**
     * Method to generate location objects, and store in corresponding arraylist.
     * <p>
     * It creates and sets location objects at corresponding index values.
     * <p>
     * nullLocation() is used as a placeholder for index 0 in each ArrayList as it
     * makes the other indexes in each list easier to work with.
     */
    public static void createLocations() {
        /**
         * Placeholder location with no values.
         */
        Location nullLocation = new Location("NULL", "NULL", "NULL", "NULL");
        //
        aList.add(nullLocation);
        /*
         * Location A1 - Castle Armoury
         */
        Location a1Location = new Location("A1", Map.a1Map(), "CASTLE ARMOURY", Story.a1Story(), EnemyList.forgemasterFuego());
        aList.add(a1Location);
        /**
         * Location A2 - Castle Interior
         */
        Location a2Location = new Location("A2", Map.a2Map(), "CASTLE INTERIOR", Story.a2Story(), EnemyList.stoneskinGargoyle());
        aList.add(a2Location);
        /**
         * Location A3 - Castle Interior
         */
        Location a3Location = new Location("A3", Map.a3Map(), "CASTLE INTERIOR", Story.a3Story(),EnemyList.stoneskinGargoyle());
        aList.add(a3Location);
        /**
         * Location A4 - Castle Courtyard
         */
        Location a4Location = new Location("A4", Map.a4Map(), "CASTLE COURTYARD", Story.a4Story(), EnemyList.gatekeeperSyek());
        aList.add(a4Location);
        /**
         * Location A5 - Endless Fog (Not accessible)
         */
        Location a5Location = new Location("A5", "NULL", "ENDLESS FOG - LOCATION NOT ACCESSIBLE", "Something has gone seriously wrong.");
        aList.add(a5Location);
        //
        bList.add(nullLocation);
        /**
         * Location B1 - Castle Interior
         */
        Location b1Location = new Location("B1", Map.b1Map(), "CASTLE INTERIOR", Story.b1Story(), EnemyList.animatedGuard());
        bList.add(b1Location);
        /**
         * Location B2 - Castle Interior
         */
        Location b2Location = new Location("B2", Map.b2Map(), "CASTLE INTERIOR", Story.b2Story(), EnemyList.animatedGuard());
        bList.add(b2Location);
        /**
         * Location B3 - Castle Cellar
         */
        Location b3Location = new Location("B3", Map.b3Map(), "CASTLE CELLAR", Story.b3Story());
        bList.add(b3Location);
        /**
         * Location B4 - Duskwood Forest
         */
        Location b4lLocation = new Location("B4", Map.b4Map(), "DUSKWOOD FOREST", Story.b4Story(), EnemyList.feralDuskwolf());
        bList.add(b4lLocation);
        /**
         * Location B5 - Duskwood Forest
         */
        Location b5Location = new Location("B5", Map.b5Map(), "DUSKWOOD FOREST", Story.b5Story(), EnemyList.feralDuskwolf());
        bList.add(b5Location);
        //
        // Column C
        cList.add(nullLocation);
        /**
         * Location C1 - Castle Cathedral
         */
        Location c1Location = new Location("C1", Map.c1Map(), "CASTLE CATHEDRAL", Story.c1Story());
        cList.add(c1Location);
        /**
         * Location C2 - Duskwood Clearing
         */
        Location c2Location = new Location("C2", Map.c2Map(), "DUSKWOOD CLEARING", Story.c2Story());
        cList.add(c2Location);
        /**
         * Location C3 - Duskwood Forest
         */
        Location c3Location = new Location("C3", Map.c3Map(), "DUSKWOOD FOREST", Story.c3Story(), EnemyList.lostSpirit());
        cList.add(c3Location);
        /**
         * Location C4 - Duskwood Forest
         */
        Location c4Location = new Location("C4", Map.c4Map(), "DUSKWOOD FOREST", Story.c4Story(), EnemyList.feralDuskwolf());
        cList.add(c4Location);
        /**
         * Location C5 - Duskwood Den
         */
        Location c5Location = new Location("C5", Map.c5Map(), "DUSKWOOD DEN",  Story.c5Story(), EnemyList.alphaDuskwolf());
        cList.add(c5Location);
        //
        // Column D
        dList.add(nullLocation);
        /**
         * Location D1 - Castle Cathedral
         */
        Location d1Location = new Location("D1", Map.d1Map(), "CASTLE CATHEDRAL", Story.d1Story(), EnemyList.animatedGuard());
        dList.add(d1Location);
        /**
         * Location D2 - Mystic Lake
         */
        Location d2Location = new Location("D2", Map.d2Map(), "MYSTIC LAKE", Story.d2Story(), EnemyList.lostMaiden());
        dList.add(d2Location);
        /**
         * Location D3 - Duskwood Forest
         */
        Location d3Location = new Location("D3", Map.d3Map(), "DUSKWOOD FOREST", Story.d3Story(), EnemyList.lostSpirit());
        dList.add(d3Location);
        /**
         * Location D4 - Duskwood Forest
         */
        Location d4Location = new Location("D4", Map.d4Map(), "DUSKWOOD FOREST", Story.d4Story(), EnemyList.arachnidSpawn());
        dList.add(d4Location);
        /**
         * Location D5 - Duskwood Forest
         */
        Location d5Location = new Location("D5", Map.d5Map(), "DUSKWOOD FOREST", Story.d5Story(), EnemyList.arachnidSpawn());
        dList.add(d5Location);
        //
        // Column E
        eList.add(nullLocation);
        /**
         * Location E1 - Throne Room
         */
        Location e1Location = new Location("E1", Map.e1Map(), "THRONE ROOM", Story.e1Story(), EnemyList.countEripmav());
        eList.add(e1Location);
        /**
         * Location E2 - Twisted Mountains (Not accessible)
         */
        Location e2Location = new Location("E2", "NULL", "TWISTED MOUNTAINS - LOCATION NOT ACCESSIBLE", "Something has gone seriously wrong.");
        eList.add(e2Location);
        /**
         * Location E3 - Twisted Cave
         */
        Location e3Location = new Location("E3", Map.e3Map(), "TWISTED CAVE", Story.e3Story(), EnemyList.arachnidMatriarch());
        eList.add(e3Location);
        /**
         * Location E4 - Tilled Plains
         */
        Location e4Location = new Location("E4", Map.e4Map(), "TILLED PLAINS", Story.e4Story());
        eList.add(e4Location);
        /**
         * Location E5 - Old Town
         */
        Location e5Location = new Location("E5", Map.e5Map(), "OLD TOWN", Story.e5Story());
        eList.add(e5Location);
    }
}

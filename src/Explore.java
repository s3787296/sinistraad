public class Explore {
    // method to automate the process of location traversal, combat and adding items
    // any non boss drop item encounters should be added as seperate encounters in
    // encounters class
    private static void combatLocation(Location location, String before, String after) {
        if (Game.player.getCurrentLocation().equals(location)) {
            if (Game.player.getCurrentLocation().getEnemy().getCurHp() <= 0) {
                Misc.clearConsole();
                Game.printLocationInfo();
                if (before != null) {
                    System.out.println(after);
                }
                Misc.continueKey();
                Direction.travel();
            } else {
                Misc.clearConsole();
                Game.printLocationInfo();
                if (before != null) {
                    System.out.println(before);
                }
                Misc.continueKey();
                if (Combat.battle(Game.player.getCurrentLocation().getEnemy())) {
                    Game.player.getPlayerItems().add(Game.player.getCurrentLocation().getItem());
                }
                Misc.clearConsole();
                Game.printLocationInfo();
                if (after != null) {
                    System.out.println(after);
                }
                Misc.continueKey();
                Direction.travel();
            }
        }
    }

    // method to run for locations which have special encounters (farm, clearing,
    // etc)
    private static void encounterLocation(Location location) {
        if (Game.player.getCurrentLocation().equals(location)) {
            Misc.clearConsole();
            Game.printLocationInfo();
            Encounters.playerEncounters(location);
            Misc.continueKey();
            Direction.travel();
        }
    }

    // write a list of explorelocations for each area, include the pre fight text in
    // before, and post fight text in after
    public static void explore() {
        Misc.clearConsole();
        // a1
        combatLocation(LocationList.aList.get(1), null, null);
        // a2
        combatLocation(LocationList.aList.get(2), null, null);
        // a3
        combatLocation(LocationList.aList.get(3), null, null);
        // a4
        combatLocation(LocationList.aList.get(4), null, null);
        // a5
        combatLocation(LocationList.aList.get(5), null, null);
        // b1
        combatLocation(LocationList.bList.get(1), null, null);
        // b2
        combatLocation(LocationList.bList.get(2), null, null);
        // b3
        combatLocation(LocationList.bList.get(3), null, null);
        // b4
        combatLocation(LocationList.bList.get(4), null, null);
        // b5
        combatLocation(LocationList.bList.get(5), null, null);
        // c1
        combatLocation(LocationList.cList.get(1), null, null);
        // c2
        encounterLocation(LocationList.cList.get(2));
        // c3
        combatLocation(LocationList.cList.get(3), null, null);
        // c4
        combatLocation(LocationList.cList.get(4), null, null);
        // c5
        combatLocation(LocationList.cList.get(5), null, null);
        // d1
        combatLocation(LocationList.dList.get(1), null, null);
        // d2
        combatLocation(LocationList.dList.get(2), null, null);
        // d3
        combatLocation(LocationList.dList.get(3), null, null);
        // d4
        combatLocation(LocationList.dList.get(4), null, null);
        // d5
        combatLocation(LocationList.dList.get(5), null, null);
        // e1
        combatLocation(LocationList.eList.get(1), null, null);
        // e2
        combatLocation(LocationList.eList.get(2), null, null);
        // e3
        combatLocation(LocationList.eList.get(3), Story.beforeArachnidStory(), Story.afterArachnidStory());
        // e4
        encounterLocation(LocationList.eList.get(4));
        // e5
        encounterLocation(LocationList.eList.get(5));
    }
}
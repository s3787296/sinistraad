public class Explore {
    // method to automate the process of location traversal, combat and adding items
    // any non boss drop item encounters should be added as seperate encounters in encounters class
    private static void combatLocation(Location location, String before, String after){
        if (Game.player.getCurrentLocation().equals(location)) {
            if (Game.player.getCurrentLocation().getEnemy().getCurHp() <= 0) {
                System.out.println(after);
                Misc.continueKey();
                Direction.travel();
            }
            else{
                System.out.println(before);
                Misc.continueKey();
                if (Combat.battle(Game.player.getCurrentLocation().getEnemy())) {
                    Game.player.getPlayerItems().add(Game.player.getCurrentLocation().getItem());
                }
                System.out.println(after);
                Misc.continueKey();
                Direction.travel();
            }
        }
    }
    
    // method to run for locations which have special encounters (farm, clearing, etc)
    private static void encounterLocation(Location location, String text){
        System.out.println(text);
        Misc.continueKey();
        Encounters.playerEncounters(location);
        Misc.continueKey();
        Direction.travel();
    }




    // write a list of explorelocations for each area, include the pre fight text in before, and post fight text in after
    public static void explore() {
        Misc.clearConsole();
        //a1
        combatLocation(null, null, null);
        //a2
        combatLocation(null, null, null);
        //a3 
        combatLocation(null, null, null);
        //etc
        encounterLocation(null, null);
    }
}
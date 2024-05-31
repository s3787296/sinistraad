/**
 * Explore class automates the process of location traversal, combat and adding
 * items.
 * 
 * @author Max
 * @version 1.0
 */
public class Explore {

    /**
     * Explore method deals with player exploration.
     * <p>
     * Method to automate the process of location traversal, combat, non-combat
     * player encounters, and adding items.
     */
    public static void exploreLocation(Location location) {
        if (location.getEnemy() != null) {
            if (location.getEnemy().getCurHp() <= 0) {
                if (location.getEnemy().getAfter() != null) {
                    Misc.printHeading(location.getEnemy().getAfter());
                }
                Encounters.playerEncounters(location);
                Misc.continueKey();
                Direction.travel();
            } else if (location.getEnemy().getCurHp() > 0) {
                if (location.getEnemy().getBefore() != null) {
                    Misc.printHeading(location.getEnemy().getBefore());
                }
                Misc.continueKey();
                if (location.getEnemy() != null) {
                    Combat.battle(location.getEnemy());
                }
                if (location.getEnemy().getItem() != null) {
                    Game.player.getPlayerItems().add(location.getEnemy().getItem());
                }
                Misc.clearConsole();
                Game.printLocationInfo();
                if (location.getEnemy().getAfter() != null) {
                    Misc.printHeading(location.getEnemy().getAfter());
                }
                Misc.continueKey();
                Direction.travel();
            }
        } else {
            Encounters.playerEncounters(location);
            Misc.continueKey();
            Direction.travel();
        }
    }
}

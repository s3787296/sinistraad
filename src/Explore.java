public class Explore {

    // TODO Variable for enemies
    // Method for exploring locations, incorporating combat
    public static void explore() {
        Misc.clearConsole();
        Misc.printHeading("Location: " + Game.player.getCurrentLocation());
        Game.printLocationInfo();
        Misc.clearConsole();

        // If the enemy matches one from the location's allowed encounters, run the following code
        if (Combat.battle(EnemyList.arachnidSpawn()) == true) {
            // TODO Print pre-battle text
            // TODO Print post-battle text
            Misc.continueKey();
            Direction.travel();
        }
    }
}
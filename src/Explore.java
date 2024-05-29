public class Explore {
    
    // Method to automate the process of location traversal, combat and adding items
    public static void exploreLocation() {
        Misc.clearConsole();
        Game.printLocationInfo();
        if (Game.player.getCurrentLocation().getEnemy() != null) {
            if (Game.player.getCurrentLocation().getEnemy().getCurHp() <= 0) {
                if (Game.player.getCurrentLocation().getEnemy().getAfter() != null) {
                    System.out.println(Game.player.getCurrentLocation().getEnemy().getAfter());
                }
                Misc.continueKey();
                Direction.travel();
            } else if (Game.player.getCurrentLocation().getEnemy().getCurHp() > 0) {
                if (Game.player.getCurrentLocation().getEnemy().getBefore() != null) {
                    System.out.println(Game.player.getCurrentLocation().getEnemy().getBefore());
                }
                Misc.continueKey();
                if (Game.player.getCurrentLocation().getEnemy() != null) {
                    Combat.battle(Game.player.getCurrentLocation().getEnemy());
                }
                if (Game.player.getCurrentLocation().getEnemy().getItem()!= null) {
                    Game.player.getPlayerItems().add(Game.player.getCurrentLocation().getEnemy().getItem());
                }
                Misc.clearConsole();
                Game.printLocationInfo();
                if (Game.player.getCurrentLocation().getEnemy().getAfter() != null) {
                    System.out.println(Game.player.getCurrentLocation().getEnemy().getAfter());
                }
                Misc.continueKey();
                Direction.travel();
            }
        } else {
            Encounters.playerEncounters(Game.player.getCurrentLocation());
            Misc.continueKey();
            Direction.travel();
        }
    }
}
public class Combat {

    // Method to print battle heading and options
    private static void printBattle(Enemy enemy) {
        Misc.clearConsole();
        Misc.printHeading(enemy.getType() + ": " + enemy.getName() + "\nLVL: "+enemy.getLevel()+"\nHP: " + enemy.getCurHp() + "/"+ enemy.getMaxHp() + "\nATK: " + enemy.combatAtk() + "\nDEF: " + enemy.combatDef());
        Misc.printHeading("PLAYER: " + Game.player.getName() + "\nLVL: "+Game.player.getLevel()+"\nHP: " + Game.player.getCurHp() + "/"+ Game.player.getMaxHp() + "\nATK: " + Game.player.combatAtk() + "\nDEF: " + Game.player.combatDef());
        Misc.printHeading("BATTLE");
        System.out.println("[1] Attack\n[2] Item\n[3] Flee");
    }

    // Main battle method
    public static boolean battle(Enemy enemy) {
        // Return variable for post battle use
        boolean victory = false;
        // Main battle loop
        while (true) {
            // Battle heading and options
            printBattle(enemy);
            // Getting player input
            int input = Misc.readInt();
            if (input == 1) {
                // Attack
                int dmgDealt;
                int dmgTaken;
                // Player damage dealt calculation
                dmgDealt = Game.player.combatAtk() - enemy.combatDef();
                if (dmgDealt < 0) {
                    dmgDealt = 0;
                }
                // Player dmg taken calculation
                dmgTaken = enemy.combatAtk() - Game.player.combatDef();
                if (dmgTaken < 0) {
                    dmgTaken = 0;
                }
                // Calc dmg to both parties
                Game.player.setCurHp(Game.player.getCurHp() - dmgTaken);
                enemy.setCurHp(enemy.getCurHp() - dmgDealt);
                // Print the info of this turn
                Misc.clearConsole();
                Misc.printHeading("BATTLE");
                System.out.println("You dealt " + dmgDealt + " damage to the " + enemy.getName() + "!");
                System.out.println("The " + enemy.getName() + " dealt " + dmgTaken + " damage to you!");
                Misc.continueKey();
            }
            // Check if player died
            if (Game.player.getCurHp() <= 0) {
                Game.playerDied();
                victory = true;
                break;
            } else if (enemy.getCurHp() <= 0) {
                // Tell the player they won
                Misc.clearConsole();
                Misc.printHeading("You defeated the " + enemy.getName() + "!");
                System.out.println("You earned " + enemy.getXp() + "XP!");
                Game.player.setXp(Game.player.getXp() + enemy.getXp());
                // Calculate random drops
                boolean addRest = (Math.random() * 5 + 1 <= 2.25);
                int goldEarnt = (int) (Math.random() * enemy.getXp());
                // If player earned rest
                if (addRest) {
                    Game.player.setRests(Game.player.getRests() + 1);
                    System.out.println("You fought well and earned an additional rest.\nRests available: ["
                            + Game.player.getRests() + "]!");
                }
                // If player earned > 0 gold
                if (goldEarnt > 0) {
                    Game.player.setGold(Game.player.getGold() + goldEarnt);
                    System.out.println(
                            "You collect " + goldEarnt + " gold from the " + enemy.getName() + "'s corpse.");
                }
                Misc.continueKey();
                victory = true;
                break;
            } else if (input == 2) {
                // Use potion
                Misc.clearConsole();
                if (Game.player.getPlayerPotions().size() > 0 && Game.player.getCurHp() < Game.player.getMaxHp()) {
                    // Player able to use a potion
                    Misc.printHeading(
                            "Do you want to use a potion? [" + Game.player.getPlayerPotions().size() + "] left.");
                    // Confirm player wants to use a potion
                    System.out.println("[1] Yes\n[2] No");
                    input = Misc.readInt();
                }
                if (input == 1) {
                    // Player takes potion
                    System.out.println("You used a potion and restored "
                            + (Game.player.getMaxHp() - Game.player.getCurHp()) + " health.");
                    Game.player.setCurHp(Game.player.getMaxHp());
                    Game.player.getPlayerPotions().remove(Game.player.getPlayerPotions().get(0));
                    Misc.continueKey();
                } else if (input == 2) {
                    System.out.println("You decided not to use a potion.");
                    Misc.continueKey();
                } else {
                    // Player unable to use a potion
                    Misc.printHeading("You can't do that right now.");
                    Misc.continueKey();
                }
            } else if (input == 3) {
                // Player chooses flee
                // If enemy is not a boss and player wins 50/50
                Misc.clearConsole();
                if (!enemy.getType().equalsIgnoreCase("Boss") && Math.random() * 10 + 1 <= 5.0) {
                    Misc.printHeading("You managed to escape from the " + enemy.getName() + "!");
                    Misc.continueKey();
                    break;
                } else {
                    // If enemy is a boss or player loses 50/50
                    int failedEscape = (int) (Math.random() * 10) + 1;
                    Misc.printHeading("You failed to escape and took " + failedEscape + " damage.");
                    Misc.continueKey();
                    Game.player.setCurHp(Game.player.getCurHp() - failedEscape);
                    // Checking if failed escape dmg kills player
                    if (Game.player.getCurHp() <= 0) {
                        Game.playerDied();
                        break;
                    }
                }
            }
        }
        return victory;
    }
}
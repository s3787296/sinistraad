/**
 * Combat class runs the combat engine.
 * 
 * @author Max
 * @version 0.25
 */
public class Combat {

    /**
     * Method to print battle heading and options.
     * This method is called from {@code Combat#battle(Enemy)}
     * 
     * @param enemy
     */
    private static void printBattle(Enemy enemy) {
        Misc.clearConsole();
        Misc.printHeading(
                enemy.getType() + ": " + enemy.getName() + "\nLVL: " + enemy.getLevel() + "\nHP: " + enemy.getCurHp()
                        + "/" + enemy.getMaxHp() + "\nATK: " + enemy.combatAtk() + "\nDEF: " + enemy.combatDef());
        Misc.printHeading("PLAYER: " + Game.player.getName() + "\nHP: "
                + Game.player.getCurHp() + "/" + Game.player.getMaxHp() + "\nATK: " + Game.player.combatAtk()
                + "\nDEF: " + Game.player.combatDef());
        Misc.printHeading("BATTLE");
        System.out.println("[1] Attack\n[2] Item\n[3] Flee");
    }

    /**
     * Main battle method.
     * 
     * @param enemy   The enemy the player is fighting
     * @param victory Determines whether player has won battle
     * @return victory
     */
    public static boolean battle(Enemy enemy) {
        /**
         * Boolean variable to store victory status.
         */
        boolean victory = false;
        // Main battle loop
        while (true) {
            // Battle heading and options
            printBattle(enemy);
            /**
             * Getting player input for battle option.
             */
            int input = Misc.readInt();
            // Player chooses attack
            if (input == 1) {
                /**
                 * Variable for damage dealt to enemy.
                 */
                int dmgDealt;
                /**
                 * Variable for player damage taken.
                 */
                int dmgTaken;
                // Player damage dealt calculation
                if (Game.player.combatAtk() >= enemy.combatDef()) {
                    dmgDealt = Game.player.combatAtk() + Game.player.combatAtk() - enemy.combatDef();
                } else {
                    dmgDealt = Game.player.combatAtk() * Game.player.combatAtk() / enemy.combatDef();
                }
                // Player damage taken calculation
                if (enemy.combatAtk() <= Game.player.combatDef()) {
                    dmgTaken = enemy.combatAtk() + enemy.combatAtk() - enemy.combatDef();
                } else {
                    dmgTaken = enemy.combatAtk() * enemy.combatAtk() / Game.player.combatDef();
                }
                // Calculate damage to both parties
                Game.player.setCurHp(Game.player.getCurHp() - dmgTaken);
                enemy.setCurHp(enemy.getCurHp() - dmgDealt);
                // Print the results of this turn
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
                /**
                 * Calculates random drops from combat.
                 */
                int goldEarned = (int) (Math.random() * enemy.getXp());
                /**
                 * Calculates whether player earned a rest (25% chance).
                 */
                boolean addRest = (Math.random() * 10 + 1 <= 2.5); // 25% chance
                if (addRest) {
                    Game.player.setRests(Game.player.getRests() + 1);
                    System.out.println("You fought well and earned an additional rest.\nRests available: ["
                            + Game.player.getRests() + "]!");
                }
                // If player earned gold
                if (goldEarned > 0) {
                    Game.player.setGold(Game.player.getGold() + goldEarned);
                    System.out
                            .println("You collect " + goldEarned + " gold from the " + enemy.getName() + "'s corpse.");
                }
                Misc.continueKey();
                victory = true;
                break;
                // Player chooses potion
            } else if (input == 2) {
                Misc.clearConsole();
                // Check if Player able to use a potion
                if (Game.player.getPlayerPotions().size() > 0 && Game.player.getCurHp() < Game.player.getMaxHp()) {
                    // Confirm player wants to use a potion
                    Misc.printHeading(
                            "Do you want to use a potion? [" + Game.player.getPlayerPotions().size() + "] left.");
                    System.out.println("[1] Yes\n[2] No");
                    input = Misc.readInt();
                }
                // Player uses potion
                if (input == 1) {
                    System.out.println("You used a potion and restored "
                            + (Game.player.getMaxHp() - Game.player.getCurHp()) + " health.");
                    Game.player.setCurHp(Game.player.getMaxHp());
                    Game.player.getPlayerPotions().remove(Game.player.getPlayerPotions().get(0));
                    Misc.continueKey();
                    // Player doesn't use potion
                } else if (input == 2) {
                    System.out.println("You decided not to use a potion.");
                    Misc.continueKey();
                }
                // Player unable to use a potion
                else {
                    Misc.printHeading("You can't do that right now.");
                    Misc.continueKey();
                }
            }
            // Player chooses flee
            else if (input == 3) {
                Misc.clearConsole();
                // If enemy is not a boss and player wins 50% chance
                if (!enemy.getType().equalsIgnoreCase("Boss") && Math.random() * 10 + 1 <= 5.0) {
                    Misc.printHeading("You managed to escape from the " + enemy.getName() + "!");
                    Misc.continueKey();
                    break;
                }
                // If enemy is a boss or player loses 50% chance
                else {
                    /**
                     * Calculating damage for failed escape.
                     */
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
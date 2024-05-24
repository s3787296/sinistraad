public class Combat {

    // random encounters
    public static String[] encounters = { "Battle", "Battle", "Battle", "Rest" };

    // enemy names
    public static String[] enemies = { "Enemy1", "Enemy2", "Enemy3", "Enemy4" };

    // print battle heading and options
    public static void printBattle(Enemy enemy) {
        Misc.clearConsole();
        Misc.printHeading(enemy.getName() + "\nHP: " + enemy.getCurHp() + "/" + enemy.getMaxHp());
        Misc.printHeading(Game.player.getName() + "\nHP: " + Game.player.getCurHp() + "/" + Game.player.getMaxHp());
        Misc.printSeperator(20);
        System.out.println("[1] Attack\n[2] Item\n[3] Flee");
    }

    // main battle method
    public static void battle(Enemy enemy) {
        // turn tracker variable
        int turn = 1;
        // main battle loop
        while (true) {
            // battle heading and options
            printBattle(enemy);
            // getting and reacting to player input
            int input = Misc.readInt();
            if (input == 1) {
                // attack
                int dmgDealt;
                int dmgTaken;
                // player damage dealt calculation
                dmgDealt = Game.player.combatAtk() - enemy.combatDef();
                if (dmgDealt < 0) {
                    dmgDealt = 0;
                }
                // player dmg taken calculation
                dmgTaken = Game.player.combatDef() - enemy.combatAtk();
                if (dmgTaken < 0) {
                    dmgTaken = 0;
                }
                // calc dmg to both parties
                Game.player.setCurHp(Game.player.getCurHp() - dmgTaken);
                enemy.setCurHp(enemy.getCurHp() - dmgDealt);
                // print the info of this turn
                Misc.clearConsole();
                Misc.printHeading("BATTLE");
                Misc.printHeading("Turn " + turn);
                System.out.println("You dealt " + dmgDealt + " damage to the " + enemy.getName() + "!");
                System.out.println("The " + enemy.getName() + " dealt " + dmgTaken + " damage to you!");
                Misc.continueKey();
                turn++;
                // check if player died
                if (Game.player.getCurHp() <= 0) {
                    Game.playerDied(); // method to end the game
                    break;
                } else if (enemy.getCurHp() <= 0) {
                    // tell the player they won
                    Misc.clearConsole();
                    Misc.printHeading("You defeated the " + enemy.getName() + "!");
                    // increase player xp
                    System.out.println("You earned " + enemy.getXp() + "XP!");
                    Game.player.setXp(Game.player.getXp() + enemy.getXp());
                    // random drops
                    boolean addRest = (Math.random() * 5 + 1 <= 2.25);
                    int goldEarnt = (int) (Math.random() * enemy.getXp());

                    if (addRest) {
                        Game.player.setRests(Game.player.getRests() + 1);
                        System.out.println("You fought well and earned an additional rest.\nRests available: [" + Game.player.getRests() + "]!");
                    }
                    if (goldEarnt > 0) {
                        Game.player.setGold(Game.player.getGold() + goldEarnt);
                        System.out.println(
                                "You collect " + goldEarnt + " gold from the " + enemy.getName() + "'s corpse.");
                    }
                    Misc.continueKey();
                    break;
                }
            } else if (input == 2) {
                // use potion
                Misc.clearConsole();
                if (Game.player.getPotions() > 0 && Game.player.getCurHp() < Game.player.getMaxHp()) {
                    // player able to use a potion
                    Misc.printHeading("Do you want to use a potion? [" + Game.player.getPotions() + "] left.");
                    // confirm player wants to use a potion
                    System.out.println("[1] Yes\n[2] No");
                    input = Misc.readInt();
                    if (input == 1) {
                        // player takes potion
                        System.out.println("You used a potion and restored " + (Game.player.getMaxHp() - Game.player.getCurHp()) + " health.");
                        Game.player.setCurHp(Game.player.getMaxHp());
                        Misc.continueKey();
                    } else if (input == 2) {
                        System.out.println("You decided not to use a potion.");
                        Misc.continueKey();
                    }
                } else {
                    // player unable to use a potion
                    Misc.printHeading("You can't do that right now.");
                    Misc.continueKey();
                }
            } else if (input == 3) {
                // flee
                Misc.clearConsole();
                // 50% chance to escape
                if (Math.random() * 10 + 1 <= 5.0) {
                    Misc.printHeading("You managed to escape from the " + enemy.getName() + "!");
                    Misc.continueKey();
                    break;
                } else {
                    int failedEscape = enemy.combatAtk() - Game.player.combatDef();
                    Misc.printHeading("You failed to escape and took " + failedEscape + " damage.");
                    Misc.continueKey();
                    // checking if failed escape dmg kills player
                    if (Game.player.getCurHp() <= 0) {
                        Game.playerDied();
                    }
                }
            }
        }
    }
}
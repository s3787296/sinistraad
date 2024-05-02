public class Combat {

    // random encounters
    public static String[] encounters = { "Battle", "Battle", "Battle", "Rest" };

    // enemy names
    public static String[] enemies = { "Enemy1", "Enemy2", "Enemy3", "Enemy4" };

    // main battle method
    public static void battle(Enemy enemy) {
        // turn tracker variable
        int turn = 1;
        // main battle loop
        while (true) {
            Game.clearConsole();
            Game.printHeading(enemy.name + "\nHP: " + enemy.curHp + "/" + enemy.maxHp);
            Game.printHeading(Game.player.name + "\nHP: " + Game.player.curHp + "/" + Game.player.maxHp);
            Game.printSeperator(20);
            System.out.println("[1] Attack\n[2] Item\n[3] Flee");
            int input = Game.readInt();
            // reacting to player input
            if (input == 1) {
                // attack
                int dmgDealt;
                int dmgTaken;
                // player damage dealt calculation
                dmgDealt = Game.player.attack() - enemy.defence();
                if (dmgDealt < 0) {
                    dmgDealt = 0;
                }
                // player dmg taken calculation
                dmgTaken = enemy.attack() - Game.player.defence();
                if (dmgTaken < 0) {
                    dmgTaken = 0;
                }
                // calc dmg to both parties
                Game.player.curHp -= dmgTaken;
                enemy.curHp -= dmgDealt;
                // print the info of this turn
                Game.clearConsole();
                Game.printHeading("BATTLE");
                Game.printHeading("Turn " + turn);
                System.out.println("You dealt " + dmgDealt + " damage to the " + enemy.name + "!");
                System.out.println("The " + enemy.name + " dealt " + dmgTaken + " damage to you!");
                Game.continueKey();
                turn++;
                // check if player died
                if (Game.player.curHp <= 0) {
                    Game.playerDied(); // method to end the game
                    break;
                } else if (enemy.curHp <= 0) {
                    // tell the player they won
                    Game.clearConsole();
                    Game.printHeading("You defeated the " + enemy.name + "!");
                    // increase player xp
                    System.out.println("You earned " + enemy.xp + "XP!");
                    Game.player.xp += enemy.xp;
                    // random drops
                    boolean addRest = (Math.random() * 5 + 1 <= 2.25);
                    int goldEarnt = (int) (Math.random() * enemy.xp);

                    if (addRest) {
                        Game.player.rests++;
                        System.out.println("You fought well and earned an additional rest.\nRests available: ["
                                + Game.player.rests + "]!");
                    }
                    if (goldEarnt > 0) {
                        Game.player.gold += goldEarnt;
                        System.out.println("You collect " + goldEarnt + " gold from the " + enemy.name + "'s corpse.");
                    }
                    Game.continueKey();
                    break;
                }
            } else if (input == 2) {
                // use potion
                Game.clearConsole();
                if (Game.player.potions > 0 && Game.player.curHp < Game.player.maxHp) {
                    // player able to use a potion
                    Game.printHeading("Do you want to use a potion? [" + Game.player.potions + "] left.");
                    // confirm player wants to use a potion
                    System.out.println("[1] Yes\n[2] No");
                    input = Game.readInt();
                    if (input == 1) {
                        // player takes potion
                        System.out.println("You used a potion and restored " + (Game.player.maxHp - Game.player.curHp)
                                + " health.");
                        Game.player.curHp = Game.player.maxHp;
                        Game.continueKey();
                    } else if (input == 2) {
                        System.out.println("You decided not to use a potion.");
                        Game.continueKey();
                    }
                } else {
                    // player unable to use a potion
                    Game.printHeading("You can't do that right now.");
                    Game.continueKey();
                }
            } else if (input == 3) {
                // flee
                Game.clearConsole();
                // 50% chance to escape
                if (Math.random() * 10 + 1 <= 5.0) {
                    Game.printHeading("You managed to escape from the " + enemy.name + "!");
                    Game.continueKey();
                    break;
                } else {
                    int failedEscape = enemy.attack() - Game.player.defence();
                    Game.printHeading("You failed to escape and took " + failedEscape + " damage.");
                    Game.continueKey();
                    // checking if failed escape dmg kills player
                    if (Game.player.curHp <= 0) {
                        Game.playerDied();
                    }
                }
            }
        }
    }
}
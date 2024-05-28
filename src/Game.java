public class Game {

    public static Player player;
    public static boolean isRunning;

    // method to start the game
    public static void newGame() {
        // printing game title screen
        printGameTitle();
        // getting player name input
        playerNameSet();
        // move to game options menu
        gameOptions();
    }

    // method to get player name
    public static void playerNameSet() {
        String name;
        Boolean nameSet = false;
        // loop to get player name
        do {
            Misc.clearConsole();
            Misc.printHeading("What's your name?");
            name = Misc.scanner.next();
            // confirming player choice
            do {
                Misc.clearConsole();
                Misc.printHeading("Your name is " + name + ".\nIs that correct?");
                System.out.println("[1] Yes!\n[2] No, let me change it.");
                int input = Misc.readInt();
                if (input == 1) {
                    nameSet = true;
                    break;
                } else if (input == 2) {
                    nameSet = false;
                    break;
                }
            } while (!nameSet);
        } while (!nameSet);
        // creating map location objects
        LocationList.createLocations();
        // create new player object with name input
        player = new Player(name);
    }

    public static void printRestMenu() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER RESTS");
        System.out.println("Do you want to take a rest? (You have " + Game.player.getRests() + " rest(s) left.)");
        System.out.println("[1] Yes\n[2] No, not now.");
    }

    public static void restOptions() {
        while (true) {
            if (Game.player.getRests() > 0) {
                printRestMenu();
                int input = Misc.readInt();
                if (input == 1) {
                    // player takes rest
                    if (Game.player.getCurHp() < Game.player.getMaxHp()) {
                        Misc.clearConsole();
                        int hpRestored = ((Game.player.getMaxHp() - Game.player.getCurHp()) / 2);
                        System.out.println("\nYou took a rest and restored " + hpRestored + " health.");
                        Game.player.setCurHp(Game.player.getCurHp() + hpRestored);
                        System.out.println("You're now at " + Game.player.getCurHp() + "/" + Game.player.getMaxHp() + " health.");
                        Game.player.setRests(Game.player.getRests() - 1);
                        Misc.continueKey();
                        break;
                    } else {
                        System.out.println("\nYou're at full health. You don't need to rest right now.");
                        Misc.continueKey();
                        break;
                    }
                } else if (input == 2) {
                    break;
                }
            } else {
                Misc.clearConsole();
                printLocationInfo();
                System.out.println("\nYou cannot do that right now.");
                Misc.continueKey();
            }
        }
    }

    // print title screen
    public static void printGameTitle() {
        Misc.clearConsole();
        Misc.printSeperator(40);
        Misc.printHeading("SINISTRAAD, A TEXT BASED RPG\nDESIGNED BY JUDE, AMELIA & MAX");
        Misc.printSeperator(40);
        Misc.continueKey();
    }

    // printing the game menu
    public static void printGameMenu() {
        Misc.clearConsole();
        Misc.printHeading("GAME MENU");
        System.out.println("Choose an Option:");
        System.out.println("[1] Start Game");
        System.out.println("[2] Game Info");
        System.out.println("[3] Quit Game");
    }
    
    // transition method to start the game
    public static void gameStart() {
        isRunning = true;
        playerOptions();
    }

    public static void gameInfo() {
        // about game info stuff
    }

    // printing the ingame player menu
    public static void printPlayerMenu() {
        Misc.clearConsole();
        printLocationInfo();
        Misc.printHeading("PLAYER MENU");
        System.out.println("Choose an Option:");
        System.out.println("[1] Interact");
        System.out.println("[2] Travel");
        System.out.println("[3] Player");
        System.out.println("[4] Bag");
        System.out.println("[5] Rest");
        System.out.println("[6] Exit");
    }

    // printing character sheet info
    public static void playerInfo() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER INFO");
        System.out.println("Name: " + player.getName() + "\tHP: " + player.getCurHp() + "/" + player.getMaxHp());
        Misc.printSeperator(30);
        System.out.println("XP: " + player.getXp() + "\tGold: " + player.getGold());
        Misc.printSeperator(25);
        System.out.println("Potions: " + player.getPotions() + "\tRests: " + player.getPotions());
        Misc.printSeperator(25);
        System.out.println("Weapon Damage: " + player.getWeaponAtk() + "\tArmour Defence: " + player.getArmourDef());
        Misc.continueKey();
    }

    // method called when player dies
    public static void playerDied() {
        Misc.clearConsole();
        Misc.printHeading("You Died...");
        Misc.printHeading("You earned " + player.getXp() + " XP on your Adventure.");
        Misc.continueKey();
        gameQuit();
    }

    // game quit and close method
    public static void gameQuit() {
        Misc.clearConsole();
        System.out.println("\nThank you for playing!");
        Misc.continueKey();
        System.exit(0);
    }

    // game menu loop
    public static void gameOptions() {
        while (true) {
            printGameMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    gameStart();
                    break;
                case 2:
                    gameInfo();
                    break;
                case 3:
                    gameQuit();
                    break;
            }
        }
    }

    // player menu loop
    public static void playerOptions() {
        while (isRunning) {
            printPlayerMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    Combat.battle(EnemyList.gatekeeperSyek());
                    break;
                case 2:
                    Direction.travel();
                    break;
                case 3:
                    playerInfo();
                    break;
                case 4:
                    bagOptions();
                    break;
                case 5:
                    restOptions();
                    break;
                case 6:
                    gameOptions();
                    break;
            }
        }
    }

    public static void printBagMenu() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER BAG");
        System.out.println("Select option:");
        System.out.println("[1] View Items");
        System.out.println("[2] Add Item"); // testing purposes
        System.out.println("[3] Drop Item"); // testing purposes
        System.out.println("[4] Pickup Item");
        System.out.println("[5] Location Items"); // testing purposes
        System.out.println("[6] Exit");
    }

    public static void bagOptions() {
        while (true) {
            printBagMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    printPlayerItems();
                    break;
                case 2:
                    Game.player.getPlayerItems().add(ItemList.herosSword());
                    break;
                case 3:
                    player.dropItem(player.getPlayerItems().get(0));
                    break;
                case 4:
                    player.pickupItem(player.getCurrentLocation().getLocationItems().get(0));
                    break;
                case 5:
                    player.getCurrentLocation().getLocationItems().toString();
                    Misc.continueKey();
                    break;
                case 6:
                    playerOptions();
                    break;

            }
        }
    }

    // printing players inventory items
    public static void printPlayerItems() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER ITEMS");
        for (int i = 0; i < Game.player.getPlayerItems().size(); i++) {
            Misc.printHeading("Item: " + (i + 1));
            System.out.println("Name: " + Game.player.getPlayerItems().get(i).getName());
            System.out.println("Type: " + Game.player.getPlayerItems().get(i).getType());
            System.out.println("Desc: " + Game.player.getPlayerItems().get(i).getDesc());
            System.out.println("Buff: " + Game.player.getPlayerItems().get(i).getBuff());
        }
        Misc.continueKey();
    }

    // printing general location info
    public static void printLocationInfo() {
        Misc.printSeperator(30);
        System.out.println(Game.player.getCurrentLocation().getName());
        System.out.println(Game.player.getCurrentLocation().getArea());
        System.out.println(Game.player.getCurrentLocation().getDesc());
        Misc.printSeperator(30);
    }
}

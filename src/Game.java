public class Game {

    // Declaring class variables
    public static Player player;
    public static boolean isRunning;

    // Method to start the game
    public static void newGame() {
        // Print game title screen
        printGameTitle();
        // Call method to get & set player name
        playerNameSet();
        // Move to game options menu
        gameOptions();
    }

    // Method to get player name
    public static void playerNameSet() {
        String name;
        Boolean nameSet = false;
        // Loop to get player name
        do {
            Misc.clearConsole();
            Misc.printHeading("What's your name?");
            name = Misc.scanner.next();
            // Confirming player choice
            do {
                Misc.clearConsole();
                Misc.printHeading("Your name is " + name + ".\n");
                // Misc.sleep(600);
                Misc.clearConsole();
                Misc.printHeading("Your name is " + name + ".\nIs that correct?");
                // Misc.sleep(400);
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
        // Create new player object with name input
        player = new Player(name);
    }

    // Print rest menu
    public static void printRestMenu() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER RESTS");
        System.out.println("Do you want to take a rest? (You have " + Game.player.getRests() + " rest(s) left.)");
        System.out.println("[1] Yes\n[2] No, not now.");
    }

    // Rest options loop
    public static void restOptions() {
        while (true) {
            if (Game.player.getRests() > 0) {
                printRestMenu();
                int input = Misc.readInt();
                if (input == 1) {
                    // Player takes rest
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

    // Print title screen
    public static void printGameTitle() {
        Misc.clearConsole();
        Misc.titleArt();
        Misc.continueKey();
    }

    // Printing the game menu
    public static void printGameMenu() {
        Misc.clearConsole();
        Misc.printHeading("GAME MENU");
        System.out.println("Choose an Option:");
        System.out.println("[1] Start Game");
        System.out.println("[2] Game Info");
        System.out.println("[3] Quit Game");
    }
    
    // Transition method to start the game
    public static void gameStart() {
        // Creating map location objects
        LocationList.createLocations();
        player.setCurrentLocation(LocationList.eList.get(5));
        player.neuter();
        isRunning = true;
        playerOptions();
    }

    public static void gameInfo() {
        // TODO about game info stuff (Amelia)
        Misc.clearConsole();
        Misc.printHeading("GAME INFO");
        Misc.InfoString();
        Misc.printSeperator(25);
        Misc.continueKey();

    }

    // Printing the ingame player menu
    public static void printPlayerMenu() {
        Misc.clearConsole();
        printLocationInfo();
        Misc.printHeading("PLAYER MENU");
        System.out.println("Choose an Option:");
        System.out.println("[1] Explore");
        System.out.println("[2] Player");
        System.out.println("[3] Map");
        System.out.println("[4] Bag");
        System.out.println("[5] Rest");
        System.out.println("[6] Exit");
    }

    // Printing character sheet info
    public static void playerInfo() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER INFO");
        System.out.println("Name: " + player.getName() + "\tHP: " + player.getCurHp() + "/" + player.getMaxHp());
        Misc.printSeperator(30);
        System.out.println("XP: " + player.getXp() + "\tGold: " + player.getGold());
        Misc.printSeperator(25);
        System.out.println("Potions: " + player.getPlayerPotions().size() + "\tRests: " + player.getRests());
        Misc.printSeperator(25);
        System.out.println("Weapon Damage: " + player.getWeaponAtk() + "\tArmour Defence: " + player.getArmourDef());
        Misc.continueKey();
    }

    // Method called when player dies
    public static void playerDied() {
        Misc.clearConsole();
        Misc.printHeading("You Died...");
        Misc.printHeading("You earned " + player.getXp() + " XP on your Adventure.");
        Misc.continueKey();
        gameQuit();
    }

    // Game quit and close method
    public static void gameQuit() {
        Misc.clearConsole();
        System.out.println("\nThank you for playing!");
        Misc.continueKey();
        System.exit(0);
    }

    // Game menu loop
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

    // Player menu loop
    public static void playerOptions() {
        while (isRunning) {
            printPlayerMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    // [1] Explore
                    Explore.exploreLocation();
                    break;
                case 2:
                    // [2] Player
                    playerInfo();
                    break;
                case 3:
                    // [3] Map
                    System.out.println(Game.player.getCurrentLocation().getMap());
                    Misc.continueKey();
                    break;
                case 4:
                    // [4] Bag
                    bagOptions();
                    break;
                case 5:
                    // [5] Rest
                    restOptions();
                    break;
                case 6:
                    // [6] Exit
                    gameOptions();
                    break;
            }
        }
    }

    // Method to print the player's bag menu
    public static void printBagMenu() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER BAG");
        System.out.println("Select option:");
        System.out.println("[1] View Items");
        System.out.println("[2] Drop Item"); 
        System.out.println("[3] Pickup Item");
        System.out.println("[4] Location items"); 
        System.out.println("[5] View Potions");
        System.out.println("[6] Exit");
    }

    // Method to display bag menu loop
    public static void bagOptions() {
        boolean viewbag = true;
        while (viewbag) {
            printBagMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    // [1] View Items
                    printPlayerItems();
                    break;
                case 2:
                    // [2] Drop Item
                    player.dropItem(player.getPlayerItems().get(0));
                    break;
                case 3:
                    // [3] Pickup Item
                    player.pickupItem(player.getCurrentLocation().getLocationItems().get(0));
                    break;
                case 4:
                    // [4] Location Items
                    player.getCurrentLocation().getLocationItems().toString();
                    Misc.continueKey();
                    break;
                case 5:
                    // [5] View Potions
                    printPlayerPotions();
                    break;
                case 6:
                    // [6] Exit
                    playerOptions();
                    break;
            }
        }
    }

    // [1] View items in bag
    public static void printPlayerItems() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER ITEMS");
        for (int i = 0; i < player.getPlayerItems().size(); i++) {
            Misc.printHeading("Item: " + (i + 1));
            System.out.println("Name: " + player.getPlayerItems().get(i).getName());
            System.out.println("Type: " + player.getPlayerItems().get(i).getType());
            System.out.println("Desc: " + player.getPlayerItems().get(i).getDesc());
            System.out.println("Buff: " + player.getPlayerItems().get(i).getBuff());
        }
        Misc.continueKey();
    }

    // [5] View potions in bag
    public static void printPlayerPotions() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER POTIONS");
        for (int i = 0; i < Game.player.getPlayerPotions().size(); i++) {
            Misc.printHeading("Item: " + (i + 1));
            System.out.println("Name: " + player.getPlayerPotions().get(i).getName());
            System.out.println("Type: " + player.getPlayerPotions().get(i).getType());
            System.out.println("Desc: " + player.getPlayerPotions().get(i).getDesc());
            System.out.println("Buff: " + player.getPlayerPotions().get(i).getBuff());
        }
        Misc.continueKey();
    }

    // Printing general location info
    public static void printLocationInfo() {
        Misc.printSeperator(100);
        System.out.println(Game.player.getCurrentLocation().getArea());
        System.out.println(Game.player.getCurrentLocation().getStory());
    }
}

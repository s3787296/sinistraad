/**
 * Game class contains all methods related to the main game cycle.
 * 
 * @author  Max
 * @author  Jude
 * @author  Amelia
 * TODO (Pre-push: Update version)
 * @version 0.38
 */
public class Game {

    /**
     * player creates object of Player class.
     */
    public static Player player;
    /**
     * isRunning is used to store the game state.
     */
    public static boolean isRunning;

    /**
     * newGame method within {@code Game#} class.
     * Calls methods to:
     * 1. Start the game,
     * 2. Set the player name,
     * 3. Move to the game options menu.
     */
    public static void newGame() {
        // Print game title screen
        printGameTitle();
        // Call method to get & set player name
        playerNameSet();
        // Move to game options menu
        gameOptions();
    }

    /**
     * Method to get and confirm player name and create new player.
     * 
     * @param name    player name
     * @param nameSet Whether player has confirmed their name
     * @param player  New instance of Player(name)
     */
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

    /**
     * Print rest menu.
     */
    public static void printRestMenu() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER RESTS");
        System.out.println("Do you want to take a rest? (You have " + Game.player.getRests() + " rest(s) left.)");
        System.out.println("[1] Yes\n[2] No, not now.");
    }

    /**
     * Rest options loop
     */
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
                        System.out.println(
                                "You're now at " + Game.player.getCurHp() + "/" + Game.player.getMaxHp() + " health.");
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
                break;
            }
        }
    }

    /**
     * Print game title screen method
     */
    public static void printGameTitle() {
        Misc.clearConsole();
        Misc.titleArt();
        Misc.continueKey();
    }

    /**
     * Print game menu method.
     */
    public static void printGameMenu() {
        Misc.clearConsole();
        Misc.printHeading("GAME MENU");
        System.out.println("Choose an Option:");
        System.out.println("[1] Start Game");
        System.out.println("[2] Game Info");
        System.out.println("[3] Quit Game");
    }

    /**
     * Transition method to start the game and create objects of the map locations.
     */
    public static void gameStart() {
        LocationList.createLocations();
        player.setCurrentLocation(LocationList.eList.get(5));
        player.getPlayerItems().add(ItemList.herosGarb());
        isRunning = true;
        playerOptions();
    }

    /**
     * Method to display game info/help information.
     */
    public static void gameInfo() {
        Misc.clearConsole();
        Misc.printHeading("GAME INFO");
        Misc.InfoString();
        Misc.printSeparator(25);
        Misc.continueKey();
    }

    /**
     * This method quits and closes the game.
     * This is called from {@code Game#gameOptions(3)} method, and
     * is called from {@code Game#playerDied()} method when player dies
     */
    public static void gameQuit() {
        Misc.clearConsole();
        System.out.println("\nThank you for playing!");
        Misc.continueKey();
        System.exit(0);
    }

    /**
     * Game menu loop
     */
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

/**
     * Method to print the ingame player menu
     */
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

    /**
     * Player menu loop
     */
    public static void playerOptions() {
        while (isRunning) {
            printPlayerMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    // [1] Explore
                    playerExplore();
                    break;
                case 2:
                    // [2] Player
                    playerInfo();
                    break;
                case 3:
                    // [3] Map
                    printMapInfo();
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

    /**
     * Method to call exploreLocation method using player currentLocation variable
     */
    public static void playerExplore(){
        Misc.clearConsole();
        Game.printLocationInfo();
        Game.player.checkBonus();
        Explore.exploreLocation(Game.player.getCurrentLocation());
    }

    /**
     * Method to print character sheet info
     */
    public static void playerInfo() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER INFO");
        System.out.println("Name: " + player.getName() + "\tHP: " + player.getCurHp() + "/" + player.getMaxHp());
        Misc.printSeparator(30);
        System.out.println("LVL: " + player.getLevel() + "\tGold: " + player.getGold());
        Misc.printSeparator(25);
        System.out.println("Potions: " + player.getPlayerPotions().size() + "\tRests: " + player.getRests());
        Misc.printSeparator(25);
        System.out.println("Weapon Damage: " + player.getWeaponAtk() + "\tArmour Defense: " + player.getArmourDef());
        Misc.continueKey();
    }

    /**
     * Print current location map information.
     */
    public static void printMapInfo(){
        if (!Misc.containsItem("Hero's Map")) {
            System.out.println("You can't do that without a map.");
        }
        else{
            System.out.println(Game.player.getCurrentLocation().getMap());
        }
        Misc.continueKey();
    }

    /**
     * Method to print the player's bag menu
     */
    public static void printBagMenu() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER BAG");
        System.out.println("Select option:");
        System.out.println("[1] View Potions");
        System.out.println("[2] Use Potion");
        System.out.println("[3] View Items");
        System.out.println("[4] Drop Item");
        System.out.println("[5] Pickup Item");
        System.out.println("[6] Exit");
    }

    /**
     * Method to display bag menu loop.
     * 
     * @param viewBag While player is viewing their bag
     */
    public static void bagOptions() {
        boolean viewBag = true;
        while (viewBag) {
            printBagMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    // [1] View Potions
                    printPlayerPotions();
                    break;
                case 2:
                    // [2] Use Potions
                    playerUsePotion();
                    break;
                case 3:
                    // [3] View Items
                    printPlayerItems();
                    break;
                case 4:
                    // [4] Drop Items
                    playerDropItem();
                    break;
                case 5:
                    // [5] Pickup Item
                    playerPickupItem();
                    break;
                case 6:
                    // [6] Exit
                    playerOptions();
                    break;
            }
        }
    }

    /**
     * Player pickup item handler method
     */
    public static void playerPickupItem() {
        if (player.getCurrentLocation().getLocationItems().size() > 0) {
            Item pickupItem = player.getCurrentLocation().getLocationItems().get(0);
            player.pickupItem(pickupItem);
            System.out.println("\nYou picked up the " + pickupItem.getName() + ".");
        } else {
            System.out.println("\nNo items in this location available to pickup.");
        }
        Misc.continueKey();
    }

    /**
     * Player drop item handler method
     */
    public static void playerDropItem() {
        if (player.getPlayerItems().size() > 0) {
            Item dropItem = player.getPlayerItems().get(0);
            player.dropItem(dropItem);
            System.out.println("\nYou dropped the " + dropItem.getName() + ".");
        } else {
            System.out.println("\nNo items available to drop.");
        }
        Misc.continueKey();
    }

    /**
     * View items in bag
     */
    public static void printPlayerItems() {
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

    /**
     * View potions in bag
     */
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

    /**
     * Method to use potion in bag and heal player to full, printing amount restored
     */
    public static void playerUsePotion() {
        while (true) {
            if (player.getPlayerPotions().size() > 0) {
                if (Game.player.getCurHp() < Game.player.getMaxHp()) {
                    Misc.printHeading("Do you want to use a potion? [" + Game.player.getPlayerPotions().size() + "] left.");
                    System.out.println("[1] Yes\n[2] No");
                    int input = Misc.readInt();
                    if (input == 1) {
                        System.out.println("You used a potion and restored "+ (Game.player.getMaxHp() - Game.player.getCurHp()) + " health.");
                        Game.player.setCurHp(Game.player.getMaxHp());
                        Game.player.getPlayerPotions().remove(Game.player.getPlayerPotions().get(0));
                        Misc.continueKey();
                        return;
                    }
                    if (input == 2) {
                        return;
                    }
                }
            }
            else {
                System.out.println("You can't do that right now.");
                Misc.continueKey();
                break;
            }
        }
    }

    /**
     * Print general location information.
     */
    public static void printLocationInfo() {
        Misc.printSeparator(100);
        System.out.println(Game.player.getCurrentLocation().getArea());
        System.out.println(Game.player.getCurrentLocation().getStory());
    }

    /**
     * Method called when player dies.
     * If the player was defeated by Count Eripmav, it calls the
     * {@code Story#badEndingStory()} method.
     * When the player dies, it displays an end screen message.
     */
    public static void playerDied() {
        Misc.clearConsole();
        if (Game.player.getCurrentLocation().equals(LocationList.eList.get(5))) {
            if (Game.player.getCurrentLocation().getEnemy().getCurHp() > 0) {
                Misc.printHeading(Story.badEndingStory());
            }
        } else {
            Misc.printHeading("You Died...");
            Misc.printHeading("You earned " + player.getXp() + " XP on your Adventure.");
        }
        Misc.continueKey();
        gameQuit();
    }
}

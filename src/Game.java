public class Game {
    
    public static Player player;
    public static boolean isRunning;

    // method to start the game
    public static void startGame() {
        // printing game title
        printGameTitle();
        // getting player name
        playerNameSet();
        // start main game loop
        gameMenu();
    }

    // method to get player name 
    public static void playerNameSet(){
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
        // create new player object with input name
        player = new Player(name);
        // setting isRunning to false to move to game menu
        isRunning = false;
    }

    // method to create a random battle
    public static void enemyBattle() {
        Misc.clearConsole();
        Misc.printHeading("\nYou're attacked by an evil creature. You'll have to fight it!");
        Misc.continueKey();
        // creating new enemy with random name
        Combat.battle(new Enemy(Combat.enemies[(int) (Math.random() * Combat.enemies.length)], player.getXp()));
    }

    // method to create a boss battle
    public static void bossBattle() {
        // Combat.battle(new Boss)
    }

    public static void takeRest() {
        do {
            Misc.clearConsole();
            Misc.printHeading("Do you want to take a rest? (You have " + Game.player.getRests() + " rest(s) left.)");
            System.out.println("[1] Yes\n[2] No, not now.");
            int input = Misc.readInt();
            if (input == 1) {
                // player takes rest
                Misc.clearConsole();
                if (Game.player.getCurHp() < Game.player.getMaxHp()) {
                    int hpRestored = ((Game.player.getMaxHp() - Game.player.getCurHp()) / 2);
                    System.out.println("\nYou took a rest and restored " + hpRestored + " health.");
                    Game.player.setCurHp(Game.player.getCurHp()+ hpRestored);
                    System.out.println("You're now at " + Game.player.getCurHp() + "/" + Game.player.getMaxHp() + " health.");
                    Game.player.setRests(Game.player.getRests() - 1);
                    Misc.continueKey();
                    break;
                } else {
                    System.out.println("You're at full health. You don't need to rest right now.");
                    Misc.continueKey();
                    break;
                }
            } else if (input == 2) {
                System.out.println("\nYou decide not to take a rest right now. ");
                Misc.continueKey();
                break;
            }
        } while (Game.player.getRests() > 0);
    }

    // print title screen
    public static void printGameTitle() {
        Misc.clearConsole();
        Misc.printSeperator(40);
        Misc.printHeading("SINISTRAAD, A TEXT BASED RPG\nDESIGNED BY JUDE, AMELIA & MAX");
        Misc.printSeperator(40);
        Misc.continueKey();
    }

    // printing the main menu
    public static void printGameMenu() {
        Misc.clearConsole();
        Misc.printHeading("GAME MENU");
        System.out.println("Choose an Option:");
        Misc.printSeperator(30);
        System.out.println("[1] Continue Game");
        System.out.println("[2] Game Info");
        System.out.println("[3] Quit Game");
    }

    // printing the ingame player menu
    public static void printPlayerMenu() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER MENU");
        System.out.println("Choose an Option:");
        Misc.printSeperator(30);
        System.out.println("[1] Explore");
        System.out.println("[2] Travel");
        System.out.println("[3] Inventory");
        System.out.println("[4] Player");
        System.out.println("[5] Rest");
        System.out.println("[6] Exit");
    }

    // transition method from game menu to player menu
    public static void continueGame() {
        isRunning = true;
        playerMenu();
    }

    public static void gameInfo() {
        // about game info stuff
    }

    // printing character sheet info
    public static void playerInfo() {
        Misc.clearConsole();
        Misc.printHeading("PLAYER INFO:");
        System.out.println("Name: " + player.getName() + "\tHP: " + player.getCurHp() + "/" + player.getMaxHp());
        Misc.printSeperator(30);
        System.out.println("XP: " + player.getXp() + "\tGold: " + player.getGold());
        Misc.printSeperator(25);
        System.out.println("Potions: " + player.getPotions() + "\tRests: " + player.getPotions());
        Misc.printSeperator(25);
        System.out.println("Weapon Damage: "+player.getWeaponAtk() + "\tArmour Defence: "+player.getArmourDef());
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
        System.out.println("Thank you for playing!");
        Misc.continueKey();
        System.exit(0);
    }

    // main game menu loop
    public static void gameMenu() {
        while (!isRunning) {
            printGameMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    continueGame();
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

    // main player menu loop
    public static void playerMenu() {
        while (isRunning) {
            printPlayerMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    enemyBattle();
                    break;
                case 2:
                    Direction.travel();
                    break;
                case 3:
                    inventoryMenu();
                    break;
                case 4:
                    playerInfo();
                    break;
                case 5:
                    takeRest();
                    break;
                case 6:
                    isRunning = false;
                    gameMenu();
                    break;
            }
        }
    }
    
    public static void printInventoryMenu(){
        Misc.clearConsole();
        Misc.printHeading("Inventory Menu");
        System.out.println("Select option:");
        System.out.println("[1] View Items");
        System.out.println("[2] Add Item"); // testing purposes
        System.out.println("[3] Exit");
    }

    public static void inventoryMenu(){
        while (true) {
            printInventoryMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    Inventory.printInventory();
                    break;
                case 2:
                    ItemList.herosSword();
                    break;
                case 3:
                    playerMenu();
                    break;
            }
        }
    }
}

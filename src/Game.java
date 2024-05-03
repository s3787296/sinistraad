import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;

    // method to start the game
    public static void startGame() {
        String name;
        Boolean nameSet = false;
        // printing game title
        printGameTitle();
        // getting player name
        do {
            clearConsole();
            printHeading("What's your name?");
            name = scanner.next();
            // confirming player choice
            do {
                clearConsole();
                printHeading("Your name is " + name + ".\nIs that correct?");
                System.out.println("[1] Yes!\n[2] No, let me change it.");
                int input = readInt();
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
        // setting isRunning to true so the game loop can begin
        isRunning = false;
        // start main game loop
        gameMenu();
    }

    // creating a random battle
    public static void enemyBattle() {
        Game.clearConsole();
        Game.printHeading("You're attacked by an evil creature. You'll have to fight it!");
        Game.continueKey();
        // creating new enemy with random name
        Combat.battle(
                new Enemy(Combat.enemies[(int) (Math.random() * Combat.enemies.length)], player.xp));
    }

    public static void bossBattle() {
        // Combat.battle(new Boss)
    }

    public static void takeRest() {
        do {
            clearConsole();
            printHeading("Do you want to take a rest? (You have " + Game.player.rests + " rest(s) left.)");
            System.out.println("[1] Yes\n[2] No, not now.");
            int input = readInt();
            if (input == 1) {
                // player takes rest
                clearConsole();
                if (Game.player.curHp < Game.player.maxHp) {
                    int hpRestored = ((Game.player.maxHp - Game.player.curHp) / 2);
                    System.out.println("You took a rest and restored " + hpRestored + " health.");
                    Game.player.curHp += hpRestored;
                    System.out.println("You're now at " + Game.player.curHp + "/" + Game.player.maxHp + " health.");
                    Game.player.rests--;
                    continueKey();
                    break;
                } else {
                    System.out.println("You're at full health. You don't need to rest right now.");
                    continueKey();
                    break;
                }
            } else if (input == 2) {
                System.out.println("You decide not to take a rest right now. ");
                continueKey();
                break;
            }
        } while (Game.player.rests > 0);
    }

    // print title screen
    public static void printGameTitle() {
        clearConsole();
        printSeperator(40);
        printHeading("SINISTRAAD, A TEXT BASED RPG\nDESIGNED BY JUDE, AMELIA & MAX");
        printSeperator(40);
        continueKey();
    }

    // printing the main menu
    public static void printGameMenu() {
        clearConsole();
        printHeading("GAME MENU");
        System.out.println("Choose an Option:");
        printSeperator(30);
        System.out.println("[1] Continue Game");
        System.out.println("[2] Game Info");
        System.out.println("[3] Exit Game");
    }

    // printing the ingame player menu
    public static void printPlayerMenu() {
        clearConsole();
        printHeading("PLAYER MENU");
        System.out.println("Choose an Option:");
        printSeperator(30);
        System.out.println("[1] Interact");
        System.out.println("[2] Travel");
        System.out.println("[3] Player");
        System.out.println("[4] Bag");
        System.out.println("[5] Rest");
        System.out.println("[6] Quit");
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
    public static void printPlayerInfo() {
        clearConsole();
        printHeading("PLAYER INFO:");
        System.out.println("NAME: " + player.name + "\tHP: " + player.curHp + "/" + player.maxHp);
        printSeperator(30);
        System.out.println("XP: " + player.xp + "\tGold: " + player.gold);
        printSeperator(25);
        System.out.println("Potions: " + player.potions + "\tRests: " + player.rests);
        printSeperator(25);
        // printing affinity traits
        if (player.numAtkUpgrades > 0) {
            System.out.println("Offense Tree: " + player.atkUpgrades[player.numAtkUpgrades]);
            printSeperator(25);
        }
        if (player.numDefUpgrades > 0) {
            System.out.println("Defense Tree: " + player.defUpgrades[player.numDefUpgrades]);
            printSeperator(25);
        }
        continueKey();
    }

    // method called when player dies
    public static void playerDied() {
        clearConsole();
        printHeading("You Died...");
        printHeading("You earned " + player.xp + " XP on your Adventure.");
        continueKey();
        gameQuit();
    }

    // game quit and close method
    public static void gameQuit() {
        clearConsole();
        System.out.println("Thank you for playing!");
        continueKey();
        System.exit(0);
    }

    // main game menu loop
    public static void gameMenu() {
        while (!isRunning) {
            printGameMenu();
            int input = readInt();
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
            int input = readInt();
            switch (input) {
                case 1:
                    enemyBattle();
                    break;
                case 2:
                    Location.travel();
                    break;
                case 3:
                    printPlayerInfo();
                    break;
                case 4:
                    // bag();
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

    // method to get only integer user input
    public static int readInt() {
        int readInput;
        try {
            readInput = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            readInput = -1;
        }
        return readInput;
    }

    // method to print a seperator with length n
    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // method to pause for user input
    public static void continueKey() {
        System.out.println("Enter c to continue");
        scanner.next();
    }

    // method to print a heading
    public static void printHeading(String title) {
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    // method to clear the console
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

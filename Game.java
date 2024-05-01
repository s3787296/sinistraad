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
        printTitle();
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
        isRunning = true;
        // start main game loop
        gameLoop();
    }

    // // method to calculate a random encounter
    // public static void randomEncounter() {
    // // random number between 0 and length of the encounters array
    // int encounter = (int) (Math.random() * Combat.encounters.length);
    // // calling respective methods
    // if (Combat.encounters[encounter].equals("Battle")) {
    // enemyBattle();
    // } else {
    // // takeRest();
    // }
    // }

    // creating a random battle
    public static void enemyBattle() {
        Game.clearConsole();
        Game.printHeading("You're attacked by an evil creature. You'll have to fight it!");
        Game.continueKey();
        // creating new enemy with random name
        Combat.battle(new Enemy(Combat.enemies[(int) (Math.random() * Combat.enemies.length)], player.maxHp, player.xp));
    }

    public static void bossBattle() {
        // Combat.battle(new Boss)
    }

    public static void takeRest() {
        do {
            clearConsole();
            printHeading("Do you want to take a rest? (You have " + player.rests + " rest(s) left.)");
            System.out.println("[1] Yes\n[2] No, not now.");
            int input = readInt();
            if (input == 1) {
                // player takes rest
                clearConsole();
                if (player.curHp < player.maxHp) {
                    int hpRestored = ((player.maxHp - player.curHp) / 2);
                    System.out.println("You took a rest and restored " + hpRestored + " health.");
                    player.curHp += hpRestored;
                    System.out.println("You're now at " + player.curHp + "/" + player.maxHp + " health.");
                    player.rests--;
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
        } while (player.rests >= 1);
    }

    // print title screen
    public static void printTitle() {
        clearConsole();
        printSeperator(40);
        printHeading("SINISTRAAD, A TEXT BASED RPG\nDESIGNED BY JUDE, AMELIA & MAX");
        printSeperator(40);
        continueKey();
    }

    // printing the main menu
    public static void printMenu() {
        clearConsole();
        printHeading("MENU");
        System.out.println("Choose Option:");
        printSeperator(30);
        System.out.println("[1] Continue Story");
        System.out.println("[2] Take Rest");
        System.out.println("[3] Character Info");
        System.out.println("[4] Exit Game");
    }

    public static void continueStory() {
        enemyBattle();
    }

    // printing character sheet info
    public static void playerInfo() {
        clearConsole();
        printHeading("PLAYER INFO:");
        System.out.println("NAME: " + player.name + "\tHP: " + player.curHp + "/" + player.maxHp);
        printSeperator(30);
        System.out.println("XP: " + player.xp + "\tGold: " + player.gold);
        printSeperator(20);
        System.out.println("Potions: \t" + player.potions);
        printSeperator(20);
        //printing affinity traits
        if (player.numAtkUpgrades > 0) {
            System.out.println("Offense Tree: "+player.atkUpgrades[player.numAtkUpgrades]);
            printSeperator(20);
        }
        if (player.numDefUpgrades > 0) {
            System.out.println("Defense Tree: "+player.defUpgrades[player.numDefUpgrades]);
            printSeperator(20);
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

    public static void gameQuit() {
        clearConsole();
        System.out.println("Thank you for playing!");
        isRunning = false;
    }

    // main game loop
    public static void gameLoop() {
        while (isRunning) {
            printMenu();
            int input = readInt();
            switch (input) {
                case 1:
                    continueStory();
                    break;
                case 2:
                    takeRest();
                    break;
                case 3:
                    playerInfo();
                    break;
                case 4:
                    gameQuit();
                    break;
            }
        }
    }

    // method to get user input from console, limited by # choices
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

    // method to simulate clearing the console
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

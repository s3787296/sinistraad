import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;

    // method to start the game
    public static void startGame() {
        boolean nameSet = false;
        String name;
        // print title screen
        clearConsole();
        printSeperator(40);
        printSeperator(30);
        System.out.println("SINISTRAAD, A TEXT BASED RPG");
        System.out.println("DESIGNED BY JUDE, AMELIA & MAX");
        printSeperator(30);
        printSeperator(40);
        continueKey();

        // getting player name
        do {
            clearConsole();
            printHeading("What's your name?");
            name = scanner.next();
            // confirming player choice
            clearConsole();
            printHeading("Your name is " + name + ".\nIs that correct?");
            System.out.println("[1] Yes!");
            System.out.println("[2] No, let me change it.");
            int input = readInt(2);
            if (input == 1)
                nameSet = true;
            continueKey();
        } while (!nameSet);

        // create new player object with input name
        player = new Player(name);

        // setting isRunning to true so the game loop can begin
        isRunning = true;

        // start main game loop
        gameLoop();
    }

    // method to calculate a random encounter
    public static void randomEncounter() {
        // random number between 0 and length of the encounters array
        int encounter = (int) (Math.random() * Location.encounters.length);
        // calling respective methods
        if (Location.encounters[encounter].equals("Battle")) {
            randomBattle();
        } else {
            // takeRest();
        }
    }

    // creating a random battle
    public static void randomBattle() {
        clearConsole();
        printHeading("You're attacked by an evil creature. You'll have to fight it!");
        continueKey();
        // creating new enemy with random name
        // battle(new Enemy(enemies[(int) (Math.random() * enemies.length)]),
        // player.xp);
    }

    // main battle method
    public static void battle(Enemy enemy) {
        // turn tracker variable
        int turn = 1;
        // main battle loop
        while (true) {
            clearConsole();
            printHeading(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.maxHp);
            printHeading(player.name + "\nHP: " + player.hp + "/" + player.maxHp);
            printSeperator(20);
            System.out.println("[1] Attack\n[2] Dodge\n[3] Item");
            int input = readInt(3);
            // reacting to player input
            if (input == 1) {
                // attack
                int dmgDealt = player.attack() - enemy.defence();
                int dmgTaken = enemy.attack() - player.defence();
                // check that dmg taken isnt negative
                if (dmgTaken < 0) {
                    dmgTaken = 0;
                }
                // check that dmg dealt isnt negative
                if (dmgDealt < 0) {
                    dmgDealt = 0;
                }
                // calc dmg to both parties
                player.hp -= dmgTaken;
                enemy.hp -= dmgDealt;
                // print the info of this turn
                clearConsole();
                printHeading("BATTLE");
                System.out.println("Turn" + turn);
                System.out.println("You dealt " + dmgDealt + " damage to the " + enemy.name + "!");
                System.out.println("The " + enemy.name + " dealt " + dmgTaken + " damage to you!");
                continueKey();
                turn++;
                // check if player died
                if (player.hp <= 0) {
                    playerDied(); // method to end the game
                    break;
                } else if (enemy.hp <= 0) {
                    // tell the player they won
                    clearConsole();
                    printHeading("You defeated the " + enemy.name + "!");
                    // increase player xp
                    player.xp += enemy.xp;
                    System.out.println("You earned " + enemy.xp + "XP!");
                    continueKey();
                    break;
                }
            } else if (input == 2) {
                // dodge
            } else if (input == 3) {
                // use potion
            }
        }
    }

    // printing the main menu
    public static void printMenu() {
        clearConsole();
        printHeading("MENU");
        System.out.println("Options:");
        printSeperator(20);
        System.out.println("[1] Continue your Adventure");
        System.out.println("[2] Character Info");
        System.out.println("[3] Exit Game");
    }

    public static void continueAdventure() {
        // location stuff

    }
    // printing character sheet info
    public static void characterInfo() {
        clearConsole();
        printHeading("CHARACTER INFO:");
        printSeperator(30);
        System.out.println("NAME: " + player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        printSeperator(30);
        System.out.println("XP: " + player.xp);
        continueKey();
    }

    // method called when player dies
    public static void playerDied() {
        clearConsole();
        printHeading("You Died...");
        printHeading("You earned " + player.xp + " XP on your Adventure. Better luck next time!");
        isRunning = false;
    }

    // main game loop
    public static void gameLoop() {
        while (isRunning) {
            printMenu();
            int input = readInt(3);
            if (input == 1) {
                continueAdventure();
            } else if (input == 2) {
                characterInfo();
            } else
                isRunning = false;
        }
    }

    // method to get user input from console, limited by # choices
    public static int readInt(int userChoices) {
        int readInput;
        try {
            readInput = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            readInput = -1;
        }
        if (readInput < 1 || readInput > userChoices) {
            System.out.println("Invalid input, please enter a number for one the available choices.");
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

    // method to pause until user continues
    public static void continueKey() {
        System.out.println("\nEnter c to continue");
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
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}

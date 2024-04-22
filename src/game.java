import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Player player;

    // method to start the game
    public static void startGame() {
        boolean setName = false;
        String name;
        // print title screen
        clearConsole();
        printSeperator(40);
        printSeperator(30);
        System.out.println("SINISTRAAD, A TEXT BASED RPG");
        System.out.println("DESIGNED BY JUDE, AMELIA & MAX");
        printSeperator(30);
        printSeperator(40);
        anythingToContinue();

        //getting player name
        do {
            clearConsole();
            printHeading("What's your name?");
            name = scanner.next();
            //confirming player choice
            clearConsole();
            printHeading("Your name is "+name+".\nIs that correct?");
            System.out.println("[1] Yes!");
            System.out.println("[2] No, let me change it.");
            int input = scanner.nextInt();
            if (input == 1) 
                setName = true;
        } while (!setName);

        //create new player object with input name
        player = new Player(name);
    }

    // method to simulate clearing the console
    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    // method to print a seperator with length n
    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // method to pause until user continues
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }

    //method to print a heading
    public static void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }
}

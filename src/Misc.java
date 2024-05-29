import java.util.Scanner;

// Class for misc helper methods
public class Misc {
    
    // Declaring new instance of scanner
    static Scanner scanner = new Scanner(System.in);

    // Method to see whether the player bag contains an item
    public static boolean containsItem(String string) {
        boolean found = false;
        for (int i = 0; i < Game.player.getPlayerItems().size(); i++) {
            if (Game.player.getPlayerItems().get(i).getName().equalsIgnoreCase(string)) {
                found = true;
            }
        }
        return found;
    }

    // Method to get only integer user input
    public static int readInt() {
        int readInput;
        try {
            readInput = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            readInput = -1;
        }
        return readInput;
    }

    // Method to print a seperator with length n
    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // Method to pause for user input
    public static void continueKey() {
        System.out.println("\nEnter c to continue");
        scanner.next();
    }

    // Method to print a title
    public static void printHeading(String heading) {
        printSeperator(30);
        System.out.println(heading);
        printSeperator(30);
    }

    // Method to clear the console
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

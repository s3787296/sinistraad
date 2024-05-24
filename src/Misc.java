import java.util.Scanner;

// class for misc helper methods
public class Misc {
    static Scanner scanner = new Scanner(System.in);


    // method to check if the players inventory contains input item
    public static boolean containsItem(String item) {
        boolean contains = false;
        for (int i = 0; i < Inventory.playerItemList.size(); i++) {
            if (item.equalsIgnoreCase(Inventory.playerItemList.get(i).getName())) {
                contains = true;
            }
        }
        return contains;
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
        System.out.println("\nEnter c to continue");
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

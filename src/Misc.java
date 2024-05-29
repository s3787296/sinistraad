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
        printSeperator(40);
        System.out.println(heading);
        printSeperator(40);
    }

    // Method to clear the console
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Method to sleep so text doesn't pop up all at once with user input for the amount of time
    // Created this method to ensure consistency as it falls under the helper/misc category
    public static void sleep(int millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {};
    }

    public static void titleArt() {
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____\n" +
        " / ____|\n" +
        "| (___\n" +
        " \\___ \\\n" +
        " ____) |\n" +
        "|_____/ \n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____\n" +
        " / ____|_   _|\n" +
        "| (___   | |\n" +
        " \\___ \\  |\n" +
        " ____) |_| |_\n" +
        "|_____/|_____|\n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____ _   _ \n" +
        " / ____|_   _| \\ | |\n" +
        "| (___   | | |  \\| |\n" +
        " \\___ \\  | | | . ` |\n" +
        " ____) |_| |_| |\\  |\n" +
        "|_____/|_____|_| \\_|\n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____ _   _ _____ \n" +
        " / ____|_   _| \\ | |_   _|\n" +
        "| (___   | | |  \\| | | | \n" +
        " \\___ \\  | | | . ` | | |\n" +
        " ____) |_| |_| |\\  |_| |_\n" +
        "|_____/|_____|_| \\_|_____|\n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____ _   _ _____  _____\n" +
        " / ____|_   _| \\ | |_   _|/ ____|\n" +
        "| (___   | | |  \\| | | | | (___\n" +
        " \\___ \\  | | | . ` | | |  \\___ \\ \n" +
        " ____) |_| |_| |\\  |_| |_ ____) |\n" +
        "|_____/|_____|_| \\_|_____|_____/ \n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____ _   _ _____  _____ _______\n" +
        " / ____|_   _| \\ | |_   _|/ ____|__   __|\n" +
        "| (___   | | |  \\| | | | | (___    | |\n" +
        " \\___ \\  | | | . ` | | |  \\___ \\   |\n" +
        " ____) |_| |_| |\\  |_| |_ ____) |  | |\n" +
        "|_____/|_____|_| \\_|_____|_____/   |_|\n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____ _   _ _____  _____ _______ _____\n" +
        " / ____|_   _| \\ | |_   _|/ ____|__   __|  __ \\ \n" +
        "| (___   | | |  \\| | | | | (___    | |  | |__) |\n" +
        " \\___ \\  | | | . ` | | |  \\___ \\   | |  |  _  / \n" +
        " ____) |_| |_| |\\  |_| |_ ____) |  | |  | | \\ \\ \n" +
        "|_____/|_____|_| \\_|_____|_____/   |_|  |_|  \\_\\ \n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____ _   _ _____  _____ _______ _____          \n" +
        " / ____|_   _| \\ | |_   _|/ ____|__   __|  __ \\     /\\ \n" +
        "| (___   | | |  \\| | | | | (___    | |  | |__) |   /  \\ \n" +
        " \\___ \\  | | | . ` | | |  \\___ \\   | |  |  _  /   / /\\ \\ \n" +
        " ____) |_| |_| |\\  |_| |_ ____) |  | |  | | \\ \\  / ____ \\ \n" +
        "|_____/|_____|_| \\_|_____|_____/   |_|  |_|  \\_\\/_/    \\_\\ \n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____ _   _ _____  _____ _______ _____                      \n" +
        " / ____|_   _| \\ | |_   _|/ ____|__   __|  __ \\     /\\        /\\ \n" +
        "| (___   | | |  \\| | | | | (___    | |  | |__) |   /  \\      /  \\ \n" +
        " \\___ \\  | | | . ` | | |  \\___ \\   | |  |  _  /   / /\\ \\    / /\\ \\ \n" +
        " ____) |_| |_| |\\  |_| |_ ____) |  | |  | | \\ \\  / ____ \\  / ____ \\ \n" +
        "|_____/|_____|_| \\_|_____|_____/   |_|  |_|  \\_\\/_/    \\_\\/_/    \\_\\ \n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(300);
        Misc.clearConsole();
        Misc.printSeperator(75);
        System.out.println("" +
        "  _____ _____ _   _ _____  _____ _______ _____                      _____  \n" +
        " / ____|_   _| \\ | |_   _|/ ____|__   __|  __ \\     /\\        /\\   |  __ \\ \n" +
        "| (___   | | |  \\| | | | | (___    | |  | |__) |   /  \\      /  \\  | |  | |\n" +
        " \\___ \\  | | | . ` | | |  \\___ \\   | |  |  _  /   / /\\ \\    / /\\ \\ | |  | |\n" +
        " ____) |_| |_| |\\  |_| |_ ____) |  | |  | | \\ \\  / ____ \\  / ____ \\| |__| |\n" +
        "|_____/|_____|_| \\_|_____|_____/   |_|  |_|  \\_\\/_/    \\_\\/_/    \\_\\_____/ \n\n" +
        "                        ---------------------------                               \n");
        Misc.sleep(1100);
        System.out.println("                             A TEXT BASED RPG\n\n");
        Misc.sleep(1100);
        System.out.println("                      DESIGNED BY JUDE, AMELIA & MAX\n\n");
        Misc.sleep(1100);
    }
}

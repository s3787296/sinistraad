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

    public static void InfoString(){
System.out.println( "Wlecome to Sinistraad, A thrilling text based adventure!"
+ "\n" +
" "
+ "\n" +
"You have to set on a perilous journey into the duskwood forest to slay the evil Count Eripmav and free your town from his influence!"
+ "\n" +
"While playing you have multiple options that allow you to do different things:"
+ "\n" +
" "
+ "\n" +
" "
+ "\n" +
"Explore: Allows you to move in the four cardinal directions, however if you have nowhere to go, you wont be allowed, check the map to see your options!"
+ "\n" +
" "
+ "\n" +
"Player:  Displays the players stats! Check your health, damage, XP, fols, how many potions and rests you have, and your damage and defense stats!"
+ "\n" +
" "
+ "\n" +
"Map:     Displays the Map of your journey! Lost your way or not sure where to go? Check the map for a refresher! "
+ "\n" +
" "
+ "\n" +
"Bag:     Allows you to view items and potions in your bag, with a short description of each, allows you to drop and pick up items, and check the items in an area."
+ "\n" +
" "
+ "\n" +
"Rest:    Out of potions but low on health? Take a short rest to recover some  health in a pinch! helps prevent your death from coming too early."
+ "\n" +
" "
+ "\n" +
"Exit:    If you feel like quitting, exit brings you back to the start menu so you can run away with your tail between your legs."
+ "\n" +
" "
+ "\n"+
"To truly succeed on your journey, make sure to explore and try all options! Also remember to have fun and have fun on your journey!"
+ "\n" +
" "
);
}
}

import java.util.Scanner;

/**
 * Misc class contains helper methods to improve game functionality.
 * 
 * @author Max
 * @author Jude
 * @author Amelia
 * @version 0.25
 */
public class Misc {

    /**
     * New instance of Scanner for player input.
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Method to see whether the player bag contains an item.
     * <p>
     * For loop runs until the item is found, or the loop reads all of the items in
     * the bag.
     * <p>
     * If bag contains the item, found = true, otherwise found = false.
     * 
     * @param string Item name
     * @return found
     */
    public static boolean containsItem(String string) {
        /**
         * Boolean to set status of item we're searching for.
         */
        boolean found = false;
        for (int i = 0; i < Game.player.getPlayerItems().size(); i++) {
            if (Game.player.getPlayerItems().get(i).getName().equalsIgnoreCase(string)) {
                found = true;
            }
        }
        return found;
    }

    /**
     * Method to search player items by name and return item index.
     * 
     * @return index
     */
    public static int indexItem(String string) {
        int index = 0;
        for (int i = 0; i < Game.player.getPlayerItems().size(); i++) {
            if (Game.player.getPlayerItems().get(i).getName().equalsIgnoreCase(string)) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Method to translate travel directions into numbers.
     * <p>
     * E.g. This lets the player type either 1 or n to travel north.
     * 
     * @return 1 for north
     * @return 2 for east
     * @return 3 for south
     * @return 4 for west
     */
    public static int readTravel() {
        /**
         * Get user direction input.
         */
        String input = scanner.next();
        if (input.equalsIgnoreCase("n")) {
            return 1;
        }
        if (input.equalsIgnoreCase("e")) {
            return 2;
        }
        if (input.equalsIgnoreCase("s")) {
            return 3;
        }
        if (input.equalsIgnoreCase("w")) {
            return 4;
        }
        if (input.equalsIgnoreCase("x")) {
            return 5;
        } else {
            return -1;
        }
    }

    /**
     * Method to get only integer user input.
     * 
     * @return readInput
     */
    public static int readInt() {
        /**
         * Variable to store input.
         */
        int readInput;
        try {
            readInput = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            readInput = -1;
        }
        return readInput;
    }

    /**
     * Method to print a separator with length n.
     * 
     * @param n
     */
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Method to pause for user input.
     */
    public static void continueKey() {
        System.out.println("\nEnter any key to continue");
        scanner.next();
    }

    /**
     * Method to format a string into a title/heading.
     * 
     * @param heading The text to be formatted as a heading
     */
    public static void printHeading(String heading) {
        printSeparator(40);
        System.out.println(heading);
        printSeparator(40);
    }

    /**
     * Method to clear the console.
     */
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Method to create delay effect.
     * 
     * @param millisec Num of milliseconds to pause the program
     * @exception InterruptedException e if an exception occurred
     */
    public static void sleep(int millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
        }
    }

    /**
     * Method to print title screen ASCII art.
     * <p>
     * The title sequence prints "SINISTRAAD" one letter at a time.
     */
    public static void titleArt() {
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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
        Misc.printSeparator(75);
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

    /**
     * Method to print the game information text.
     */
    public static void InfoString() {
        System.out.println("------------------------------------------------------------------------\n"
                + "                            About the game\n"
                + "------------------------------------------------------------------------\n"
                + "Sinistraad is a fantasy adventure game where you, the player, set out on a journey into the Duskwood Forest to slay the evil vampire who has been terrorising the town for decades.\n\n"
                + "Throughout your journey you will interact with various non player characters, including Old Remraf, the farmer who gives you his blessing for the journey and some useful items.\n"
                + "You might also find Nostramus in their apothecary, where they sell beneficial potions and other trinkets to help you on your journey.\n"
                + "It’s up to you to explore the map and travel to the castle to finally slay the evil vampire count and save their town!\n\n"
                + "The main objective is to reach the castle and defeat Count Eripmav in battle.\n"
                + "To progress in the game, you must battle enemies to collect gold and battle boss enemies to collect quest items.\n\n"
                + "------------------------------------------------------------------------\n"
                + "                        What are the controls?\n"
                + "------------------------------------------------------------------------\n"
                + "You control this game by entering either a number or a letter into the terminal, then pressing enter to confirm your selection.\n\n"
                + "The travel menu lets you input both letters and numbers:\n"
                + "-	North is [1] or [N] or [n]\n"
                + "-	East is [2] or [E] or [e]\n"
                + "-	South is [3] or [S] or [s]\n"
                + "-	West is [4] or [W] or [w]\n\n"
                + "All the other menus only let you input letters.\n\n"
                + "------------------------------------------------------------------------\n"
                + "                     What do the menu options do?\n"
                + "------------------------------------------------------------------------\n"
                + "While playing you have multiple options that allow you to do different things:\n\n"
                + "-	Explore: Sometimes you end up battling an enemy if there is one available.\n"
                + "    If there’s an NPC or a boss in your current location, choosing to explore will launch that encounter.\n"
                + "    After your encounter, you will be prompted to travel to a new location.\n"
                + "-	Player: Displays all the players information, including your name, health, XP, gold, potions, rests and damage and defense stats!\n"
                + "-	Map: Displays the Map of your journey! Lost your way or not sure where to go? Check the map for a refresher!\n"
                + "-	Bag: Allows you to view items and potions in your bag, with a short description of each, allows you to drop and pick up items, and check the items in an area.\n"
                + "-	Rest: Out of potions but low on health? Take a short rest to recover some health in a pinch! helps prevent your death from coming too early.\n"
                + "-	Exit: If you feel like quitting, exit brings you back to the start menu so you can run away with your tail between your legs.\n\n"
                + "To truly succeed on your journey, make sure to explore and try all options! Also remember to have fun and have fun on your journey!\n");
    }
}

public class Direction {

    // Variable to store player location. Starting location is defined.
    public static String playerLocation = "E5"; // @TODO: Update this to contain the variable stated in the player/game
                                                // file?
    // Method to print the travel menu
    public static void printTravelMenu() {
        Misc.clearConsole();
        Misc.printHeading("Travel");
        Misc.printSeperator(30);
        System.out.println("Which direction do you want to travel?");
        System.out.println("[1] North");
        System.out.println("[2] East");
        System.out.println("[3] South");
        System.out.println("[4] West");
    }

    public static void directionBlocked() {
        System.out.println("\nYou can't go that way. Select another direction.");
        Misc.continueKey();
        ;
    }

    // Travel method for player movement around map
    public static void travel() {
        // Set variable to allow do while loop to run while validLocation is false
        Boolean validLocation = false;
        do {
            printTravelMenu();
            int input = Misc.readInt();
            switch (input) {
                case 1:
                    // Input = north
                    if (playerLocation == "B2") {
                        playerLocation = "B1";
                        validLocation = true;
                    } else if (playerLocation == "A3") {
                        playerLocation = "A2";
                        validLocation = true;
                    } else if (playerLocation == "B3") {
                        playerLocation = "B2";
                        validLocation = true;
                    } else if (playerLocation == "C3") {
                        playerLocation = "C2";
                        validLocation = true;
                    } else if (playerLocation == "D3") {
                        playerLocation = "D2";
                        validLocation = true;
                    } else if (playerLocation == "A4") {
                        playerLocation = "A3";
                        validLocation = true;
                    } else if (playerLocation == "D4") {
                        playerLocation = "D3";
                        validLocation = true;
                    } else if (playerLocation == "E4") {
                        playerLocation = "E3";
                        validLocation = true;
                    } else if (playerLocation == "B5") {
                        playerLocation = "B4";
                        validLocation = true;
                    } else if (playerLocation == "D5") {
                        playerLocation = "D4";
                        validLocation = true;
                    } else if (playerLocation == "E5") {
                        playerLocation = "D4";
                        validLocation = true;
                    } else {
                        directionBlocked();
                    }
                    break;
                case 2:
                    // Input = east
                    if (playerLocation == "A1") {
                        playerLocation = "B1";
                        validLocation = true;
                    } else if (playerLocation == "B1") {
                        playerLocation = "C1";
                        validLocation = true;
                    } else if (playerLocation == "C1") {
                        playerLocation = "D1";
                        validLocation = true;
                    } else if (playerLocation == "D1") {
                        playerLocation = "E1";
                        validLocation = true;
                    } else if (playerLocation == "A2") {
                        playerLocation = "B2";
                        validLocation = true;
                    } else if (playerLocation == "C3") {
                        playerLocation = "D3";
                        validLocation = true;
                    } else if (playerLocation == "A4") {
                        playerLocation = "B4";
                        validLocation = true;
                    } else if (playerLocation == "B4") {
                        playerLocation = "C4";
                        validLocation = true;
                    } else if (playerLocation == "C4") {
                        playerLocation = "D4";
                        validLocation = true;
                    } else if (playerLocation == "D4") {
                        playerLocation = "E4";
                        validLocation = true;
                    } else if (playerLocation == "B5") {
                        playerLocation = "C5";
                        validLocation = true;
                    } else {
                        directionBlocked();
                    }
                    break;
                case 3:
                    // Input = south
                    if (playerLocation == "B1") {
                        playerLocation = "B2";
                        validLocation = true;
                    } else if (playerLocation == "A2") {
                        playerLocation = "A3";
                        validLocation = true;
                    } else if (playerLocation == "B2") {
                        playerLocation = "B3";
                        validLocation = true;
                    } else if (playerLocation == "C2") {
                        playerLocation = "C3";
                        validLocation = true;
                    } else if (playerLocation == "D2") {
                        playerLocation = "D3";
                        validLocation = true;
                    } else if (playerLocation == "A3") {
                        playerLocation = "A4";
                        validLocation = true;
                    } else if (playerLocation == "D3") {
                        playerLocation = "D4";
                        validLocation = true;
                    } else if (playerLocation == "E3") {
                        playerLocation = "E4";
                        validLocation = true;
                    } else if (playerLocation == "B4") {
                        playerLocation = "B5";
                        validLocation = true;
                    } else if (playerLocation == "D4") {
                        playerLocation = "D5";
                        validLocation = true;
                    } else if (playerLocation == "E4") {
                        playerLocation = "E5";
                        validLocation = true;
                    } else {
                        directionBlocked();
                    }
                    break;
                case 4:
                    // Input == west
                    if (playerLocation == "B1") {
                        playerLocation = "A1";
                        validLocation = true;
                    } else if (playerLocation == "C1") {
                        playerLocation = "B1";
                        validLocation = true;
                    } else if (playerLocation == "D1") {
                        playerLocation = "C1";
                        validLocation = true;
                    } else if (playerLocation == "E1") {
                        playerLocation = "D1";
                        validLocation = true;
                    } else if (playerLocation == "B2") {
                        playerLocation = "A2";
                        validLocation = true;
                    } else if (playerLocation == "D3") {
                        playerLocation = "C3";
                        validLocation = true;
                    } else if (playerLocation == "B4") {
                        playerLocation = "A4";
                        validLocation = true;
                    } else if (playerLocation == "C4") {
                        playerLocation = "B4";
                        validLocation = true;
                    } else if (playerLocation == "D4") {
                        playerLocation = "C4";
                        validLocation = true;
                    } else if (playerLocation == "E4") {
                        playerLocation = "D4";
                        validLocation = true;
                    } else if (playerLocation == "C5") {
                        playerLocation = "B5";
                        validLocation = true;
                    } else {
                        directionBlocked();
                    }
                    break;
            }

            // Print location once valid.
            if (validLocation == true) {
                System.out.println("Your location is: " + playerLocation);
                Misc.continueKey();
            }
        } while (validLocation == false);
    }
}

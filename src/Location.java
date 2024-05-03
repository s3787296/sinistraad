public class Location {
    // Variable to store player location. Starting location is defined.
    public static String playerLocation = "A1";

    // travel method for player movement around map
    public static void travel() {
        // Compass direction variables for readability
        int north = 1;
        int east = 2;
        int south = 3;
        int west = 4;
        // Boolean variable to ensure do while loop runs until the chosen location is
        // valid
        Boolean validLocation = false;
        do {
            Game.clearConsole();
            System.out.println("Which direction do you want to travel?");
            System.out.println("[1] North");
            System.out.println("[2] East");
            System.out.println("[3] South");
            System.out.println("[4] West");
            // User has four choices, call the read input function. TODO: 4 player options
            // here
            int direction = Game.readInt();
            // Switch case checking whether player location is valid
            switch (playerLocation) {
                case "A1":
                    if (direction == east) {
                        playerLocation = "B1";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "B1":
                    if (direction == east) {
                        playerLocation = "C1";
                        validLocation = true;
                    } else if (direction == south) {
                        playerLocation = "B2";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "A1";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "C1":
                    if (direction == east) {
                        playerLocation = "D1";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "B1";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "D1":
                    if (direction == east) {
                        playerLocation = "E1";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "C1";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "E1":
                    if (direction == west) {
                        playerLocation = "D1";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "A2":
                    if (direction == east) {
                        playerLocation = "B2";
                        validLocation = true;
                    } else if (direction == south) {
                        playerLocation = "A3";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "B2":
                    if (direction == north) {
                        playerLocation = "B1";
                        validLocation = true;
                    } else if (direction == south) {
                        playerLocation = "B3";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "A2";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "C2":
                    if (direction == south) {
                        playerLocation = "C3";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "D2":
                    if (direction == south) {
                        playerLocation = "D3";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                    // CASE: E2 (NOT ALLOWED)
                case "A3":
                    if (direction == north) {
                        playerLocation = "A2";
                        validLocation = true;
                    } else if (direction == south) {
                        playerLocation = "A4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "B3":
                    if (direction == north) {
                        playerLocation = "B2";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "C3":
                    if (direction == north) {
                        playerLocation = "C2";
                        validLocation = true;
                    } else if (direction == east) {
                        playerLocation = "D3";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "D3":
                    if (direction == north) {
                        playerLocation = "D2";
                        validLocation = true;
                    } else if (direction == south) {
                        playerLocation = "D4";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "C3";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "E3":
                    if (direction == south) {
                        playerLocation = "E4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "A4":
                    if (direction == north) {
                        playerLocation = "A3";
                        validLocation = true;
                    } else if (direction == east) {
                        playerLocation = "B4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "B4":
                    if (direction == east) {
                        playerLocation = "C4";
                        validLocation = true;
                    } else if (direction == south) {
                        playerLocation = "B5";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "A4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "C4":
                    if (direction == east) {
                        playerLocation = "D4";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "B4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "D4":
                    if (direction == north) {
                        playerLocation = "D3";
                        validLocation = true;
                    } else if (direction == east) {
                        playerLocation = "E4";
                        validLocation = true;
                    } else if (direction == south) {
                        playerLocation = "D5";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "C4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "E4":
                    if (direction == north) {
                        playerLocation = "E3";
                        validLocation = true;
                    } else if (direction == south) {
                        playerLocation = "E5";
                        validLocation = true;
                    } else if (direction == west) {
                        playerLocation = "D4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                    // A5: NOT ALLOWED SO NOT INCLUDED
                case "B5":
                    if (direction == north) {
                        playerLocation = "B4";
                        validLocation = true;
                    } else if (direction == east) {
                        playerLocation = "C5";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "C5":
                    if (direction == west) {
                        playerLocation = "B5";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "D5":
                    if (direction == north) {
                        playerLocation = "D4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
                case "E5":
                    if (direction == north) {
                        playerLocation = "E4";
                        validLocation = true;
                    } else {
                        System.out.println("Not allowed. Select another option.");
                        Game.continueKey();
                    }
            }
        } while (validLocation != true);

        // Print location once valid. TODO: This is just for testing purposes.
        if (validLocation == true) {
            System.out.println("Your location is: " + playerLocation);
            Game.continueKey();
        }
    }

    // TODO: encounters method
    public void encounters() {
        // playerlocation variable at top of doc
        // Create ArrayList to store encounters
        // ArrayList<String> encounters = new ArrayList<String>();
        // TODO: Confirm types of encounters
    }
}

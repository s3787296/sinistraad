public class Direction {

    // Method to print the travel menu
    public static void printTravelMenu() {
        Misc.clearConsole();
        Game.printLocationInfo();
        Misc.printHeading("TRAVEL");
        System.out.println("Which direction do you want to travel?");
        System.out.println("[1] North");
        System.out.println("[2] East");
        System.out.println("[3] South");
        System.out.println("[4] West");
        System.out.println("[5] Exit");
    }

    // Method to print for invalid direction
    private static void directionBlocked() {
        System.out.println("\nYou can't go that way. Select another direction.");
        Misc.continueKey();
        ;
    }

    // Method to print to set updated location
    private static void setDirection(Location setLocation) {
        Game.player.setCurrentLocation(setLocation);
    }

    // Method to identify player's current location
    private static boolean checkDirection(Location checklocation) {
        boolean validlocation = false;
        if (Game.player.getCurrentLocation().equals(checklocation)) {
            validlocation = true;
        }
        return validlocation;
    }

    // Travel method for player movement around map
    public static void travel() {
        while (true) {
            printTravelMenu();
            int input = Misc.readInt();
            switch (input) {
                // Input == North
                case 1:
                    if (checkDirection(LocationList.bList.get(2))) {
                        setDirection(LocationList.bList.get(1));
                        return;
                    } else if (checkDirection(LocationList.aList.get(3))) {
                        setDirection(LocationList.aList.get(2));
                        return;
                    } else if (checkDirection(LocationList.bList.get(3))) {
                        setDirection(LocationList.bList.get(2));
                        return;
                    } else if (checkDirection(LocationList.cList.get(3))) {
                        setDirection(LocationList.cList.get(2));
                        return;
                    } else if (checkDirection(LocationList.dList.get(3))) {
                        setDirection(LocationList.dList.get(2));
                        return;
                    } else if (checkDirection(LocationList.aList.get(4))) {
                        setDirection(LocationList.aList.get(3));
                        return;
                    } else if (checkDirection(LocationList.dList.get(4))) {
                        setDirection(LocationList.dList.get(3));
                        return;
                    } else if (checkDirection(LocationList.eList.get(4))) {
                        setDirection(LocationList.eList.get(3));
                        return;
                    } else if (checkDirection(LocationList.bList.get(5))) {
                        setDirection(LocationList.bList.get(4));
                        return;
                    } else if (checkDirection(LocationList.dList.get(5))) {
                        setDirection(LocationList.dList.get(4));
                        return;
                    } else if (checkDirection(LocationList.eList.get(5))) {
                        setDirection(LocationList.eList.get(4));
                        return;
                    } else {
                        directionBlocked();
                        break;
                    }
                    // Input == East
                case 2:
                    if (checkDirection(LocationList.aList.get(1))) {
                        setDirection(LocationList.bList.get(1));
                        return;
                    } else if (checkDirection(LocationList.bList.get(1))) {
                        setDirection(LocationList.cList.get(1));
                        return;
                    } else if (checkDirection(LocationList.cList.get(1))) {
                        setDirection(LocationList.dList.get(1));
                        return;
                    } else if (checkDirection(LocationList.dList.get(1))) {
                        setDirection(LocationList.eList.get(1));
                        return;
                    } else if (checkDirection(LocationList.aList.get(2))) {
                        setDirection(LocationList.bList.get(2));
                        return;
                    } else if (checkDirection(LocationList.cList.get(3))) {
                        setDirection(LocationList.dList.get(3));
                        return;
                    } else if (checkDirection(LocationList.aList.get(4))) {
                        setDirection(LocationList.bList.get(4));
                        return;
                    } else if (checkDirection(LocationList.bList.get(4))) {
                        setDirection(LocationList.cList.get(4));
                        return;
                    } else if (checkDirection(LocationList.cList.get(4))) {
                        setDirection(LocationList.dList.get(4));
                        return;
                    } else if (checkDirection(LocationList.dList.get(4))) {
                        setDirection(LocationList.eList.get(4));
                        return;
                    } else if (checkDirection(LocationList.bList.get(5))) {
                        setDirection(LocationList.cList.get(5));
                        return;
                    } else {
                        directionBlocked();
                        break;
                    }
                    // Input == South
                case 3:
                    if (checkDirection(LocationList.bList.get(1))) {
                        setDirection(LocationList.bList.get(2));
                        return;
                    } else if (checkDirection(LocationList.aList.get(2))) {
                        setDirection(LocationList.aList.get(3));
                        return;
                    } else if (checkDirection(LocationList.bList.get(2))) {
                        setDirection(LocationList.bList.get(3));
                        return;
                    } else if (checkDirection(LocationList.cList.get(2))) {
                        setDirection(LocationList.cList.get(3));
                        return;
                    } else if (checkDirection(LocationList.dList.get(2))) {
                        setDirection(LocationList.dList.get(3));
                        return;
                    } else if (checkDirection(LocationList.aList.get(3))) {
                        setDirection(LocationList.aList.get(4));
                        return;
                    } else if (checkDirection(LocationList.dList.get(3))) {
                        setDirection(LocationList.dList.get(4));
                        return;
                    } else if (checkDirection(LocationList.eList.get(3))) {
                        setDirection(LocationList.eList.get(4));
                        return;
                    } else if (checkDirection(LocationList.bList.get(4))) {
                        setDirection(LocationList.bList.get(5));
                        return;
                    } else if (checkDirection(LocationList.dList.get(4))) {
                        setDirection(LocationList.dList.get(5));
                        return;
                    } else if (checkDirection(LocationList.eList.get(4))) {
                        setDirection(LocationList.eList.get(5));
                        return;
                    } else {
                        directionBlocked();
                        break;
                    }
                case 4:
                    // Input == West
                    if (checkDirection(LocationList.bList.get(1))) {
                        setDirection(LocationList.aList.get(1));
                        return;
                    } else if (checkDirection(LocationList.cList.get(1))) {
                        setDirection(LocationList.bList.get(1));
                        return;
                    } else if (checkDirection(LocationList.dList.get(1))) {
                        setDirection(LocationList.cList.get(1));
                        return;
                    } else if (checkDirection(LocationList.eList.get(1))) {
                        setDirection(LocationList.dList.get(1));
                        return;
                    } else if (checkDirection(LocationList.bList.get(2))) {
                        setDirection(LocationList.aList.get(2));
                        return;
                    } else if (checkDirection(LocationList.dList.get(3))) {
                        setDirection(LocationList.cList.get(3));
                        return;
                    } else if (checkDirection(LocationList.bList.get(4))) {
                        setDirection(LocationList.aList.get(4));
                        return;
                    } else if (checkDirection(LocationList.cList.get(4))) {
                        setDirection(LocationList.bList.get(4));
                        return;
                    } else if (checkDirection(LocationList.dList.get(4))) {
                        setDirection(LocationList.cList.get(4));
                        return;
                    } else if (checkDirection(LocationList.eList.get(4))) {
                        if (Misc.containsItem("Hero's Map")) {
                            setDirection(LocationList.dList.get(4));
                            return;
                        } else {
                            directionBlocked();
                            return;
                        } 
                    } else if (checkDirection(LocationList.cList.get(5))) {
                        setDirection(LocationList.bList.get(5));
                        return;
                    } else {
                        directionBlocked();
                        break;
                    }
                // Send player back to player menu
                case 5:
                    Game.playerOptions();
                    break;
            }
        }
    }
}

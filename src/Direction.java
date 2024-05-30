/**
 * This class handles the methods relating to player travel across the map.
 * @author Jude
 * @author Max
 */
public class Direction {

    /**
     * Method to print the travel menu
     */
    public static void printTravelMenu() {
        Misc.clearConsole();
        Game.printLocationInfo();
        Misc.printHeading("TRAVEL");
        System.out.println("Which direction do you want to travel?");
        System.out.println("[N] North");
        System.out.println("[E] East");
        System.out.println("[S] South");
        System.out.println("[W] West");
        System.out.println("[X] Exit");
    }

    /**
     * Method to invalid direction message if player can't travel that way.
     */
    private static void directionBlocked() {
        System.out.println("\nYou can't go that way. Select another direction.");
        Misc.continueKey();
        ;
    }

    /**
     * Method to print to set updated location.
     * @param setLocation
     */
    private static void setDirection(Location setLocation) {
        Game.player.setCurrentLocation(setLocation);
    }

    /**
     * Method to identify player's current location.
     * @param   checklocation
     * @param   validlocation
     * @return  validlocation
     */
    private static boolean checkDirection(Location checklocation) {
        boolean validlocation = false;
        if (Game.player.getCurrentLocation().equals(checklocation)) {
            validlocation = true;
        }
        return validlocation;
    }

    /**
     * Travel method for player movement around map.
     * @param input     Player input for direction to travel
     */
    public static void travel() {
        while (true) {
            printTravelMenu();
            int input = Misc.readTravel();
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
                        if (Misc.containsItem("Gate Key")) {
                            setDirection(LocationList.aList.get(3));
                            return;
                        } else {
                            directionBlocked();
                            return;
                        }
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
                        if (Misc.containsItem("Chamber Key")) {
                            setDirection(LocationList.cList.get(1));
                            return;
                        } else {
                            directionBlocked();
                            return;
                        }
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
                // Input == West
                case 4:
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

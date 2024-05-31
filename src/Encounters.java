/**
 * Encounters class handles the methods relating to non-combat player
 * encounters.
 * 
 * @author Max
 * @author Jude
 * @version 1.0
 */
public class Encounters {

    /**
     * Checking if the player location matches any non-combat player encounter.
     * 
     * @param location  Player's current location.
     */
    public static void playerEncounters(Location location) {
        if (location.equals(LocationList.cList.get(2))) {
            apothecaryEncounter();
        } else if (location.equals(LocationList.eList.get(4))) {
            farmerEncounter();
        } else if (location.equals(LocationList.dList.get(2))) {
            maidenTearsEncounter();
        } else if (location.equals(LocationList.aList.get(1))) {
            cathedralKeyEncounter();
        } else if (location.equals(LocationList.cList.get(1))) {
            altarEncounter();
        } else if (location.equals(LocationList.eList.get(1))) {
            eripmavEncounter();
        }
    }

    /**
     * Method to run the encounter with Old Remraf, the farmer at the Tilled Plains.
     * <p>
     * Adds Hero's Map and Hero's Sword items to player bag depending on current contents of bag.
     * Different story text called depending on whether player has defeated the Arachnid Matriarch.
     */
    private static void farmerEncounter() {
        // If player bag contains Matriarch's Blood, call relevant story method
        if (Misc.containsItem("Matriarch's Blood")) {
            Misc.printHeading(Story.farmerReturnStory());
            // if player bag does not contain Hero's Map, add Hero's Map
            if (!Misc.containsItem("Hero's Map")) {
                Game.player.getPlayerItems().add(ItemList.herosMap());
            }
            // If bag doesn't contain Matriarch's Blood, call relevant story method
        } else if (!Misc.containsItem("Matriarch's Blood")) {
            Misc.printHeading(Story.farmerStory());
            // if player bag does not contain heros sword, add heros sword
            if (!Misc.containsItem("Hero's Sword")) {
                Game.player.getPlayerItems().add(ItemList.herosSword());
            }
        }
    }

    /**
     * Method to let player make a purchase when they are within the
     * {@code apothecaryEncounter()} method.
     * 
     * @param gold  Cost of item
     * @param item  Item selected to purchase
     */
    private static void apothecaryPurchase(int gold, Item item) {
        int option = Misc.readInt();
        if (option == 1) {
            if (Game.player.getGold() >= gold) {
                System.out.println("\nA most splendid choice, dear friend. Do stop by again, won't you?");
                if (item.getName().equalsIgnoreCase("Empty Goblet")) {
                    Game.player.getPlayerItems().add(item);
                    Misc.printHeading(Story.nostramusGobletStory());
                } else if (item.getName().equalsIgnoreCase("Healing Potion")) {
                    Game.player.getPlayerPotions().add(item);
                }
                Game.player.setGold(Game.player.getGold() - gold);
                Misc.continueKey();
                // If player does not have enough gold, print failure message
            } else {
                System.out.println(
                        "\nOh, how unfortunate - it seems you do not have the coin to match... Perhaps another time.");
                Misc.continueKey();
                return;
            }
            // If player selects "[2] Decline"
        } else if (option == 2) {
            System.out.println("\nOh... Very well... Make sure to stop by again!");
            Misc.continueKey();
            return;

        }
    }

    /**
     * Method to run the encounter with Nostramus at the Apothecary.
     * <p>
     * 
     */
    private static void apothecaryEncounter() {
        Misc.printHeading(Story.nostramusStartStory());
        Misc.continueKey();
        /**
         * Boolean for running the purchase while loop.
         */
        boolean purchase = true;
        while (purchase) {
            Misc.clearConsole();
            Misc.printHeading("APOTHECARY");
            System.out.println("NOSTRAMUS: Welcome to my apothecary.");
            System.out.println("See anything you like?");
            if (Misc.containsItem("Empty Goblet") || Misc.containsItem("Filled Goblet")
                    || Misc.containsItem("Blessed Goblet")) {
                System.out.println("[1] Healing Potion" + "\n[2] Exit");
                /**
                 * Player input from apothecary menu with no goblet.
                 */
                int input = Misc.readInt();
                if (input == 1) {
                    /**
                     * Item to purchase is Healing Potion.
                     */
                    Item item = ItemList.healingPotion();
                    /**
                     * Healing potion costs 10 gold.
                     */
                    int price = 10;
                    System.out.println(
                            "\nAh yes, these are my specialty and a favourite of travelers such as yourself.\nThat'll be "
                                    + price + "g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(price, item);
                }
                if (input == 2) {
                    purchase = false;
                    break;
                }
            } else if (!Misc.containsItem("Empty Goblet") || Misc.containsItem("Filled Goblet")
                    || Misc.containsItem("Blessed Goblet")) {
                // If the player doesn't have any goblets, display the following menu
                System.out.println("[1] Healing Potion" + "\n[2] Empty Goblet" + "\n[3] Exit");
                /**
                 * Menu option selected if player does not have any goblet items.
                 */
                int input = Misc.readInt();
                // Menu option selected: [1] Healing Potion
                if (input == 1) {
                    /**
                     * Item to purchase is Healing Potion.
                     */
                    Item item = ItemList.healingPotion();
                    /**
                     * Healing potion costs 10 gold.
                     */
                    int price = 10;
                    System.out.println(
                            "\nAh yes, these are my specialty and a favourite of travelers such as yourself.\nThat'll be "
                                    + price + "g.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(price, item);
                }
                // Menu option selected: [2] Empty Goblet
                if (input == 2) {
                    /**
                     * Item to purchase is Empty Goblet.
                     */
                    Item item = ItemList.emptyGoblet();
                    /**
                     * Empty Goblet costs 20 gold.
                     */
                    int price = 20;
                    System.out.println(
                            "\nOh, this old thing? Well... I suppose I could give it to you - for a price.\nI think "
                                    + price + "g is fair.");
                    System.out.println("[1] Accept" + "\n[2] Decline");
                    apothecaryPurchase(price, item);
                }
                // Menu option selected: [3] Exit
                if (input == 3) {
                    purchase = false;
                    break;
                }
            }
        }
    }

    /**
     * Method for player encounter to fill the Empty Goblet with the Lost Maiden's
     * tears.
     * <p>
     * Player's bag must contain the Empty Goblet Item for the encounter to succeed.
     */
    private static void maidenTearsEncounter() {
        // If player bag contains Empty Goblet item, call appropriate story method
        if (Misc.containsItem("Empty Goblet")) {
            Misc.printHeading(Story.tearsSucceedStory());
            /**
             * Goblet we want to remove is the Empty Goblet.
             */
            int goblet = Misc.indexItem("Empty Goblet");
            Game.player.getPlayerItems().remove(goblet);
            Game.player.getPlayerItems().add(ItemList.filledGoblet());
        } else if (!Misc.containsItem("Empty Goblet")) {
            // If player bag does not contain Empty Goblet item, call appropriate story
            // method
            Misc.printHeading(Story.tearsFailStory());
        }
    }

    /**
     * Method for player encounter to receive Cathedral Key after Forgemaster Fuego
     * battle.
     * <p>
     * Player bag must contain Forgemaster's Greatsword Item for interaction to succeed.
     */
    private static void cathedralKeyEncounter() {
        // If player bag contains Forgemaster's Greatsword, add a Cathedral Key to
        // player bag
        if (Misc.containsItem("Forgemaster's Greatsword")) {
            Game.player.getPlayerItems().add(ItemList.cathedralKey());
            System.out.println(
                    "You take the key from Forgemaster Fuego's belt.\n You can now unlock the door to the Cathedral.");
        }
    }

    /**
     * Method for player encounter to receive the Blessed Goblet Item at the altar in the
     * cathedral.
     * <p>
     * Player bag must contain Filled Goblet Item for encounter to succeed.
     */
    private static void altarEncounter() {
        // If player bag contains Filled Goblet, call appropriate story method
        if (Misc.containsItem("Filled Goblet")) {
            Misc.printHeading(Story.altarSuccessStory());
            // Remove Filled Goblet from player's bag and add a Blessed Goblet
            Game.player.getPlayerItems().remove(ItemList.filledGoblet());
            Game.player.getPlayerItems().add(ItemList.blessedGoblet());
        } else {
            // If player bag does not contain Filled Goblet, call appropriate story method
            Misc.printHeading(Story.altarFailStory());
        }
    }

    /**
     * Method for player encounter after they have battled Count Eripmav.
     * <p>
     * If player bag contains Blessed Goblet Item, they get the great ending.
     * <p>
     * If player bag doesn't contain Blessed Goblet Item, they get the good ending.
     */
    private static void eripmavEncounter() {
        if (Game.player.getCurrentLocation().getEnemy().getCurHp() <= 0) {
            if (Misc.containsItem("Blessed Goblet")) {
                Misc.clearConsole();
                Misc.titleArt();
                Misc.sleep(300);
                Misc.printHeading(Story.greatEndingStory());
                Misc.sleep(300);
                Misc.printHeading("Congratulations on defeating the evil Count Eripmav and saving the town!");
                Game.isRunning=false;
                System. exit(0);

            } else {
                Misc.clearConsole();
                Misc.titleArt();
                Misc.sleep(300);
                Misc.printHeading(Story.goodEndingStory());
                Misc.sleep(300);
                Misc.printHeading("You won the battle! But did you really defeat the Count? Replay and try all your options!");
                Game.isRunning=false;
                System. exit(0);
            }
        }
    }
}

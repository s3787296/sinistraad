import java.util.ArrayList;

/**
 * Player class contains all Player methods, attributes and constructors.
 * 
 * @author Max
 * @version 0.28
 */
public class Player {

    /**
     * Name of current player.
     */
    private String name;
    /**
     * Player's max HP.
     */
    private int maxHp;
    /**
     * Player's current HP.
     */
    private int curHp;
    /**
     * Experience points player has, used in combat loop.
     */
    private int xp;
    /**
     * Player's current map location, used in logic while travelling and exploring.
     */
    private Location currentLocation;
    /**
     * playerItems ArrayList stores the items that the player has in their bag.
     */
    private ArrayList<Item> playerItems;
    /**
     * playerPotions ArrayList stores the potions that the player has in their bag.
     */
    private ArrayList<Item> playerPotions;

    /**
     * Amount of gold the player has, used to buy the Empty Goblet and the Healing
     * Potion from the Apothecary.
     */
    private int gold;
    /**
     * The number of rests the player has.
     */
    private int rests;

    /**
     * Attack points of Weapon Items in player's bag.
     */
    private int weaponAtk;
    /**
     * Defense points of Armour Items in player's bag.
     */
    private int armourDef;
    /**
     * Bonus player attack from Item Buff.
     */
    private int bonusAtk;
    /**
     * Bonus player defense from Item Buff.
     */
    private int bonusDef;

    /**
     * Getter method for player potions
     * 
     * @return this.playerPotions
     */
    public ArrayList<Item> getPlayerPotions() {
        return this.playerPotions;
    }

    /**
     * Setter method for player potions
     * 
     * @param playerPotions Player's potions in bag
     */
    public void setPlayerPotions(ArrayList<Item> playerPotions) {
        this.playerPotions = playerPotions;
    }

    /**
     * Getter method for player items
     * 
     * @return this.playerItems
     */
    public ArrayList<Item> getPlayerItems() {
        return this.playerItems;
    }

    /**
     * Setter method for player items
     * 
     * @param playerItems Player's items in bag
     */
    public void setPlayerItems(ArrayList<Item> playerItems) {
        this.playerItems = playerItems;
    }

    /**
     * Getter method for player current location
     * 
     * @return this.currentLocation
     */
    public Location getCurrentLocation() {
        return this.currentLocation;
    }

    /**
     * Setter method for player current location
     * 
     * @param currentLocation Player's current location
     */
    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * Getter method for player weapon atk
     * 
     * @return this.weaponAtk
     */
    public int getWeaponAtk() {
        return this.weaponAtk;
    }

    /**
     * Setter method for player weapon atk
     * 
     * @param weaponAtk Weapon item attack
     */
    public void setWeaponAtk(int weaponAtk) {
        this.weaponAtk = weaponAtk;
    }

    /**
     * Getter method for player armour def
     * 
     * @return this.armourDef
     */
    public int getArmourDef() {
        return this.armourDef;
    }

    /**
     * Setter method for player armour def.
     * 
     * @param armourDef Armour item defense
     */
    public void setArmourDef(int armourDef) {
        this.armourDef = armourDef;
    }

    /**
     * Getter method for player bonus atk.
     * 
     * @return this.bonusAtk
     */
    public int getBonusAtk() {
        return this.bonusAtk;
    }

    /**
     * Setter method for player bonus atk.
     * 
     * @param bonusAtk Bonus attack buff
     */
    public void setBonusAtk(int bonusAtk) {
        this.bonusAtk = bonusAtk;
    }

    /**
     * Getter method for player bonus def.
     * 
     * @return this.bonusDef
     */
    public int getBonusDef() {
        return this.bonusDef;
    }

    /**
     * Setter method for player bonusdef.
     * 
     * @param bonusDef Bonus defense buff
     */
    public void setBonusDef(int bonusDef) {
        this.bonusDef = bonusDef;
    }

    /**
     * Getter method for player name
     * 
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for player name.
     * 
     * @param name Name of player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for player max hp.
     * 
     * @return this.maxHp
     */
    public int getMaxHp() {
        return this.maxHp;
    }

    /**
     * Setter method for player max hp.
     * 
     * @param maxHp Player's max hp
     */
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    /**
     * Getter method for player current hp.
     * 
     * @return this.curHp
     */
    public int getCurHp() {
        return this.curHp;
    }

    /**
     * Setter method for player current hp.
     * 
     * @param curHp Player's current hp
     */
    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    /**
     * Getter method for player xp.
     * 
     * @return this.xp
     */
    public int getXp() {
        return this.xp;
    }

    /**
     * Setter method for player xp.
     * 
     * @param xp Player xp
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * Getter method for player gold.
     * 
     * @return this.gold
     */
    public int getGold() {
        return this.gold;
    }

    /**
     * Setter method for player gold.
     * 
     * @param gold Gold player has
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * Getter method for player rests.
     * 
     * @return this.rests Rests player has
     */
    public int getRests() {
        return this.rests;
    }

    /**
     * Setter method for player rests.
     * 
     * @param rests Rests player has
     */
    public void setRests(int rests) {
        this.rests = rests;
    }



    /**
     * Method to check for player bonuses
     */
    public void checkBonus(){
        if (Misc.containsItem("Hero's Sword")) {
            Game.player.setWeaponAtk(5);
        }
        if (Misc.containsItem("Hero's Garb")) {
            Game.player.setArmourDef(5);
        }
        if (Misc.containsItem("Wolfhide Armour")) {
            Game.player.setArmourDef(15);
        }
        if (Misc.containsItem("Matriarch's Blood")) {
            Game.player.setBonusAtk(10);
        }
        if (Misc.containsItem("Maiden's Blessing")) {
            Game.player.setBonusDef(10);
        }
        if (Misc.containsItem("Forgemaster's Greatsword")) {
            Game.player.setWeaponAtk(15);
        }
    }

    /**
     * Player-specific constructor.
     * <p>
     * Creates a player with all attributes and a list of items and potions in
     * player bag.
     * 
     * @param name Player name
     */
    public Player(String name) {
        // Setting initial core player attributes
        this.name = name;
        this.maxHp = 100;
        this.xp = 0;
        this.curHp = maxHp;
        // Setting additional player attributes
        this.gold = 30;
        this.rests = 1;
        playerItems = new ArrayList<Item>();
        playerPotions = new ArrayList<Item>();
    }

    /**
     * Player-specific attack calculation.
     * 
     * @return Attack amount
     */
    public int combatAtk() {
        return ((int) (Math.random() * 5) + (xp / 10) + armourDef + bonusDef);
    }

    /**
     * Player-specific defense calculation.
     * 
     * @return Defense amount
     */
    public int combatDef() {
        return ((int) (Math.random() * 5) + (xp / 10) + armourDef + bonusDef);
    }

    /**
     * Player-specific drop method to remove items from bag and add to
     * currentLocation.
     * 
     * @param item Item in player bag
     */
    public void dropItem(Item item) {
        Game.player.currentLocation.getLocationItems().add(item);
        Game.player.getPlayerItems().remove(item);
    }

    /**
     * Player-specific pickup method to add items to bag from currentLocation.
     * 
     * @param item Item in current location
     */
    public void pickupItem(Item item) {
        Game.player.getPlayerItems().add(item);
        Game.player.currentLocation.getLocationItems().remove(item);
    }
}

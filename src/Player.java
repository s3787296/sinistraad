import java.util.ArrayList;

/**
 * Player class contains all player attributes and constructors.
 * 
 * @author Max
 */
public class Player {

    /**
     * Core player attributes
     */
    private String name;
    private int maxHp;
    private int curHp;
    private int xp;
    private int level = xp / 10;

    private Location currentLocation;
    private ArrayList<Item> playerItems;
    private ArrayList<Item> playerPotions;

    /**
     * Additional player attributes
     */
    private int gold;
    private int rests;

    /**
     * Player weapon, armour and buff bonuses
     */
    private int weaponAtk;
    private int armourDef;
    private int bonusAtk;
    private int bonusDef;

    /**
     * Getter method for player potions
     * 
     * @return
     */
    public ArrayList<Item> getPlayerPotions() {
        return this.playerPotions;
    }

    /**
     * Setter method for player potions
     * 
     * @param playerPotions
     */
    public void setPlayerPotions(ArrayList<Item> playerPotions) {
        this.playerPotions = playerPotions;
    }

    /**
     * Getter method for player items
     * 
     * @return
     */
    public ArrayList<Item> getPlayerItems() {
        return this.playerItems;
    }

    /**
     * Setter method for player items
     * 
     * @param playerItems
     */
    public void setPlayerItems(ArrayList<Item> playerItems) {
        this.playerItems = playerItems;
    }

    /**
     * Getter method for player current location
     * 
     * @return
     */
    public Location getCurrentLocation() {
        return this.currentLocation;
    }

    /**
     * Setter method for player current location
     * 
     * @param currentLocation
     */
    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * Getter method for player weapon atk
     * 
     * @return
     */
    public int getWeaponAtk() {
        return this.weaponAtk;
    }

    /**
     * Setter method for player weapon atk
     * 
     * @param weaponAtk
     */
    public void setWeaponAtk(int weaponAtk) {
        this.weaponAtk = weaponAtk;
    }

    /**
     * Getter method for player armour def
     * 
     * @return
     */
    public int getArmourDef() {
        return this.armourDef;
    }

    /**
     * Setter method for player armour def
     * 
     * @param armourDef
     */
    public void setArmourDef(int armourDef) {
        this.armourDef = armourDef;
    }

    /**
     * Getter method for player bonus atk
     * 
     * @return
     */
    public int getBonusAtk() {
        return this.bonusAtk;
    }

    /**
     * Setter method for player bonus atk
     * 
     * @param bonusAtk
     */
    public void setBonusAtk(int bonusAtk) {
        this.bonusAtk = bonusAtk;
    }

    /**
     * Getter method for player bonus def
     * 
     * @return
     */
    public int getBonusDef() {
        return this.bonusDef;
    }

    /**
     * Setter method for player bonusdef
     * 
     * @param bonusDef
     */
    public void setBonusDef(int bonusDef) {
        this.bonusDef = bonusDef;
    }

    /**
     * Getter method for player name
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for player name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for player max hp
     * 
     * @return
     */
    public int getMaxHp() {
        return this.maxHp;
    }

    /**
     * Setter method for player max hp
     * 
     * @param maxHp
     */
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    /**
     * Getter method for player current hp
     * 
     * @return
     */
    public int getCurHp() {
        return this.curHp;
    }

    /**
     * Setter method for player current hp
     * 
     * @param curHp
     */
    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    /**
     * Getter method for player xp
     * 
     * @return
     */
    public int getXp() {
        return this.xp;
    }

    /**
     * Setter method for player xp
     * 
     * @param xp
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * Getter method for player level
     * 
     * @return
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Setter method for player level
     * 
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Getter method for player gold
     * 
     * @return
     */
    public int getGold() {
        return this.gold;
    }

    /**
     * Setter method for player gold
     * 
     * @param gold
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * Getter method for player rests
     * 
     * @return
     */
    public int getRests() {
        return this.rests;
    }

    /**
     * Setter method for player rests
     * 
     * @param rests
     */
    public void setRests(int rests) {
        this.rests = rests;
    }

    /**
     * Method to reset player bonuses
     */
    public void neuter() {
        weaponAtk = 0;
        armourDef = 0;
        bonusAtk = 0;
        bonusDef = 0;
    }

    /**
     * Player-specific constructor
     * 
     * @param name
     */
    public Player(String name) {
        // Setting intial core player attributes
        this.name = name;
        this.maxHp = 100;
        this.xp = 0;
        this.curHp = maxHp;
        // Settting additional player attributes
        this.gold = 30;
        this.rests = 1;
        playerItems = new ArrayList<Item>();
        playerPotions = new ArrayList<Item>();
    }

    /**
     * Player-specific attack calculation
     * 
     * @return
     */
    public int combatAtk() {
        return ((int) (Math.random() * 5) + (xp / 10) + armourDef + bonusDef);
    }

    /**
     * Player-specific defence calculation
     * 
     * @return
     */
    public int combatDef() {
        return ((int) (Math.random() * 5) + (xp / 10) + armourDef + bonusDef);
    }

    /**
     * Player-specific to remove items from bag and add to currentlocation
     * 
     * @param item
     */
    public void dropItem(Item item) {
        Game.player.currentLocation.getLocationItems().add(item);
        Game.player.getPlayerItems().remove(item);
    }

    /**
     * Player-specific pickup method to add items to bag from currentlocation
     * 
     * @param item
     */
    public void pickupItem(Item item) {
        Game.player.getPlayerItems().add(item);
        Game.player.currentLocation.getLocationItems().remove(item);
    }
}

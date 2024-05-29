import java.util.ArrayList;

public class Player {

    // Core player attributes
    private String name;
    private int maxHp;
    private int curHp;
    private int xp;
    private Location currentLocation;
    private ArrayList<Item> playerItems;
    private ArrayList<Item> playerPotions;

    // Additional player attributes
    private int gold;
    private int rests;

    // Player weapon, armour and buff bonuses
    private int weaponAtk;
    private int armourDef;
    private int bonusAtk;
    private int bonusDef;

    // Getter method for player potions
    public ArrayList<Item> getPlayerPotions() {
        return this.playerPotions;
    }

    // Setter method for player potions
    public void setPlayerPotions(ArrayList<Item> playerPotions) {
        this.playerPotions = playerPotions;
    }

    // Getter method for player items
    public ArrayList<Item> getPlayerItems() {
        return this.playerItems;
    }

    // Setter method for player items
    public void setPlayerItems(ArrayList<Item> playerItems) {
        this.playerItems = playerItems;
    }

    // Getter method for player current location
    public Location getCurrentLocation() {
        return this.currentLocation;
    }

    // Setter method for player current location
    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    // Getter method for player weapon atk
    public int getWeaponAtk() {
        return this.weaponAtk;
    }

    // Setter method for player weapon atk
    public void setWeaponAtk(int weaponAtk) {
        this.weaponAtk = weaponAtk;
    }

    // Getter method for player armour def
    public int getArmourDef() {
        return this.armourDef;
    }

    // Setter method for player armour def
    public void setArmourDef(int armourDef) {
        this.armourDef = armourDef;
    }

    // Getter method for player bonus atk
    public int getBonusAtk() {
        return this.bonusAtk;
    }

    // Setter method for player bonus atk
    public void setBonusAtk(int bonusAtk) {
        this.bonusAtk = bonusAtk;
    }

    // Getter method for player bonus def
    public int getBonusDef() {
        return this.bonusDef;
    }

    // Setter method for player bonusdef
    public void setBonusDef(int bonusDef) {
        this.bonusDef = bonusDef;
    }

    // Getter method for player name
    public String getName() {
        return this.name;
    }

    // Setter method for player name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for player max hp
    public int getMaxHp() {
        return this.maxHp;
    }

    // Setter method for player max hp
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    // Getter method for player current hp
    public int getCurHp() {
        return this.curHp;
    }

    // Setter method for player current hp
    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    // Getter method for player xp
    public int getXp() {
        return this.xp;
    }

    // Setter method for player xp
    public void setXp(int xp) {
        this.xp = xp;
    }

    // Getter method for player gold
    public int getGold() {
        return this.gold;
    }

    // Setter method for player gold
    public void setGold(int gold) {
        this.gold = gold;
    }

    // Getter method for player rests
    public int getRests() {
        return this.rests;
    }

    // Setter method for player rests
    public void setRests(int rests) {
        this.rests = rests;
    }

    // Player-specific constructor
    public Player(String name) {
        // Setting intial core player attributes
        this.name = name;
        this.maxHp = 100;
        this.xp = 0;
        this.curHp = maxHp;
        // Settting additional player attributes
        this.gold = 10;
        this.rests = 1;
        playerItems = new ArrayList<Item>();
        playerPotions = new ArrayList<Item>();
    }

    // Player-specific attack calculation
    public int combatAtk() {
        return (int) (((Math.random() * 10) + 1) + weaponAtk + bonusAtk);
    }

    // Player-specific defence calculation
    public int combatDef() {
        return (int) (((Math.random() * 10) + 1) + armourDef + bonusDef);
    }

    // Player-specific to remove items from bag and add to currentlocation
    public void dropItem(Item item) {
        Game.player.currentLocation.getLocationItems().add(item);
        Game.player.getPlayerItems().remove(item);
    }

    // Player-specific pickup method to add items to bag from currentlocation
    public void pickupItem(Item item) {
        Game.player.getPlayerItems().add(item);
        Game.player.currentLocation.getLocationItems().remove(item);
    }
}

import java.util.ArrayList;

public class Player {

    // core player attributes
    private String name;
    private int maxHp, curHp, xp;
    private Location currentLocation;
    private ArrayList<Item> playerItems;
    private ArrayList<Item> playerPotions;
    // additional player attributes
    private int gold, rests;
    
    // player weapon, armour and buff bonuses
    private int weaponAtk, armourDef, bonusAtk, bonusDef;
    
    // getter method for player potions
    public ArrayList<Item> getPlayerPotions() {
        return this.playerPotions;
    }

    // setter method for player potions
    public void setPlayerPotions(ArrayList<Item> playerPotions) {
        this.playerPotions = playerPotions;
    }

    // getter method for player items
    public ArrayList<Item> getPlayerItems() {
        return this.playerItems;
    }

    // setter method for player items
    public void setPlayerItems(ArrayList<Item> playerItems) {
        this.playerItems = playerItems;
    }

    // getter method for player current location
    public Location getCurrentLocation() {
        return this.currentLocation;
    }

    // setter method for player current location
    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    // getter method for player weapon atk
    public int getWeaponAtk() {
        return this.weaponAtk;
    }

    // setter method for player weapon atk
    public void setWeaponAtk(int weaponAtk) {
        this.weaponAtk = weaponAtk;
    }

    // getter method for player armour def
    public int getArmourDef() {
        return this.armourDef;
    }

    // setter method for player armour def
    public void setArmourDef(int armourDef) {
        this.armourDef = armourDef;
    }

    // getter method for player bonus atk
    public int getBonusAtk() {
        return this.bonusAtk;
    }

    // setter method for player bonus atk
    public void setBonusAtk(int bonusAtk) {
        this.bonusAtk = bonusAtk;
    }

    // getter method for player bonus def
    public int getBonusDef() {
        return this.bonusDef;
    }

    // setter method for player bonusdef
    public void setBonusDef(int bonusDef) {
        this.bonusDef = bonusDef;
    }

    // getter method for player name
    public String getName() {
        return this.name;
    }
    // setter method for player name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for player max hp
    public int getMaxHp() {
        return this.maxHp;
    }

    // setter method for player max hp 
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    // getter method for player current hp 
    public int getCurHp() {
        return this.curHp;
    }

    // setter method for player current hp
    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    // getter method for player xp
    public int getXp() {
        return this.xp;
    }

    // setter method for player xp
    public void setXp(int xp) {
        this.xp = xp;
    }

    // getter method for player gold 
    public int getGold() {
        return this.gold;
    }

    // setter method for player gold
    public void setGold(int gold) {
        this.gold = gold;
    }

    // getter method for player rests
    public int getRests() {
        return this.rests;
    }

    // setter method for player rests
    public void setRests(int rests) {
        this.rests = rests;
    }

    // Player specific constructor
    public Player(String name) {
        // setting intial core player attributes
        this.name = name;
        this.maxHp = 100;
        this.xp = 0;
        this.curHp = maxHp;
        // settting additional player attributes
        this.gold = 10;
        this.rests = 1;
        playerItems = new ArrayList<Item>();
        playerPotions = new ArrayList<Item>();
    }

    // player specific attack calculation
    public int combatAtk() {
        return (int) (((Math.random() * 10) + 1) + weaponAtk + bonusAtk);
    }

    // player specific defence calculation
    public int combatDef() {
        return (int) (((Math.random() * 10) + 1) + armourDef + bonusDef);
    }

    // player specific drop method to remove items from play bag and add to currentlocation
    public void dropItem(Item item){
        Game.player.currentLocation.getLocationItems().add(item);
        Game.player.getPlayerItems().remove(item);
    }

    // player specific pickup method to add items to bag from currentlocation
    public void pickupItem(Item item){
        Game.player.getPlayerItems().add(item);
        Game.player.currentLocation.getLocationItems().remove(item);
    }
}
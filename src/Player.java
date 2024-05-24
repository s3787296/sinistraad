public class Player {

    // core player attributes
    private String name;
    private int maxHp, curHp, xp;

    // additional player attributes
    private int gold, rests, potions;
    
    // player weapon, armour and buff bonuses
    private int weaponAtk, armourDef, bonusAtk, bonusDef;

    public int getWeaponAtk() {
        return this.weaponAtk;
    }

    public void setWeaponAtk(int weaponAtk) {
        this.weaponAtk = weaponAtk;
    }

    public int getArmourDef() {
        return this.armourDef;
    }

    public void setArmourDef(int armourDef) {
        this.armourDef = armourDef;
    }

    public int getBonusAtk() {
        return this.bonusAtk;
    }

    public void setBonusAtk(int bonusAtk) {
        this.bonusAtk = bonusAtk;
    }

    public int getBonusDef() {
        return this.bonusDef;
    }

    public void setBonusDef(int bonusDef) {
        this.bonusDef = bonusDef;
    }

    // getter method for name variable
    public String getName() {
        return this.name;
    }
    // setter method for name variable
    public void setName(String name) {
        this.name = name;
    }

    // getter method for max hp variable
    public int getMaxHp() {
        return this.maxHp;
    }

    // setter method for max hp variable
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    // getter method for current hp variable
    public int getCurHp() {
        return this.curHp;
    }

    // setter method for name variable
    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    // getter method for xp variable
    public int getXp() {
        return this.xp;
    }

    // setter method for xp variable
    public void setXp(int xp) {
        this.xp = xp;
    }

    // getter method for gold variable
    public int getGold() {
        return this.gold;
    }

    // setter method for gold variable
    public void setGold(int gold) {
        this.gold = gold;
    }

    // getter method for rests variable
    public int getRests() {
        return this.rests;
    }

    // setter method for name variable
    public void setRests(int rests) {
        this.rests = rests;
    }

    // getter method for potions variable
    public int getPotions() {
        return this.potions;
    }

    // setter method for potions variable
    public void setPotions(int potions) {
        this.potions = potions;
    }

    // Player specific constructor
    public Player(String name) {
        // setting intial player values
        this.name = name;
        this.maxHp = 100;
        this.xp = 0;
        this.curHp = maxHp;
        // settting additional player stats
        this.gold = 10;
        this.rests = 1;
        this.potions = 0;
    }

    // player specific attack calculation
    public int combatAtk() {
        return (int) (((Math.random() * 10) + 1) + weaponAtk + bonusAtk);
    }

    // player specific defence calculation
    public int combatDef() {
        return (int) (((Math.random() * 10) + 1) + armourDef + bonusDef);
    }
}
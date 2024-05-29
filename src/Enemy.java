public class Enemy {

    // core enemy attributes
    private String name, type;
    private int maxHp, curHp, xp, level;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

    // setter method for current hp variable
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

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // enemy specific constructor
    public Enemy(String name, String type, int level) {
        // character constructor
        this.name = name;
        this.type = type;
        this.maxHp = (int) (((Math.random() * 10) + 1) + (level/10)+5);
        this.curHp = maxHp;
        this.xp = (int) (((Math.random() * 10) + 1) + (maxHp/10));
        this.level = level;
    }

    // Enemy specific attack calculation
    public int combatAtk() {
        return (int) (((Math.random() * 10) + 1) + (level/4));
    }

    // Enemy specific defence calculation
    public int combatDef() {
        return (int) (((Math.random() * 10) + 1) + (level/4));
    }

}
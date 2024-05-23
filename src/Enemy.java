public class Enemy {

    // attributes for all characters
    private String name;
    private int maxHp, curHp, xp;

    // variable to store players values
    private int playerXp;

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

    // getter method for player xp variable
    public int getPlayerXp() {
        return this.playerXp;
    }

    // setter method for player xp variable
    public void setPlayerXp(int playerXp) {
        this.playerXp = playerXp;
    }

    // enemy specific constructor
    public Enemy(String name, int playerXp) {
        // character constructor
        this.name = name;
        this.maxHp = (int) (((Math.random() * 10) + 1) + (playerXp+playerXp/4));
        this.curHp = maxHp;
        this.xp = (int) (((Math.random() * 10) + 1) + (playerXp/4));
        this.playerXp = playerXp;
    }

    // Enemy specific attack calculation
    public int combatAtk() {
        return (int) (((Math.random() * 10) + 1) + (playerXp/4));
    }

    // Enemy specific defence calculation
    public int combatDef() {
        return (int) (((Math.random() * 10) + 1) + (playerXp/4));
    }

}
public class Enemy {

    // core enemy attributes
    private String name, type, before, after;
    private int maxHp, curHp, xp, level;
    private Item item;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBefore() {
        return this.before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return this.after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public int getMaxHp() {
        return this.maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurHp() {
        return this.curHp;
    }

    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    public int getXp() {
        return this.xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    

    // primary enemy constructor
    public Enemy(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.maxHp = (int) (((Math.random() * 10) + 1) + (level/10)+5);
        this.curHp = maxHp;
        this.xp = (int) (((Math.random() * 10) + 1) + (maxHp/10));
        this.level = level;
    }

    // primary enemy constructor
    public Enemy(String name, String type, int level, String before, String after, Item item) {
        this.name = name;
        this.type = type;
        this.maxHp = (int) (((Math.random() * 10) + 1) + (level/10)+5);
        this.curHp = maxHp;
        this.xp = (int) (((Math.random() * 10) + 1) + (maxHp/10));
        this.level = level;
        this.before = before;
        this.after = after;
        this.item = item;
    }

    // Enemy attack calculation
    public int combatAtk() {
        return (int) (((Math.random() * 10) + 1) + (level/4));
    }

    // Enemy defence calculation
    public int combatDef() {
        return (int) (((Math.random() * 10) + 1) + (level/4));
    }

}
public class Enemy {

    // Core enemy attributes
    private String name;
    private String type;
    private String before;
    private String after;
    private int maxHp;
    private int curHp;
    private int xp;
    private int level;
    private Item item;

    // Getter method for enemy's name
    public String getName() {
        return this.name;
    }

    // Setter method for enemy's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for enemy type
    public String getType() {
        return this.type;
    }

    // Setter method for enemy type
    public void setType(String type) {
        this.type = type;
    }

    // Getter method for getting pre-combat text
    public String getBefore() {
        return this.before;
    }

    // Setter method for getting pre-combat text
    public void setBefore(String before) {
        this.before = before;
    }

    // Setter method for getting post-combat text
    public String getAfter() {
        return this.after;
    }

    // Setter method for getting post-combat text
    public void setAfter(String after) {
        this.after = after;
    }

    // Getter method for max hp
    public int getMaxHp() {
        return this.maxHp;
    }

    // Setter method for max hp
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    // Getter method for current hp
    public int getCurHp() {
        return this.curHp;
    }

    // Setter method for current hp
    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    // Getter method for xp
    public int getXp() {
        return this.xp;
    }

    // Setter method for xp
    public void setXp(int xp) {
        this.xp = xp;
    }

    // Getter method for level
    public int getLevel() {
        return this.level;
    }

    // Setter method for level
    public void setLevel(int level) {
        this.level = level;
    }

    // Getter method for items which are dropped once player defeats enemy
    public Item getItem() {
        return this.item;
    }

    // Setter method for items which are dropped once player defeats enemy
    public void setItem(Item item) {
        this.item = item;
    }

    // Primary enemy constructor (Type: Enemy)
    public Enemy(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.maxHp = (int) (((Math.random() * 10) + 1) + (level / 4) + 5);
        this.curHp = maxHp;
        this.xp = (int) (((Math.random() * 10) + 1) + (level / 4) + 5);
        this.level = level;
    }

    // Secondary enemy constructor (Type: Boss)
    public Enemy(String name, String type, int level, String before, String after, Item item) {
        this.name = name;
        this.type = type;
        this.maxHp = (int) (((Math.random() * 10) + 1) + (level / 4) + 5);
        this.curHp = maxHp;
        this.xp = (int) (((Math.random() * 10) + 1) + (level / 4) + 5);
        this.level = level;
        this.before = before;
        this.after = after;
        this.item = item;
    }

    // Enemy attack calculation
    public int combatAtk() {
        return (int) (((Math.random() * 10) + 1) + (level / 4) + 5);
    }

    // Enemy defense calculation
    public int combatDef() {
        return (int) (((Math.random() * 10) + 1) + (level / 4) + 5);
    }
}
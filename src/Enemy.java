/**
 * Enemy class handles Enemy methods, attributes and constructors.
 * 
 * @author Max
 * @author Jude
 * @version 0.24
 */
public class Enemy {

    /**
     * Name variable for enemy's display name, e.g. "Lost Maiden".
     */
    private String name;
    /**
     * The type of enemy, e.g. "Boss".
     */
    private String type;
    /**
     * The enemy's pre-battle story.
     */
    private String before;
    /**
     * The enemy's post-battle story.
     */
    private String after;
    /**
     * Enemy's max HP.
     */
    private int maxHp;
    /**
     * Enemy's current HP.
     */
    private int curHp;
    /**
     * Enemy's xp for combat calculations.
     */
    private int xp;
    /**
     * Enemy level for combat calculations.
     */
    private int level;
    /**
     * Any items the Enemy drops upon defeat.
     */
    private Item item;

    /**
     * Getter method for Enemy's name.
     * 
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for enemy's name.
     * 
     * @param name Enemy's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for enemy type.
     * 
     * @return this.type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter method for enemy type.
     * 
     * @param type Type of enemy
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for getting pre-combat text.
     * 
     * @return this.before
     */
    public String getBefore() {
        return this.before;
    }

    /**
     * Setter method for getting pre-combat text.
     * 
     * @param before Pre-battle story
     */
    public void setBefore(String before) {
        this.before = before;
    }

    /**
     * Setter method for getting post-combat text.
     * 
     * @return this.after
     */
    public String getAfter() {
        return this.after;
    }

    /**
     * Setter method for getting post-combat text.
     * 
     * @param after Post-battle text.
     */
    public void setAfter(String after) {
        this.after = after;
    }

    /**
     * Getter method for enemy's max hp.
     * 
     * @return this.maxHp
     */
    public int getMaxHp() {
        return this.maxHp;
    }

    /**
     * Setter method for enemy's max hp.
     * 
     * @param maxHp Enemy's max hp
     */
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    /**
     * Getter method for enemy's current hp.
     * 
     * @return this.curHp
     */
    public int getCurHp() {
        return this.curHp;
    }

    /**
     * Setter method for enemy's current hp.
     * 
     * @param curHp Enemy's current HP
     */
    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    /**
     * Getter method for enemy's xp.
     * 
     * @return this.xp
     */
    public int getXp() {
        return this.xp;
    }

    /**
     * Setter method for enemy's xp.
     * 
     * @param xp Enemy's xp
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * Getter method for enemy's level.
     * 
     * @return this.level
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Setter method for enemy's level.
     * 
     * @param level Enemy's level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Getter method for item dropped once player defeats enemy.
     * 
     * @return this.item
     */
    public Item getItem() {
        return this.item;
    }

    /**
     * Setter method for items which are dropped once player defeats enemy.
     * 
     * @param item Item dropped by enemy upon defeat
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Primary Enemy constructor method (Type: Enemy).
     * <p>
     * Constructs a regular enemy; one which doesn't have any story/combat text and
     * doesn't drop any items upon defeat.
     * 
     * @param name  Enemy name
     * @param type  Boss type
     * @param maxHp Enemy max hp
     * @param level Enemy level
     */
    public Enemy(String name, String type, int maxHp, int level) {
        this.name = name;
        this.type = type;
        this.maxHp = maxHp;
        this.curHp = maxHp;
        this.xp = (int) ((Math.random() * 5) + (level / 10) + (maxHp / 10));
        this.level = level;
    }

    /**
     * Secondary enemy constructor (Type: Boss).
     * <p>
     * Constructs a Boss enemy which has pre and post-combat story text and drops
     * item upon defeat.
     * 
     * @param name   Enemy name
     * @param type   Boss type
     * @param maxHp  Enemy max hp
     * @param level  Enemy level
     * @param before Before combat story
     * @param after  Post combat story
     * @param item   Item dropped by enemy
     */
    public Enemy(String name, String type, int maxHp, int level, String before, String after, Item item) {
        this.name = name;
        this.type = type;
        this.maxHp = maxHp;
        this.curHp = maxHp;
        this.xp = (int) ((Math.random() * 5) + 5 +(level / 10) + (maxHp / 10));
        this.level = level;
        this.before = before;
        this.after = after;
        this.item = item;
    }

    /**
     * Enemy attack calculation.
     * 
     * @return The amount of damage the enemy does.
     */
    public int combatAtk() {
        return (int) ((Math.random() * 5) + 5 + (level / 10) + (maxHp / 10));
    }

    /**
     * Enemy defense calculation.
     * 
     * @return The amount of defense the enemy has.
     */
    public int combatDef() {
        return (int) ((Math.random() * 5) + 5 +(level / 10) + (maxHp / 10));
    }
}
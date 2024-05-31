/**
 * Item class contains all Item methods, attributes and constructors.
 * 
 * @author Max
 *         TODO (Pre-push: Update version)
 * @version 0.9
 */
public class Item {

    /**
     * Item display name, e.g. "Empty Goblet".
     */
    private String name;
    /**
     * Type of item, e.g. "Quest" or "Weapon"
     */
    private String type;
    /**
     * Item description for player to read.
     */
    private String desc;
    /**
     * Item buff, used to modify player attack and damage stats, and use in loops to
     * grant player access to locked locations.
     */
    private String buff;

    /**
     * Getter method for item name
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for item name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for item type
     * 
     * @return
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter method for item type
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for item description
     * 
     * @return
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * Setter method for item description
     * 
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Getter method for item buff
     * 
     * @return
     */
    public String getBuff() {
        return this.buff;
    }

    /**
     * Setter method for item buff
     * 
     * @param buff
     */
    public void setBuff(String buff) {
        this.buff = buff;
    }

    /**
     * Constructor method for item object
     * 
     * @param name
     * @param type
     * @param desc
     * @param buff
     */
    public Item(String name, String type, String desc, String buff) {
        this.name = name;
        this.type = type;
        this.desc = desc;
        this.buff = buff;
    }

    /**
     * toString() method for printing item details
     */
    @Override
    public String toString() {
        Misc.printHeading(getName());
        System.out.println("Type: " + getType());
        System.out.println("Desc: " + getDesc());
        System.out.println("Buff: " + getBuff());
        return "";
    }
}

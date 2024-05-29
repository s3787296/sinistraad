public class Item {

    // Attributes for item object
    private String name;
    private String type;
    private String desc;
    private String buff;

    // Getter method for item name
    public String getName() {
        return this.name;
    }

    // Setter method for item name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for item type
    public String getType() {
        return this.type;
    }

    // Setter method for item type
    public void setType(String type) {
        this.type = type;
    }

    // Getter method for item description
    public String getDesc() {
        return this.desc;
    }

    // Setter method for item description
    public void setDesc(String desc) {
        this.desc = desc;
    }

    // Getter method for item buff
    public String getBuff() {
        return this.buff;
    }

    // Setter method for item buff
    public void setBuff(String buff) {
        this.buff = buff;
    }

    // Constructor method for item object
    public Item (String name, String type, String desc, String buff){
        this.name = name;
        this.type = type;
        this.desc = desc;
        this.buff = buff;
    }  
    
    // toString() method for printing item details
    @Override
    public String toString() {
        Misc.printHeading(getName());
        System.out.println("Type: " + getType());
        System.out.println("Desc: " + getDesc());
        System.out.println("Buff: " + getBuff());
        return "";
    }
}

public class Item {

    //class attributes for item object
    private String name, type, desc, buff;

    // getter method for name variable
    public String getName() {
        return this.name;
    }

    // setter method for name variable
    public void setName(String name) {
        this.name = name;
    }

    // getter method for type variable
    public String getType() {
        return this.type;
    }

    // setter method for type variable
    public void setType(String type) {
        this.type = type;
    }

    // getter method for description variable
    public String getDesc() {
        return this.desc;
    }

    // setter method for description variable
    public void setDesc(String desc) {
        this.desc = desc;
    }

    // getter method for buff variable
    public String getBuff() {
        return this.buff;
    }

    // setter method for buff variable
    public void setBuff(String buff) {
        this.buff = buff;
    }

    //constructor method for item object
    public Item (String name, String type, String desc, String buff){
        this.name = name;
        this.type = type;
        this.desc = desc;
        this.buff = buff;
    }  
    
    // to string method for printing item details
    @Override
    public String toString() {
        Misc.printHeading(getName());
        System.out.println("Type: "+getType());
        System.out.println("Desc: "+getDesc());
        System.out.println("Buff: "+getBuff());
        return "";
    }
}

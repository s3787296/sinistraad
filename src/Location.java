import java.util.ArrayList;

public class Location {
    
    // core location attributes
    private String name, desc, area;

    // location specific arraylist
    private ArrayList<Item> locationItems;

    // getter method for location area
    public String getArea() {
        return this.area;
    }

    // setter method for location area
    public void setArea(String area) {
        this.area = area;
    }

    // getter method for location name
    public String getName() {
        return this.name;
    }

    // setter method for location name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for location desc
    public String getDesc() {
        return this.desc;
    }

    // setter method for location desc
    public void setDesc(String desc) {
        this.desc = desc;
    }

    // getter method for location arraylist
    public ArrayList<Item> getLocationItems() {
        return this.locationItems;
    }

    // setter method for location arraylist
    public void setLocationItems(ArrayList<Item> itemList) {
        this.locationItems = itemList;
    }

    // constructor method for location object
    public Location(String name, String area, String desc) {
        this.name = name;
        this.area = area;
        this.desc = desc;
        this.locationItems = new ArrayList<Item>();
    }

    // location tostring method
    @Override
    public String toString() {
        return "\nname:" + getName() + "\nDesc: " + getDesc() + "\nArea: " + getArea() + "\nLocation Items: " + getLocationItems();
    }

}

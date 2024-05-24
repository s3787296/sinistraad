import java.util.ArrayList;

public class Location {
    private String name;
    private String description;
    private ArrayList<Item> itemList;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Item> getItemList() {
        return this.itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    

    public Location (String name, String description){
        this.name = name;
        this.description = description;
        itemList = new ArrayList<Item>();
    }

    
}

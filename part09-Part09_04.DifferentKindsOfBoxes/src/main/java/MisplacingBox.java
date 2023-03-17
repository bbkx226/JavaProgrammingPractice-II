import java.util.ArrayList;

public class MisplacingBox extends Box{
    private ArrayList<Item> items;

    public MisplacingBox(){
        this.items = new ArrayList<>();
    }
    
    @Override
    public boolean isInBox(Item item) {
        return false;
    }

    @Override
    public void add(String name, int weight) {
        this.items.add(new Item(name,weight));
    }

    @Override
    public void add(Item item) {
        this.items.add(item);
    }
}

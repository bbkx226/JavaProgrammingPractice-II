import java.util.ArrayList;

public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> item;

    public OneItemBox(){
        this.capacity = 1;
        this.item = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(isFirstFree()){
            this.item.add(item);
        }
    }

    @Override
    public void add(String name, int weight) {
        if(isFirstFree()){
            this.item.add(new Item(name,weight));
        }
    }
    
    

    @Override
    public boolean isInBox(Item item) {
        if (this.item.contains(item)) {
            return true;
        }
        return false;
    }
    
    public boolean isFirstFree(){
        if(this.item.isEmpty() ){
            return true;
        }
        return false;
    }
}

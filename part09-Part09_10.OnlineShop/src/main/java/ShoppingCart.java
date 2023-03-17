import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> carts;

    public ShoppingCart(){
        this.carts = new HashMap<>();
    }

    public void add(String product, int price){
        if (carts.containsKey(product)) {
            Item newItem = carts.get(product);
            newItem.increaseQuantity();
            carts.put(product, newItem);
        } else {
            carts.put(product, new Item(product, 1, price));
        }
    }

    public int price(){
        int sum = 0;
        for (Item item : carts.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print(){
        for(Item item: carts.values()){
            System.out.println(item);
        }
    }
}

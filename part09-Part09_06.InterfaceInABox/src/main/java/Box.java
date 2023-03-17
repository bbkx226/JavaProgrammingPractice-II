import java.util.ArrayList;

public class Box implements Packable{
    private double maxWeight;
    private ArrayList<Packable> books;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.books = new ArrayList<>();
    }

    public void add(Packable item){
        if(!isMaxReached(item)){
            books.add(item);
        }
    }

    public double weight(){
        double weight = 0;
        if (books.size() > 0) {
            for (Packable item : books) {
                weight+= item.weight();
            }
        }

        return weight;
    };

    public boolean isMaxReached(Packable item) {
        if (this.weight()+ item.weight() <= this.maxWeight) {
            return false;
        }
        return true;
    }

    public String toString(){
        return "Box: " + books.size() + " items, " + "total weight " + weight() + " kg";
    }
}

import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        String out = "";
        for (Movable one : herd) {
            out += one.toString() + "\n";
        }
        return out;
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable one:herd){
            one.move(dx, dy);
        }
    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        hand.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand h) {
        int val = this.sumValues() - h.sumValues();

        return val ;
    }

    public int sumValues() {
        int sum = 0;
        for (Card card : this.hand) {
            sum = sum + card.getValue();
        }
        return sum;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
}

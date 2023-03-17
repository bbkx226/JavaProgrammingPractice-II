import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status){
        history.add(status);
    }

    public void clear(){
        history.clear();
    }
    
    public double maxValue(){
        double max = 0;
        if(history.isEmpty()){
            return 0.0;
        }
        for (double number : history){
            if (max < number){
                max = number;
            }
        }
        return max;
    }

    public double minValue(){
        double min = 99999999999.99;
        if(history.isEmpty()){
            return 0.0;
        }
        for (double number : history){
            if (min > number){
                min = number;
            }
        }
        return min;
    }

    public double average(){
        double sum = 0;
        int count = 0;
        if(history.isEmpty()){
            return 0.0;
        }
        for (double number : history){
            sum += number;
            count++;
        }
        return (sum/count);
    }

    public String toString(){
        return this.history.toString();
    }
}

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> person;
    public IOU(){
        this.person = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        person.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        if (!(person.containsKey(toWhom))){
            return 0;
        }
        return person.getOrDefault(toWhom, 0.0);
    }

}

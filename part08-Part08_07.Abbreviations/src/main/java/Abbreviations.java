import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> word;
    public Abbreviations(){
        this.word = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        word.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(this.word.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        if(this.hasAbbreviation(abbreviation)){
            return word.get(abbreviation);
        }
        return null;
    }
}

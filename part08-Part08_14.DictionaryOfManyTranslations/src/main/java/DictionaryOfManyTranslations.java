import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> words = this.dictionary.get(word);
        words.add(translation);
    }

    public ArrayList<String> translate(String word){
        ArrayList<String> empty = new ArrayList<>();
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        return empty;
    }

    public void remove(String word){
        dictionary.remove(word);
    }
}

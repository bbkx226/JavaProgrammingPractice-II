
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> person = new HashMap<>();

        person.put("matthew", "matt");
        person.put("michael", "mix");
        person.put("arthur", "artie");

        System.out.println( person.get("matthew"));
    }

}

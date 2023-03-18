
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if(value < 0){
                break;
            }
            values.add(value);
        }

        values.stream().filter(x -> x >= 1 && x <= 5).forEach(x -> System.out.println(x));
    }
}

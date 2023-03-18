import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String value = scanner.nextLine();
            if(value.equals("end")){
                break;
            }
            inputs.add(value);
        }



        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String decision = scanner.nextLine();
        if(decision.equals("p")){
            double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number >= 0)
            .average()
            .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        } else if(decision.equals("n")){
            double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number < 0)
            .average()
            .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }



    }
}


import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0;
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0){
                break;
            }
            if (value > 0){
                count++;
                sum += value;
            }

        }
        if(count == 0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println(1.0 * sum / count);
        }
    }
}

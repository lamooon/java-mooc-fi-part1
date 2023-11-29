
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int sum = 0;

        System.out.println("Give numbers:");
        int number = Integer.valueOf(scanner.nextLine());

        while (number != -1) {
            
            if (number % 2 ==0) {
                even++;
            } else {
                odd++;
            }

            sum += number;
            number = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Thx! Bye!");
        double average = 1.0 * sum / (even + odd);

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + (even + odd));
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}

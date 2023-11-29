
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }

            if (num > 0) {
                sum += num;
                count += 1;
            }

        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = sum / count;
            System.out.println(average);
        }

    }
}

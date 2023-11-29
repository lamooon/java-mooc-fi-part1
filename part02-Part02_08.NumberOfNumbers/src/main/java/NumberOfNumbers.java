
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int num;
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            numbers += 1;

        }
        System.out.println("Number of numbers: " + numbers);
    }
}

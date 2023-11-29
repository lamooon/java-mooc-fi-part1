
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while (!word.equals("end")) {
            int number = Integer.valueOf(word);
            System.out.println(number * number * number);

            word = scanner.nextLine();
        }
    }
}

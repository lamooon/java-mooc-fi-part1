
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (true) {

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(" ");
            System.out.println(pieces[0]);

            text = scanner.nextLine();
        }

    }
}


import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (true) {

            if (text.equals("")) {
                break;
            }

            String parts[] = text.split(" ");
            System.out.println(parts[parts.length - 1]);

            text = scanner.nextLine();
        }

    }
}

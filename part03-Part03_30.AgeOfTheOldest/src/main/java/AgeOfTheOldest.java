
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String text = scanner.nextLine();

        while (true) {

            if (text.equals("")) {
                break;
            }

            String[] info = text.split(",");
            if (oldest < Integer.valueOf(info[1])) {
                oldest = Integer.valueOf(info[1]);
            }

            text = scanner.nextLine();
        }

        System.out.println("Age of the oldest: " + oldest);
    }
}

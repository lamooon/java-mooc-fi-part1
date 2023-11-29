
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String text = scanner.nextLine();
        String name = "";
        while (true) {

            if (text.equals("")) {
                break;
            }

            String[] info = text.split(",");
            if (oldest < Integer.valueOf(info[1])) {
                oldest = Integer.valueOf(info[1]);
                name = info[0];
            }

            text = scanner.nextLine();
        }

        System.out.println("Name of the oldest: " + name);

    }
}


import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (true) {
            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }

            text = scanner.nextLine();
        }



    }
}

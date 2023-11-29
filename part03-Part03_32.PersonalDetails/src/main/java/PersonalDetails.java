
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int sum = 0;
        int counter = 0;
        String name = "";
        int longest = -1;
        String text = scanner.nextLine();

        while (true) {
            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");
            if (longest < pieces[0].length()) {
                name = pieces[0];
                longest = pieces[0].length();
            }
            sum += Integer.valueOf(pieces[1]);
            counter++;

            text = scanner.nextLine();
        }
        
        double average = 1.0 * sum / counter;

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}

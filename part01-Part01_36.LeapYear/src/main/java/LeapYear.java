
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = Integer.valueOf(scan.nextLine());

        if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}

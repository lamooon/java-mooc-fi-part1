
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double d = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean b = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + d);
        System.out.println("You gave the boolean " + b);

    }
}

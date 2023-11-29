
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int to = Integer.valueOf(scanner.next());
        System.out.print("Where from? ");
        int from = Integer.valueOf(scanner.next());
        
        if (from <= to) {
            while (from <= to) {
                System.out.println(from);
                from++;
            }
        }
    }
}

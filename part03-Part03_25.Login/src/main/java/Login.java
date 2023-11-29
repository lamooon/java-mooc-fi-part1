
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        System.out.print("Enter password: ");
        String pw = scanner.nextLine();
        if (name.equals(username[0]) || name.equals(username[1])){
            if (pw.equals(password[0]) || pw.equals(password[1])) {
                System.out.println("You have successfully logged in!");
                return;
            } 
        }
        System.out.println("Incorrect username or password!");
    }
}

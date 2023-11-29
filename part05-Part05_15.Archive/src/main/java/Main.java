
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> user = new ArrayList<>();
        while (true)
        {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) break;
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            User person = new User(identifier, name);
            if (!user.contains(person)) user.add(person);
        }

        System.out.println("==Items==");
        for (User person : user) {
            System.out.println(person.getIdentifier() + ": " + person.getName());
        }

        scanner.close();
    }
}

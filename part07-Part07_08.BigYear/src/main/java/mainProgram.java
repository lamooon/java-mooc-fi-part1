
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdCollector birds = new BirdCollector();
        System.out.print("? ");
        String command = scan.nextLine();
        while (true) {
            
            if (command.equals("Quit")) {
                break;
            }

            else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                birds.addBird(name, latinName);
            }

            else if (command.equals("All")) {
                birds.listAll();
            }

            else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                birds.findBird(name);
            }

            else if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                birds.observationMade(name);
            }

            System.out.print("? ");
            command = scan.nextLine();
        }

        scan.close();
    }

}

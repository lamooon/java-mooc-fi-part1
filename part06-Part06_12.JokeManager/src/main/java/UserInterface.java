import java.util.Scanner;
public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scn;

    public UserInterface(JokeManager jokeManager, Scanner scn) {

        this.jokeManager = jokeManager;
        this.scn = scn;
    }


    public void start() {

        System.out.println("What a joke!");
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = this.scn.nextLine();

            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scn.nextLine();
                this.jokeManager.addJoke(joke);
            } 
            else if (command.equals("2")) 
            {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeManager.drawJoke());    
            }
            else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }
        }
    }
    
}

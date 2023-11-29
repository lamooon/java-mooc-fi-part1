
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Container firstContainer = new Container();
        Container secondContainer = new Container();
        int amount;
        String command;
        while (true)
        {    
            System.out.print("First: " + firstContainer.contains() + "/100" +'\n');
            System.out.print("Second: " + secondContainer.contains() + "/100" + '\n');

            String[] input = scan.nextLine().split(" ");
            command = input[0];

            if (command.equals("quit")) {
                break;
            }
            
            amount = Integer.parseInt(input[1]);
            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            else if (command.equals("move")) {
                if (firstContainer.contains() < amount)
                {
                    amount = firstContainer.contains();
                }
                firstContainer.remove(amount);
                secondContainer.add(amount);
            }

            else if (command.equals("remove")) {
                secondContainer.remove(amount);
            }

            System.out.println();
        }
    }

}

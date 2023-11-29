
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int amount;
        while (true) {
            System.out.print("First: " + firstContainer + "/100" +'\n');
            System.out.print("Second: " + secondContainer + "/100" + '\n');

            String[] input = scan.nextLine().split(" ");
            if (input[0].equals("quit")) {
                break;
            }

            else if (input[0].equals("add")) {
                amount = Integer.parseInt(input[1]);
                if (amount < 0) amount = 0;

                if (firstContainer + amount <= 100) {
                    firstContainer += amount;
                }
                else {
                    firstContainer = 100;
                }
            }

            else if (input[0].equals("move")) {
                amount = Integer.parseInt(input[1]);

                if (firstContainer < amount && amount >= 0) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                }
                else if (firstContainer >= amount && amount >= 0) {
                    secondContainer += amount;
                    firstContainer -= amount;
                }

                if (secondContainer > 100) secondContainer = 100;
                if (firstContainer < 0) firstContainer = 0;
            }

            else if (input[0].equals("remove")) {
                amount = Integer.parseInt(input[1]);
                if (amount < 0) amount = 0;
                
                if (secondContainer - amount > 0) {
                    secondContainer -= amount;
                }
                else {
                    secondContainer = 0;
                }
            }


            System.out.println();
        }
    }

}

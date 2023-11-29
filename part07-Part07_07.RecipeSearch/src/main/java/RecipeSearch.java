import java.io.File;
import java.util.Scanner;
public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("File to read: ");  

        try {
            File textfile = new File(scn.nextLine());
            printCommand();
            RecipeManager rm = new RecipeManager();
            String command = scn.nextLine();
            while (true) {

                if (command.equals("stop")){
                    break;
                }
                rm.addRecipes(textfile);

                if (command.equals("list")) {
                    System.out.println();

                    rm.listRecipes();
                }
                else if (command.equals("find name")) {
                    System.out.print("Searched word: ");
                    String keyword = scn.nextLine();
                    System.out.println();
                    rm.findName(keyword);
                }
                else if (command.equals("find cooking time")) {
                    System.out.print("Max cooking time: ");
                    int time = Integer.parseInt(scn.nextLine());
                    rm.searchByTime(time);
                }
                else if (command.equals("find ingredient")) {
                    System.out.print("Ingredient: ");
                    String keyword = scn.nextLine();
                    rm.findIngredient(keyword);
                }

                System.out.print('\n' + "Enter command: ");
                command = scn.nextLine();
        }

        scn.close();
        return;
        }   
        catch (Exception e) {
            e.getMessage();
        }

    }

    public static void printCommand() {
        //output commands
        System.out.println();
        System.out.println("Commands: " + '\n' + 
                        "list - lists the receipes" + '\n' +
                        "stop - stops the program" + '\n' +
                        "find name - searches recipes by name" + '\n' +
                        "find cooking time - searches recipes by cooking time" + '\n' +
                        "find ingredient - searches recipes by ingredient" + '\n');
        System.out.print("Enter command: ");
    }
}




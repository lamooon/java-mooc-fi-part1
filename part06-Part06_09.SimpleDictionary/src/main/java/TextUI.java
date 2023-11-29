import java.util.Scanner;
public class TextUI {
    
    private Scanner scn;
    private SimpleDictionary simpleDictionary;

    public TextUI (Scanner scn, SimpleDictionary simpleDictionary) {
        this.scn = scn;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        System.out.print("Command: ");
        String command = this.scn.nextLine();
        String word;
        String translation;
        while (true)
        {
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            else if (command.equals ("add")) {
                System.out.print("Word: ");
                word = this.scn.nextLine();
                System.out.print("Translation: ");
                translation = this.scn.nextLine();
                this.simpleDictionary.add(word, translation);
            }
            else if (command.equals("search")) {
                System.out.print("To be translated: ");
                word = this.scn.nextLine();
                if (this.simpleDictionary.translate(word) == null) {
                    System.out.print("Word " + word + " was not found" + '\n');
                }
                else 
                {
                    System.out.print("Translation: " + this.simpleDictionary.translate(word) + '\n');
                }
            }
            else
            {
                System.out.println("Unknown command");
            }

            System.out.print("Command: ");
            command = this.scn.nextLine();
        }
       

    }
}

import java.util.Scanner;
public class UserInterface {
    
    private TodoList todoList;
    private Scanner scn;

    public UserInterface(TodoList todoList, Scanner scn) {

        this.todoList = todoList;
        this.scn = scn;
    }

    public void start() {

        System.out.print("Command: ");
        String cmd = this.scn.nextLine();
        String todo;
        int removeNum;
        while (true)
        {
            if (cmd.equals("stop")) {
                break;
            }
            else if (cmd.equals("add")) {
                System.out.print("To add: ");
                todo = this.scn.nextLine();
                this.todoList.add(todo);
            }
            else if (cmd.equals("list")) {
                this.todoList.print();
            }
            else if (cmd.equals("remove")) {
                System.out.print("Which one is removed? ");
                removeNum = Integer.parseInt(this.scn.nextLine());
                this.todoList.remove(removeNum);
            }

            System.out.print("Command: ");
            cmd = this.scn.nextLine();
        }
    }
}

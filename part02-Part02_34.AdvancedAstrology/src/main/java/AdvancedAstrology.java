
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        while (count <= size) {
            printSpaces(size - count);
            printStars(count);
            count++;
        }
    }

    public static void christmasTree(int height) {
        
        int count = 1;
        
        while (count <= height) {

            //tree
            printSpaces(height - count);
            printStars(2 * count - 1);

            count++;
        }
        //base
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

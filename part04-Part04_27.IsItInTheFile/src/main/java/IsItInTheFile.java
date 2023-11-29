import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<String> names = new ArrayList<String>();

        //read the file
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                names.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            ; //supposed to catch file existence here but mooc.fi designed it weirdly
        }

        //search for the names
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        //check if file exists
        if (names.isEmpty()) {
            System.out.println("Reading the file " + file + " failed.");
            return;
        }

        if (names.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }

    }
}

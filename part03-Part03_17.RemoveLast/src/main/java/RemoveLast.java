
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    public static void removeLast(ArrayList<String> strings) {
        int length = strings.size() - 1;
        if (length <= 0) {
            return;
        }
        strings.remove(length);
    }
}


import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {

        String ans = "";
        if (!this.elements.isEmpty()) {
            for (String element : elements) {

                if (ans.length() < element.length())
                {
                    ans = element;
                }
            }
        }
        else {
            ans = null;
        }

        return ans;
    }
}

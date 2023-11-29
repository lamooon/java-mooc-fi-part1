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

    public String toString() {

        StringBuilder sb = new StringBuilder();
        
        if (!elements.isEmpty())
        {
            if (elements.size() == 1) {
                sb.append("The collection " + this.name + " has 1 element:").append(System.getProperty("line.separator"));
                sb.append(elements.get(0));
            }
            else
            {
                sb.append("The collection " +  this.name + " has " + this.elements.size() + " elements:").append(System.getProperty("line.separator"));

                for (String str : elements) {
                    sb.append(str).append(System.getProperty("line.separator"));
                }
            }
        }
        else
        {
            sb.append("The collection " + this.name + " is empty.");
        }
       
        return sb.toString().trim();
    }
    
}

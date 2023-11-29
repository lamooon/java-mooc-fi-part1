import java.util.ArrayList;
public class Recipe {
    
    private String name;
    private int timeTaken;
    private ArrayList<String> ingredients;

    public Recipe (String name, int timeTaken) {

        this.name = name;
        this.timeTaken = timeTaken;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getTimeTaken() {
        return this.timeTaken;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.timeTaken;
    }
}

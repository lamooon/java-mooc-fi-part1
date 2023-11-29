import java.io.*;
import java.util.*;
public class RecipeManager {
    
    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }

    public void listRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void addRecipes(File textfile) {
        try {
            this.recipes = new ArrayList<>();
            Scanner fileReader = new Scanner(textfile);
            while (fileReader.hasNextLine())
            {
                String menuName = fileReader.nextLine();
                int timeTaken = Integer.parseInt(fileReader.nextLine());
                Recipe recipe = new Recipe(menuName, timeTaken);
                recipes.add(recipe);

                while (fileReader.hasNextLine())
                {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
            }
            fileReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    public void findName(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);              
            }
        }
    }

    public void searchByTime(int maxTime) {
        System.out.println('\n' + "Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getTimeTaken() <= maxTime) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTimeTaken());
            }
        }
    }

    public void findIngredient(String ingredient) {
        System.out.println('\n' + "Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }              
            
        }
    }

}


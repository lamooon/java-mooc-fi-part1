import java.util.ArrayList;
public class Suitcase {
    
    private ArrayList<Item> suitcase;
    private int maxWeight;

    public Suitcase(int maxWeight) {

        this.suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem (Item item) {

        int weight = 0;
        for (Item it : suitcase) {
            weight += it.getWeight();
        }
        if (!(item.getWeight() + weight > this.maxWeight))
        {
            suitcase.add(item);
        }


    }

    public String toString() {

        int weight = 0;
        if (!(this.suitcase.isEmpty()))
        {
            if (this.suitcase.size() == 1)
            {
                return "1 item (" + this.suitcase.get(0).getWeight() + " kg)";
            }
            else {
                for (Item item : suitcase) {
                    weight += item.getWeight();
                }
                return this.suitcase.size() + " items (" + weight + " kg)";
            }
        }
        return "no items (0 kg)";
    }

    public void printItems() {

        for (Item item : this.suitcase) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Item item : this.suitcase) {
            weight += item.getWeight();
        }

        return weight;
    }

    public Item heaviestItem() {

        if (this.suitcase.isEmpty()) return null;
        Item it = new Item("random", -1);
        for (Item item : this.suitcase) {
            if (item.getWeight() > it.getWeight())
            {
                it = item;
            }
        }
        return it;
    }
}

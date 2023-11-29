import java.util.ArrayList;
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suit;

    public Hold (int maxWeight) {
        this.maxWeight = maxWeight;
        this.suit = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {

        int weight = this.getWeight();
        
        if (!(weight + suitcase.totalWeight() > this.maxWeight))
        {
            suit.add(suitcase);
        }
    }

    public String toString() {

        return this.suit.size() + " suitcases (" + this.getWeight() + " kg)";
    }

    public int getWeight() {

        int weight = 0;
        for (Suitcase s : this.suit){
            weight += s.totalWeight();
        }
        return weight;
    }

    public void printItems() {

        for (Suitcase s : this.suit) {
            s.printItems();
        }
    }
}

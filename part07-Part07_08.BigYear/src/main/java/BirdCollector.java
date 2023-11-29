import java.util.ArrayList;
public class BirdCollector {
    
    private ArrayList<Bird> birds;

    public BirdCollector() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        
        Bird b = new Bird(name, latinName);
        this.birds.add(b);
    }

    public void listAll() {
        for (Bird b : this.birds) {
            System.out.println(b);
        }
    }

    public void findBird(String name) {

        for (Bird b : this.birds) {
            if (b.getName().equals(name)) {
                System.out.println(b);
            }
        }
    }

    public void observationMade(String name) {
        for (Bird b : this.birds) {
            if (b.getName().equals(name)) {
                b.incrementObservations();
            }
        }
    }
}


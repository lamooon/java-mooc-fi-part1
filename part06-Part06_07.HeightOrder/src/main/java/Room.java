import java.util.ArrayList;
public class Room {

    ArrayList<Person> people;

    public Room () {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (this.people.isEmpty()) return true;

        return false;
    }
    
    public ArrayList<Person> getPersons() {

        return this.people;
    }

    public Person shortest() {

        if (this.people.isEmpty()) return null;
        Person peep = new Person("random", 10000);
        for (Person person : this.people) {
            if (person.getHeight() < peep.getHeight()) {
                peep = person;
            }
        }
        return peep;
    }

    public Person take() {
        if (this.people.isEmpty()) return null;
        Person shortest = this.shortest();
        this.people.remove(shortest);

        return shortest;
    }
}

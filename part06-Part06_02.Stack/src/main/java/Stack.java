import java.util.*;
public class Stack {

    private ArrayList<String> stack = new ArrayList<>();


    public boolean isEmpty() {
        if (stack.isEmpty()) return true;
        return false;
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        
        return this.stack;
    }

    public String take() {

        String topPointer = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return topPointer;
    }
    
}

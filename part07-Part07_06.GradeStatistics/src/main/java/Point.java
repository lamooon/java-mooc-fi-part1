import java.util.ArrayList;
public class Point {
    
    private int sum;
    private int numOfPassed;
    private ArrayList<Integer> points;

    public Point() {
        this.sum = 0;
        this.numOfPassed = 0;
        this.points = new ArrayList<>();
    }

    public void addPoint(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
        }
    }

    public void calculateSum() {
        for (int point : this.points) {
            this.sum += point;
        }
    }

    public void printAverage() {
        this.sum = 0;
        this.calculateSum();
        double average = 1.0 * this.sum / this.points.size();
        System.out.println("Point average (all): " + average);
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public void printAveragePassing() {
        this.sum = 0;
        this.numOfPassed = 0;
        for (int point : this.points) {
            if (point >= 50) {
                this.sum += point;
                this.numOfPassed++;
            }
        }

        if (this.sum == 0) {
            System.out.println("Point average (passing): -");
            return;
        }
        
        double average = 1.0 * this.sum / this.numOfPassed;
        System.out.println("Point average (passing): " + average);
    }

    public void passPercentage() {

        System.out.println("Pass percentage: " + (double) 100 * this.numOfPassed / points.size());
    }
}

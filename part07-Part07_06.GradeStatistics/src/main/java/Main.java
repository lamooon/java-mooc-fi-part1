
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point();
        Grade grade = new Grade(point);
        System.out.println("Enter point totals, -1 stops: ");
        int n = scanner.nextInt();

        while (n != -1)
        {
            point.addPoint(n);
            n = scanner.nextInt();
        }
        point.printAverage();
        point.printAveragePassing();
        point.passPercentage();
        grade.printGradeDistribution();
        scanner.close();
    }

}

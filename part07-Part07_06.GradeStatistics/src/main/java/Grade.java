import java.util.ArrayList;
public class Grade {

    private Point point;
    private int[] grades;

    public Grade(Point point) {
        this.point = point;
        this.grades = new int[6];

        for (int i = 0; i < 6; i++) {
            this.grades[i] = 0;
        }
    }

    public void printGradeDistribution() {

        ArrayList<Integer> grades = this.point.getPoints();
        for (int point : grades) {

            if (point < 50) {
                this.grades[0]++;
            }
            else if (point < 60) {
                this.grades[1]++;
            }
            else if (point < 70) {
                this.grades[2]++;
            }
            else if (point < 80) {
                this.grades[3]++;
            }
            else if (point < 90) {
                this.grades[4]++;
            }
            else
            {
                this.grades[5]++;
            }
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < this.grades[i];j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }


}

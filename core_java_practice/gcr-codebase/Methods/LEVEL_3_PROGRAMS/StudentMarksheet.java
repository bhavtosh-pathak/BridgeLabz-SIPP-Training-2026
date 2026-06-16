import java.util.Scanner;

public class StudentMarksheet {

    static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {

            for (int j = 0; j < 3; j++) {
                marks[i][j] =
                        (int)(Math.random() * 90) + 10;
            }
        }

        return marks;
    }

    static double[][] calculateResult(int[][] marks) {

        double[][] result =
                new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total =
                    marks[i][0] +
                            marks[i][1] +
                            marks[i][2];

            double average = total / 3.0;

            double percentage =
                    (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] =
                    Math.round(average * 100.0) / 100.0;
            result[i][2] =
                    Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    static void display(
            int[][] marks,
            double[][] result) {

        System.out.println(
                "Phy Chem Math Total Avg %");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        int[][] marks =
                generateMarks(students);

        double[][] result =
                calculateResult(marks);

        display(marks, result);
    }
}
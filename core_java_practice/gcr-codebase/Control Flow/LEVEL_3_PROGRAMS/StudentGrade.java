import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;
        String grade;
        String remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, Above Agency-Normalized Standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, At Agency-Normalized Standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, Approaching Agency-Normalized Standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, Well Below Agency-Normalized Standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, Too Below Agency-Normalized Standards";
        } else {
            grade = "R";
            remarks = "Remedial Standards";
        }

        System.out.println("Average Marks = " + average);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);
    }
}
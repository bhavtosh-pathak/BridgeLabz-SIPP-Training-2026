import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("While Loop Sum = " + sum);
        System.out.println("Formula Sum = " + formula);

        if (sum == formula) {
            System.out.println("Both results are correct");
        } else {
            System.out.println("Results are different");
        }
    }
}
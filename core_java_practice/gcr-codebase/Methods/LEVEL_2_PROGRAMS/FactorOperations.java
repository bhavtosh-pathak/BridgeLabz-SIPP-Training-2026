import java.util.Scanner;

public class FactorOperations {

    static int[] getFactors(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    static int sumFactors(int[] factors) {
        int sum = 0;

        for (int num : factors)
            sum += num;

        return sum;
    }

    static long productFactors(int[] factors) {
        long product = 1;

        for (int num : factors)
            product *= num;

        return product;
    }

    static double sumSquareFactors(int[] factors) {
        double sum = 0;

        for (int num : factors)
            sum += Math.pow(num, 2);

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.print("Factors: ");
        for (int x : factors)
            System.out.print(x + " ");

        System.out.println("\nSum = " + sumFactors(factors));
        System.out.println("Product = " + productFactors(factors));
        System.out.println("Sum of Squares = " + sumSquareFactors(factors));
    }
}
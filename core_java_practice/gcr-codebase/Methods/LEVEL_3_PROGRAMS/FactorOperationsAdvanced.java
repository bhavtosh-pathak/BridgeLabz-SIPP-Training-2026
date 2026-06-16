import java.util.Scanner;

public class FactorOperationsAdvanced {

    static int[] factors(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] arr = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                arr[index++] = i;
        }

        return arr;
    }

    static int greatestFactor(int[] arr) {
        return arr[arr.length - 2];
    }

    static int sum(int[] arr) {

        int sum = 0;

        for (int x : arr)
            sum += x;

        return sum;
    }

    static long product(int[] arr) {

        long product = 1;

        for (int x : arr)
            product *= x;

        return product;
    }

    static double cubeProduct(int[] arr) {

        double product = 1;

        for (int x : arr)
            product *= Math.pow(x, 3);

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] factors = factors(n);

        System.out.println("Greatest Factor = " +
                greatestFactor(factors));

        System.out.println("Sum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Cube Product = " +
                cubeProduct(factors));
    }
}
import java.util.Scanner;

public class NumberChecker2 {

    static int[] digitsArray(int n) {

        String s = String.valueOf(n);

        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';

        return arr;
    }

    static int sumDigits(int[] arr) {

        int sum = 0;

        for (int x : arr)
            sum += x;

        return sum;
    }

    static int sumSquares(int[] arr) {

        int sum = 0;

        for (int x : arr)
            sum += Math.pow(x, 2);

        return sum;
    }

    static boolean harshad(int n, int[] arr) {
        return n % sumDigits(arr) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] digits = digitsArray(n);

        System.out.println("Sum = " + sumDigits(digits));
        System.out.println("Square Sum = " + sumSquares(digits));
        System.out.println("Harshad = " + harshad(n, digits));
    }
}
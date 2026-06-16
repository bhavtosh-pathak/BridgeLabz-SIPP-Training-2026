import java.util.Scanner;

public class NumberChecker1 {

    static int countDigits(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    static int[] digitsArray(int n) {

        int count = countDigits(n);

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }

    static boolean isDuck(int[] digits) {

        for (int d : digits)
            if (d == 0)
                return true;

        return false;
    }

    static boolean isArmstrong(int n, int[] digits) {

        int sum = 0;

        for (int d : digits)
            sum += Math.pow(d, digits.length);

        return sum == n;
    }

    static void largestSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {

            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }

    static void smallestSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {

            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + second);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] digits = digitsArray(n);

        System.out.println("Duck = " + isDuck(digits));
        System.out.println("Armstrong = " + isArmstrong(n, digits));

        largestSecondLargest(digits);
        smallestSecondSmallest(digits);
    }
}
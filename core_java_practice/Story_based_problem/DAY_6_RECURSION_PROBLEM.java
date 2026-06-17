import java.util.Scanner;

public class DAY_6_RECURSION_PROBLEM {

    static int moves = 0;

    static void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moves++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moves++;
        towerOfHanoi(n - 1, helper, source, destination);
    }

    static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, low, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, high, target);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    static String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    static boolean isBalanced(String str, int index, int count) {
        if (count < 0) {
            return false;
        }

        if (index == str.length()) {
            return count == 0;
        }

        if (str.charAt(index) == '(') {
            return isBalanced(str, index + 1, count + 1);
        }

        if (str.charAt(index) == ')') {
            return isBalanced(str, index + 1, count - 1);
        }

        return isBalanced(str, index + 1, count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moves);

        int[] prices = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        System.out.println("Index = " + binarySearch(prices, 0, prices.length - 1, target));

        int number = 12345;
        System.out.println("Sum of Digits = " + sumOfDigits(number));

        String text = "Recursion";
        System.out.println("Reversed String = " + reverseString(text));

        String brackets = "((()))";
        System.out.println("Balanced = " + isBalanced(brackets, 0, 0));

        sc.close();
    }
}
import java.util.Scanner;

public class NumberChecker3 {

    static int[] digitsArray(int n) {

        String s = String.valueOf(n);

        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';

        return arr;
    }

    static int[] reverse(int[] arr) {

        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];

        return rev;
    }

    static boolean equal(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        return true;
    }

    static boolean palindrome(int n) {

        int[] arr = digitsArray(n);

        return equal(arr, reverse(arr));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Palindrome = " + palindrome(n));
    }
}
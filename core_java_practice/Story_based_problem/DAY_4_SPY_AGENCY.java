import java.util.Scanner;
import java.util.Arrays;

public class DAY_4_SPY_AGENCY {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Secret Message: ");
        String message = sc.nextLine();


        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        System.out.println("Reversed Message: " + reversed);


        boolean isPalindrome = message.equalsIgnoreCase(reversed);
        System.out.println("Is Palindrome: " + isPalindrome);

        // Count vowels and consonants
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = Character.toLowerCase(message.charAt(i));

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);


        System.out.print("Enter First Intercept: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter Second Intercept: ");
        String intercept2 = sc.nextLine();


        char[] arr1 = intercept1.toLowerCase().replace(" ", "").toCharArray();
        char[] arr2 = intercept2.toLowerCase().replace(" ", "").toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);


        boolean isAnagram = Arrays.equals(arr1, arr2);
        System.out.println("Are Anagrams: " + isAnagram);


        System.out.print("Enter Surveillance Log: ");
        String log = sc.nextLine();

        char firstNonRepeating = '\0';


        for (int i = 0; i < log.length(); i++) {

            char ch = log.charAt(i);

            if (log.indexOf(ch) == log.lastIndexOf(ch)) {
                firstNonRepeating = ch;
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: "
                    + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }
}
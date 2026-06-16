import java.util.Scanner;

public class SubstringCompare {

    static String getSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String userSub = getSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println(userSub);
        System.out.println(builtInSub);
        System.out.println(compare(userSub, builtInSub));
    }
}
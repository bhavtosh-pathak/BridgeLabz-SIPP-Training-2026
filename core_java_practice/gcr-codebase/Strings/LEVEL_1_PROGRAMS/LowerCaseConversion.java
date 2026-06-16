import java.util.Scanner;

public class LowerCaseConversion {

    static String toLower(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch + 32);

            result += ch;
        }

        return result;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String custom = toLower(text);
        String builtIn = text.toLowerCase();

        System.out.println(custom);
        System.out.println(builtIn);
        System.out.println(compare(custom, builtIn));
    }
}
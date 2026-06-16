import java.util.Scanner;

public class YoungestTallestFriends {

    static int youngest(int[] ages) {

        int index = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[index])
                index = i;
        }

        return index;
    }

    static int tallest(double[] heights) {

        int index = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[index])
                index = i;
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest = " +
                names[youngest(ages)]);

        System.out.println("Tallest = " +
                names[tallest(heights)]);
    }
}
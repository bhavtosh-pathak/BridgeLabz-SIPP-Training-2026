public class FootballStats {

    static int[] generateHeights() {

        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        return heights;
    }

    static int sum(int[] arr) {

        int sum = 0;

        for (int x : arr)
            sum += x;

        return sum;
    }

    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int shortest(int[] arr) {

        int min = arr[0];

        for (int x : arr)
            if (x < min)
                min = x;

        return min;
    }

    static int tallest(int[] arr) {

        int max = arr[0];

        for (int x : arr)
            if (x > max)
                max = x;

        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights();

        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\nMean = " + mean(heights));
        System.out.println("Shortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
    }
}
import java.util.Scanner;
public class DistanceConverter {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double distanceInFeet = input.nextDouble();

            double yards = distanceInFeet / 3;
            double miles = yards / 1760;

            System.out.println("Distance in feet is " + distanceInFeet
                    + ", in yards is " + yards
                    + " and in miles is " + miles);

            input.close();
        }

}

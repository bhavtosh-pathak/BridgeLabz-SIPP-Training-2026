import java.util.Scanner;
public class AreaTriangle {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double base = input.nextDouble();
            double height = input.nextDouble();

            double area = 0.5 * base * height;

            System.out.println("The area of the triangle is " + area);

            input.close();
        }
    }


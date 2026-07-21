class C {

    double radius;

    C(double radius) {
        this.radius = radius;
    }

    // Calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display results
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}


public class CORCLE_AREA_1 {
    public static void main(String[] args) {

        C circle = new C(5);

        System.out.println("Circle Details");
    }
}

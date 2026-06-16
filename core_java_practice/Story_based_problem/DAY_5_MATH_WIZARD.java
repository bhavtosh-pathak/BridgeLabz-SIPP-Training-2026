public class DAY_5_MATH_WIZARD {

    int instanceVariable = 100;

    public boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public double factorial(double n) {

        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    public void fibonacci(int n) {

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public long power(int base, int exp) {

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void showScope() {

        int localVariable = 50;

        System.out.println("Instance Variable = " + instanceVariable);
        System.out.println("Local Variable = " + localVariable);
    }

    public static void main(String[] args) {

        DAY_5_MATH_WIZARD wizard = new DAY_5_MATH_WIZARD();

        System.out.println("Is 17 Prime? " + wizard.isPrime(17));

        System.out.println("Factorial(5) = " + wizard.factorial(5));

        System.out.println("Factorial(5.0) = " + wizard.factorial(5.0));

        wizard.fibonacci(10);

        System.out.println("GCD(12,18) = " + wizard.gcd(12, 18));

        System.out.println("LCM(12,18) = " + wizard.lcm(12, 18));

        System.out.println("2^5 = " + wizard.power(2, 5));

        wizard.showScope();
    }
}
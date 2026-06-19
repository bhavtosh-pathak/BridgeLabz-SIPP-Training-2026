class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double amount, double balance)
            throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }
        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        int[] patients = {101, 102, 103};

        try {
            int items = 0;
            double bill = 1000 / items;
            System.out.println(bill);
        } catch (ArithmeticException e) {
            System.out.println("Error: Bill items cannot be zero.");
        }

        try {
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "abc";
            int value = Integer.parseInt(input);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            processPayment(7000, 5000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
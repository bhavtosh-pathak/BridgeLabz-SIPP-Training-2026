import java.util.Scanner;

// Custom Exception
class DAY_7_HospitalPaymentException extends Exception {
    public DAY_7_HospitalPaymentException(String message) {
        super(message);
    }
}

public class DAY_7_MEDICAL_BILLING_PLATFORM {

    static void processPayment(double billAmount, double balance)
            throws DAY_7_HospitalPaymentException {

        if (billAmount > balance) {
            throw new DAY_7_HospitalPaymentException(
                    "Payment Failed: Insufficient Funds!");
        }

        System.out.println("Payment Successful!");
        System.out.println("Remaining Balance: " + (balance - billAmount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Bill Amount: ");
            double billAmount = sc.nextDouble();

            System.out.print("Enter Available Balance: ");
            double balance = sc.nextDouble();

            processPayment(billAmount, balance);

        } catch (DAY_7_HospitalPaymentException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid Input!");

        } finally {
            System.out.println("Transaction Process Completed.");
            sc.close();
        }
    }
}
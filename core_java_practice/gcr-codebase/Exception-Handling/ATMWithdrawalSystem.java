class InsufficientBalanceException extends Exception {

    private double balance;
    private double requestedAmount;

    public InsufficientBalanceException(double balance,
                                        double requestedAmount) {
        super("Insufficient Balance");
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

public class ATMWithdrawalSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 8000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal Failed");
            System.out.println("Available Balance: ₹" +
                    e.getBalance());
            System.out.println("Requested Amount: ₹" +
                    e.getRequestedAmount());
        }
    }
}
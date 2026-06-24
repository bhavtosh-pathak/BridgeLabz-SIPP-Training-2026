class BankAccount {

    private int accountNumber;
    private String holder;
    private double balance;

    static int totalAccountsCreated = 0;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccountsCreated++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(holder + " deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(holder +
                    " Withdrawal Failed! Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        }
    }

    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        BankAccount acc1 =
                new BankAccount(1001, "Pradeep", 10000);

        BankAccount acc2 =
                new BankAccount(1002, "Rahul", 15000);

        BankAccount acc3 =
                new BankAccount(1003, "Aman", 20000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(15000);

        acc2.deposit(4000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(5000);
        acc2.withdraw(3000);

        acc3.deposit(3000);
        acc3.withdraw(1000);
        acc3.deposit(2000);
        acc3.withdraw(5000);
        acc3.withdraw(25000);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println(
                "\nTotal Accounts Created = "
                        + BankAccount.totalAccountsCreated);
    }
}
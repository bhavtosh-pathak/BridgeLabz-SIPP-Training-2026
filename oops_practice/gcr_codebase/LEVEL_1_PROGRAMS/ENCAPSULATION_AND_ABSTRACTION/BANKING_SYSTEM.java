abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;


    // Constructor
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }


    // Getter and Setter Methods

    public int getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getHolderName() {
        return holderName;
    }


    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }



    // Deposit Method
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }



    // Withdraw Method
    public void withdraw(double amount) {

        if(amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }



    // Display Account Details
    public void displayAccountDetails() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }



    // Abstract Method
    abstract double calculateInterest();

}



// Savings Account Class
class SavingsAccount extends BankAccount {

    private double interestRate;


    SavingsAccount(int accountNumber, String holderName,
                   double balance, double interestRate) {

        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }



    public double getInterestRate() {
        return interestRate;
    }



    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



    @Override
    double calculateInterest() {

        return getBalance() * interestRate / 100;
    }

}



// Current Account Class
class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;


    CurrentAccount(int accountNumber, String holderName,
                   double balance, double monthlyBonusRate) {

        super(accountNumber, holderName, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }



    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }



    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }



    @Override
    double calculateInterest() {

        return getBalance() * monthlyBonusRate / 100;
    }

}



// Main Class
public class Main {

    public static void main(String[] args) {


        SavingsAccount savings =
                new SavingsAccount(10101, "Pradeep", 50000, 5);


        CurrentAccount current =
                new CurrentAccount(20202, "Rahul", 80000, 3);



        System.out.println("----- Savings Account -----");

        savings.deposit(10000);

        savings.withdraw(5000);

        savings.displayAccountDetails();

        System.out.println("Interest: "
                + savings.calculateInterest());




        System.out.println("\n----- Current Account -----");

        current.deposit(20000);

        current.withdraw(10000);

        current.displayAccountDetails();

        System.out.println("Interest: "
                + current.calculateInterest());

    }
}
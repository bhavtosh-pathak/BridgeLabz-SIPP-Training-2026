public class DAY_1_RAVI_WELCOME_CARD {
    public static void main(String[] args) {

        String memberName = "Ravi";
        int memberAge = 22;
        char memberRank = 'A';
        double monthlySalary = 50000;
        float membershipFee = 1500.50f;

        int annualBonus = (int) (monthlySalary * 0.12);

        System.out.println("===== WELCOME CARD =====");
        System.out.println("Name : " + memberName);
        System.out.println("Age : " + memberAge);
        System.out.println("Rank : " + memberRank);
        System.out.println("Salary : " + monthlySalary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus : " + annualBonus);
    }
}
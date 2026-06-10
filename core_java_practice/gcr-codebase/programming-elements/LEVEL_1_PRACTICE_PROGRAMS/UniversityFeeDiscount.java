public class UniversityFeeDiscount {

        public static void main(String[] args) {
            double fee = 125000;
            double discountPercent = 10;

            double discount = (fee * discountPercent) / 100;
            double discountedFee = fee - discount;

            System.out.println("Discount Amount = INR " + discount);
            System.out.println("Fee to Pay = INR " + discountedFee);
        }

}

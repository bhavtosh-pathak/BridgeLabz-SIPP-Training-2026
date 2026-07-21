interface CouponValidator {


    // Abstract method
    boolean validateCoupon(String code);



    // Static method
    static boolean isLengthValid(String code) {

        return code.length() >= 5;
    }

}



// Implementing Interface
class ShoppingCart implements CouponValidator {


    @Override
    public boolean validateCoupon(String code) {

        if(CouponValidator.isLengthValid(code)
                && code.startsWith("SAVE")) {

            return true;
        }

        return false;
    }

}



// Main Class
public class ONLINE_COUPON_VALIDATOR {

    public static void main(String[] args) {


        String coupons[] = {
                "SAVE10",
                "ABC",
                "SAVE50",
                "DISC20"
        };


        ShoppingCart cart = new ShoppingCart();



        for(String code : coupons) {

            if(cart.validateCoupon(code)) {

                System.out.println(code + " is Valid Coupon");

            }
            else {

                System.out.println(code + " is Invalid Coupon");
            }
        }
    }
}
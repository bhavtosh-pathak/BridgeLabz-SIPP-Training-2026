class Order {

    int orderId;
    String orderDate;


    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }


    String getOrderStatus() {
        return "Order Placed";
    }
}



// Child Class
class ShippedOrder extends Order {

    String trackingNumber;


    ShippedOrder(int id, String date, String trackingNumber) {

        super(id, date);
        this.trackingNumber = trackingNumber;
    }


    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}



// Grandchild Class
class DeliveredOrder extends ShippedOrder {

    String deliveryDate;


    DeliveredOrder(int id, String date,
                   String tracking, String deliveryDate) {

        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }


    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }


    void displayDetails() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: " + getOrderStatus());
    }
}



// Main Class
public class ONLINE_RETAIL{

    public static void main(String[] args) {


        DeliveredOrder order =
                new DeliveredOrder(
                        101,
                        "20-07-2026",
                        "TRK12345",
                        "22-07-2026"
                );


        order.displayDetails();

    }
}

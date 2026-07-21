class Item {

    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }


    // Display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }


    // Calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}


public class INVENTORY_SYSTEM {

    public static void main(String[] args) {

        Item item = new Item(501, "Laptop", 55000);

        int quantity = 2;

        System.out.println("Inventory Details");

        item.displayDetails();

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}
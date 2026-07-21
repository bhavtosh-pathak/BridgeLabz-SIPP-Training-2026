import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}


class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}


class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}


class Storage<T extends WarehouseItem> {

    ArrayList<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}


public class SmartWarehouseManagementSystem {


    static void displayItems(List<? extends WarehouseItem> items) {

        for(WarehouseItem item : items) {
            System.out.println(item.getName());
        }

    }


    public static void main(String[] args) {


        Storage<Electronics> electronicsStorage = new Storage<>();

        electronicsStorage.addItem(
                new Electronics("Laptop"));

        electronicsStorage.addItem(
                new Electronics("Mobile"));



        Storage<Groceries> groceryStorage = new Storage<>();

        groceryStorage.addItem(
                new Groceries("Rice"));



        System.out.println("Electronics:");

        displayItems(electronicsStorage.getItems());


        System.out.println("Groceries:");

        displayItems(groceryStorage.getItems());

    }
}
import java.util.ArrayList;


class BookCategory {}

class ClothingCategory {}

class GadgetCategory {}



class Product<T> {

    String name;
    double price;

    Product(String name,double price){

        this.name=name;
        this.price=price;
    }


    void show(){

        System.out.println(name+" Price: "+price);

    }

}




public class DynamicOnlineMarketplace {


    static <T extends Product<?>> void applyDiscount(
            T product,double percentage){


        product.price =
                product.price -
                        (product.price*percentage/100);

    }



    public static void main(String[] args){


        Product<BookCategory> book =
                new Product<>("Java Book",500);


        Product<GadgetCategory> gadget =
                new Product<>("Smart Watch",3000);



        applyDiscount(book,10);

        applyDiscount(gadget,20);



        book.show();

        gadget.show();


    }
}
interface StreamingService {


    void streamMovie();



    default void showSubscriptionDetails() {

        System.out.println("Streaming Subscription: Premium Plan");
    }

}




interface GamingService {


    void playGame();



    default void showSubscriptionDetails() {

        System.out.println("Gaming Subscription: Gold Plan");
    }

}




class SmartTV implements StreamingService, GamingService {


    String movies[] = {
            "Avengers",
            "Interstellar",
            "Avatar"
    };


    String games[] = {
            "FIFA",
            "Minecraft",
            "GTA"
    };



    public void streamMovie() {

        System.out.println("Available Movies:");

        for(String movie : movies) {

            System.out.println(movie);
        }
    }




    public void playGame() {

        System.out.println("Available Games:");

        for(String game : games) {

            System.out.println(game);
        }
    }




    // Resolving default method conflict
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();

        GamingService.super.showSubscriptionDetails();
    }

}




public class MULTI_SERVICE_SMART_TV {

    public static void main(String[] args) {


        SmartTV tv = new SmartTV();


        tv.streamMovie();

        System.out.println();

        tv.playGame();

        System.out.println();

        tv.showSubscriptionDetails();

    }
}
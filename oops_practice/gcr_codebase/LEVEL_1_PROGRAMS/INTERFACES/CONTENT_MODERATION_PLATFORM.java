interface TextModeration {


    boolean checkOffensiveContent(String post);



    default void displayModerationPolicy() {

        System.out.println("Policy: Offensive content is restricted.");
    }



    static boolean containsRestrictedWords(String post) {

        String words[] = {
                "bad",
                "hate",
                "abuse"
        };


        for(String word : words) {

            if(post.toLowerCase().contains(word)) {

                return true;
            }
        }

        return false;
    }

}




interface SpamDetection {


    boolean checkSpam(String post);



    default void displayModerationPolicy() {

        System.out.println("Policy: Spam content is restricted.");
    }

}




class ContentModerator
        implements TextModeration, SpamDetection {



    public boolean checkOffensiveContent(String post) {

        return TextModeration.containsRestrictedWords(post);
    }



    public boolean checkSpam(String post) {

        return post.contains("http") || post.length() > 100;
    }



    // Resolving default method conflict
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();

        SpamDetection.super.displayModerationPolicy();
    }

}




public class CONTENT_MODERATION_PLATFORM {


    public static void main(String[] args) {


        String posts[] = {

                "Hello everyone",
                "Buy now http://offer.com",
                "I hate this service"
        };


        ContentModerator moderator = new ContentModerator();



        moderator.displayModerationPolicy();


        for(String post : posts) {


            System.out.println("\nPost: " + post);


            if(moderator.checkSpam(post)) {

                System.out.println("Result: Spam Post");

            }
            else if(moderator.checkOffensiveContent(post)) {

                System.out.println("Result: Offensive Post");

            }
            else {

                System.out.println("Result: Valid Post");
            }

        }

    }
}

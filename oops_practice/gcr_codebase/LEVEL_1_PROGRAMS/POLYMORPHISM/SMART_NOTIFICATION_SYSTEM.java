class Notification {

    String recipientName;
    String message;


    Notification(String recipientName, String message) {

        this.recipientName = recipientName;
        this.message = message;
    }


    void sendNotification() {

        System.out.println("Sending Notification");
    }
}


// Email Notification
class EmailNotification extends Notification {


    EmailNotification(String name, String msg) {

        super(name, msg);
    }


    @Override
    void sendNotification() {

        System.out.println("Email sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}


// SMS Notification
class SMSNotification extends Notification {


    SMSNotification(String name, String msg) {

        super(name, msg);
    }


    @Override
    void sendNotification() {

        System.out.println("SMS sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}


// Push Notification
class PushNotification extends Notification {


    PushNotification(String name, String msg) {

        super(name, msg);
    }


    @Override
    void sendNotification() {

        System.out.println("Push Notification sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}



public class SMART_NOTIFICATION_SYSTEM {


    public static void main(String[] args) {


        Notification notifications[] = {

                new EmailNotification("Pradeep", "Meeting at 10 AM"),

                new SMSNotification("Rahul", "Your OTP is 1234"),

                new PushNotification("Amit", "New Offer Available")
        };



        for(Notification n : notifications) {

            n.sendNotification();

            System.out.println();
        }

    }
}
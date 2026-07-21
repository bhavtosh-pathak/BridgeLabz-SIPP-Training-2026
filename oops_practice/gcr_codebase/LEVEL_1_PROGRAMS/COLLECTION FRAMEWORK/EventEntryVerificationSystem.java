import java.util.HashSet;
import java.util.Scanner;

public class EventEntryVerificationSystem {

    static HashSet<String> participants = new HashSet<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Event Entry Verification System ---");
            System.out.println("1. Register Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            sc.nextLine();


            switch(choice) {

                case 1:

                    System.out.print("Enter email ID: ");
                    String email = sc.nextLine();


                    if(participants.add(email)) {
                        System.out.println("Registration successful.");
                    }
                    else {
                        System.out.println("Duplicate registration rejected.");
                    }

                    break;


                case 2:

                    System.out.println("\nRegistered Participants:");

                    for(String p : participants) {
                        System.out.println(p);
                    }

                    System.out.println("Total Attendees: "
                            + participants.size());

                    break;


                case 3:
                    return;


                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
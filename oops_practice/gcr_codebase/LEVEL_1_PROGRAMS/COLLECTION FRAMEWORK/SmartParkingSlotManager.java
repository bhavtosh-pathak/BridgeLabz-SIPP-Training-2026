import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {

    static ArrayList<String> parkedVehicles = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Smart Parking Slot Manager ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    String vehicle = sc.nextLine();

                    if (parkedVehicles.contains(vehicle)) {
                        System.out.println("Vehicle already parked!");
                    } else {
                        parkedVehicles.add(vehicle);
                        System.out.println("Vehicle entered successfully.");
                    }
                    break;


                case 2:
                    System.out.print("Enter vehicle number to exit: ");
                    String removeVehicle = sc.nextLine();

                    if (parkedVehicles.remove(removeVehicle)) {
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;


                case 3:
                    System.out.print("Enter vehicle number to search: ");
                    String searchVehicle = sc.nextLine();

                    if (parkedVehicles.contains(searchVehicle)) {
                        System.out.println("Vehicle is currently parked.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;


                case 4:
                    System.out.println("\nCurrently Parked Vehicles:");

                    for (String v : parkedVehicles) {
                        System.out.println(v);
                    }

                    System.out.println("Total Occupied Slots: "
                            + parkedVehicles.size());
                    break;


                case 5:
                    System.out.println("Exiting...");
                    return;


                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
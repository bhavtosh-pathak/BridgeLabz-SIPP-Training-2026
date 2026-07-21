import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SmartClassroomAttendaceTracker {


    static HashMap<String, ArrayList<String>> attendance =
            new HashMap<>();


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        while(true) {


            System.out.println("\n--- Smart Classroom Attendance Tracker ---");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");


            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            sc.nextLine();



            switch(choice) {


                case 1:

                    System.out.print("Enter Subject Name: ");
                    String subject = sc.nextLine();


                    System.out.print("Enter Student Name: ");
                    String student = sc.nextLine();



                    attendance.putIfAbsent(subject,
                            new ArrayList<>());


                    ArrayList<String> students =
                            attendance.get(subject);



                    if(students.contains(student)) {

                        System.out.println(
                                "Attendance already marked.");

                    }
                    else {

                        students.add(student);

                        System.out.println(
                                "Attendance marked successfully.");

                    }

                    break;



                case 2:


                    System.out.println("\nAttendance Details:");

                    for(String subjectName : attendance.keySet()) {


                        ArrayList<String> list =
                                attendance.get(subjectName);


                        System.out.println(
                                "\nSubject: " + subjectName);


                        for(String s : list) {

                            System.out.println(s);
                        }


                        System.out.println(
                                "Total Students Present: "
                                        + list.size());
                    }

                    break;



                case 3:
                    return;



                default:
                    System.out.println("Invalid choice.");
            }

        }
    }
}
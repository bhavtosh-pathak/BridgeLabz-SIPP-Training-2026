class LibraryMember {


    String memberName;
    String memberId;


    LibraryMember(String name, String id) {

        memberName = name;
        memberId = id;
    }



    double calculateFine(int overdueDays) {

        return 0;
    }



    void displayDetails() {

        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberId);
    }

}



// Student Member
class StudentMember extends LibraryMember {


    StudentMember(String name, String id) {

        super(name, id);
    }


    @Override
    double calculateFine(int days) {

        return days * 2;
    }
}



// Faculty Member
class FacultyMember extends LibraryMember {


    FacultyMember(String name, String id) {

        super(name, id);
    }


    @Override
    double calculateFine(int days) {

        return days * 1;
    }
}



// Guest Member
class GuestMember extends LibraryMember {


    GuestMember(String name, String id) {

        super(name, id);
    }


    @Override
    double calculateFine(int days) {

        return days * 5;
    }
}



public class SMART_LIBRARY_MEMEBERSHIP{


    static void findMember(LibraryMember members[], String id) {


        for(LibraryMember member : members) {


            if(member.memberId.equals(id)) {


                System.out.println("\nMember Found");

                member.displayDetails();

                System.out.println(
                        "Fine: " + member.calculateFine(10)
                );

                return;
            }
        }


        System.out.println("Member Not Found");
    }



    public static void main(String[] args) {


        LibraryMember members[] = {


                new StudentMember("Pradeep","S101"),

                new FacultyMember("Rahul","F102"),

                new GuestMember("Amit","G103")
        };



        for(LibraryMember member : members) {


            member.displayDetails();

            System.out.println(
                    "Fine: " + member.calculateFine(7)
            );

            System.out.println();
        }



        findMember(members,"F102");

    }
}
import java.util.PriorityQueue;

public class EmergencyRoomTriage {


    static class Patient {

        String name;
        int severity;


        Patient(String name,int severity){

            this.name=name;
            this.severity=severity;

        }

    }




    static PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>(
                    (a,b)->b.severity-a.severity
            );



    static void addPatient(Patient patient){

        triageQueue.offer(patient);

    }




    static Patient treatNext(){

        return triageQueue.poll();

    }




    public static void main(String[] args){


        addPatient(new Patient("John",5));

        addPatient(new Patient("Alex",10));

        addPatient(new Patient("Mike",7));



        Patient p=treatNext();



        System.out.println(
                p.name+" Severity: "+p.severity);

    }
}
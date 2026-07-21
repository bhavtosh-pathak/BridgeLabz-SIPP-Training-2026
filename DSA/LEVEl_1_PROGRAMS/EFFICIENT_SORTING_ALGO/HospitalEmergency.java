import java.util.PriorityQueue;

public class HospitalEmergency {


    static int kthHighest(int[] priority,int k){


        PriorityQueue<Integer> pq =
                new PriorityQueue<>();


        for(int p:priority){

            pq.add(p);


            if(pq.size()>k)
                pq.poll();

        }


        return pq.peek();

    }



    public static void main(String[] args){


        int[] priority={10,30,15,50,40};


        int k=2;


        System.out.println(
                kthHighest(priority,k));

    }
}
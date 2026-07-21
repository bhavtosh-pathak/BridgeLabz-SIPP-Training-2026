import java.util.*;

public class TopKCustomers {


    static List<Integer> topKLargest(
            int[] transactions,int k){


        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();



        for(int amount:transactions){


            if(minHeap.size()<k){


                minHeap.offer(amount);

            }


            else if(amount>minHeap.peek()){


                minHeap.poll();

                minHeap.offer(amount);

            }

        }


        return new ArrayList<>(minHeap);

    }





    public static void main(String[] args){


        int[] money =
                {500,2000,700,9000,3000};


        System.out.println(
                topKLargest(money,3));

    }
}

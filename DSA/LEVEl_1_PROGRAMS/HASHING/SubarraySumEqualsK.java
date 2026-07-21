import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {


    static int subarraySumEqualsK(
            int[] revenue,int k){


        Map<Integer,Integer> prefixCount =
                new HashMap<>();


        prefixCount.put(0,1);



        int runningSum=0;

        int answer=0;



        for(int value:revenue){


            runningSum += value;



            answer +=
                    prefixCount.getOrDefault(
                            runningSum-k,0);



            prefixCount.put(
                    runningSum,
                    prefixCount.getOrDefault(
                            runningSum,0)+1);

        }


        return answer;

    }





    public static void main(String[] args){


        int[] revenue =
                {1,-1,2,-2,3};


        int k=0;



        System.out.println(
                subarraySumEqualsK(
                        revenue,k));

    }
}
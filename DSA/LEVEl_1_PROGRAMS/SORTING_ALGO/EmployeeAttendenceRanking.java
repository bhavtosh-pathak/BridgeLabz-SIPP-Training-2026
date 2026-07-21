import java.util.Arrays;

public class EmployeeAttendenceRanking {


    static void selectionSort(int[] scores) {


        for(int i=0;i<scores.length-1;i++) {


            int minIndex=i;


            for(int j=i+1;j<scores.length;j++) {


                if(scores[j]<scores[minIndex]) {

                    minIndex=j;

                }

            }


            int temp=scores[i];

            scores[i]=scores[minIndex];

            scores[minIndex]=temp;

        }

    }



    public static void main(String[] args) {


        int[] scores =
                {88,45,76,90,55};


        System.out.println("Before:");
        System.out.println(Arrays.toString(scores));


        selectionSort(scores);


        System.out.println("After:");
        System.out.println(Arrays.toString(scores));

    }
}
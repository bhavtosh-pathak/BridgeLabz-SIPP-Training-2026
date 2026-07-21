import java.util.Arrays;

public class InsertionSortEmployeeIDs {


    static void insertionSort(int[] ids) {


        for(int i=1;i<ids.length;i++) {


            int key = ids[i];

            int j=i-1;


            while(j>=0 && ids[j]>key) {

                ids[j+1]=ids[j];

                j--;

            }


            ids[j+1]=key;

        }

    }



    public static void main(String[] args) {


        int[] employeeIds =
                {105,102,101,104,103};


        System.out.println("Before:");
        System.out.println(Arrays.toString(employeeIds));


        insertionSort(employeeIds);


        System.out.println("After:");
        System.out.println(Arrays.toString(employeeIds));

    }
}
import java.util.Arrays;

public class BubbleSortStudentMarks {


    static int bubbleSort(int[] marks) {

        int swaps = 0;

        for(int i=0;i<marks.length-1;i++) {

            boolean swapped = false;

            for(int j=0;j<marks.length-i-1;j++) {

                if(marks[j] > marks[j+1]) {

                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;

                    swaps++;
                    swapped = true;
                }
            }


            // Already sorted (Best Case)
            if(!swapped) {
                System.out.println("Array already sorted");
                break;
            }

        }

        return swaps;
    }



    public static void main(String[] args) {


        int[] marks = {85,45,90,70,60};


        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(marks));


        int swaps = bubbleSort(marks);


        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(marks));


        System.out.println("Total Swaps: "+swaps);

    }
}
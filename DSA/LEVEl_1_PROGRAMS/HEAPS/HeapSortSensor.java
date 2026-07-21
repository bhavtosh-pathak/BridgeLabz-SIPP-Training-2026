import java.util.Arrays;

public class HeapSortSensor {



    static void heapSort(int[] arr){


        int n=arr.length;



        // Build Max Heap

        for(int i=n/2-1;i>=0;i--){

            siftDown(arr,i,n);

        }




        for(int end=n-1;end>0;end--){


            int temp=arr[0];

            arr[0]=arr[end];

            arr[end]=temp;



            siftDown(arr,0,end);

        }

    }




    static void siftDown(
            int[] arr,int i,int size){



        int largest=i;


        int left=2*i+1;

        int right=2*i+2;



        if(left<size &&
                arr[left]>arr[largest])

            largest=left;



        if(right<size &&
                arr[right]>arr[largest])

            largest=right;




        if(largest!=i){


            int temp=arr[i];

            arr[i]=arr[largest];

            arr[largest]=temp;



            siftDown(arr,largest,size);

        }

    }





    public static void main(String[] args){


        int[] readings =
                {45,12,78,34,23};



        heapSort(readings);



        System.out.println(
                Arrays.toString(readings));

    }
}

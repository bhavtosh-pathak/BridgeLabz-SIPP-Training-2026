public class BankFraudDetection {


    static long countPairs(int[] arr){

        return mergeSort(arr,0,arr.length-1);

    }



    static long mergeSort(int[] arr,int l,int r){


        long count=0;


        if(l<r){


            int mid=(l+r)/2;


            count+=mergeSort(arr,l,mid);

            count+=mergeSort(arr,mid+1,r);


            count+=countCross(arr,l,mid,r);


            merge(arr,l,mid,r);

        }


        return count;

    }




    static long countCross(int[] arr,int l,int m,int r){


        long count=0;

        int j=m+1;


        for(int i=l;i<=m;i++){


            while(j<=r &&
                    (long)arr[i] >
                            3L*arr[j]){

                j++;

            }


            count += j-(m+1);

        }


        return count;

    }




    static void merge(int[] arr,int l,int m,int r){


        int[] temp=new int[r-l+1];


        int i=l,j=m+1,k=0;


        while(i<=m && j<=r){


            if(arr[i]<=arr[j])

                temp[k++]=arr[i++];

            else

                temp[k++]=arr[j++];

        }



        while(i<=m)
            temp[k++]=arr[i++];


        while(j<=r)
            temp[k++]=arr[j++];



        for(int x=0;x<temp.length;x++)

            arr[l+x]=temp[x];


    }




    public static void main(String[] args){


        int[] arr={12,4,5,2};


        System.out.println(
                countPairs(arr));

    }
}
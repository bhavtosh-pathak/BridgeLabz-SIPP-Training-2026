public class WebsiteResponseAnalysis {


    static long countViolations(int[] arr){

        return mergeSort(arr,0,arr.length-1);

    }



    static long mergeSort(int[] arr,int l,int r){


        long count=0;


        if(l<r){


            int mid=(l+r)/2;


            count+=mergeSort(arr,l,mid);

            count+=mergeSort(arr,mid+1,r);


            count+=merge(arr,l,mid,r);

        }


        return count;

    }



    static long merge(int[] arr,int l,int m,int r){


        int[] temp=new int[r-l+1];


        int i=l,j=m+1,k=0;


        long count=0;



        while(i<=m && j<=r){


            if(arr[i]<=arr[j])

                temp[k++]=arr[i++];


            else{


                count+=m-i+1;

                temp[k++]=arr[j++];

            }

        }



        while(i<=m)
            temp[k++]=arr[i++];


        while(j<=r)
            temp[k++]=arr[j++];



        for(int x=0;x<temp.length;x++)
            arr[l+x]=temp[x];


        return count;

    }




    public static void main(String[] args){


        int[] time={300,250,270,100};


        System.out.println(
                countViolations(time));

    }
}
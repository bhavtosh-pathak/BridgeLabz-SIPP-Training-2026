import java.util.*;
public class DAY_3_WAREHOUSE_ITEM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int items=sc.nextInt();
        int[] quantity=new int[items];
        for(int i=0;i<items;i++){
            quantity[i]=sc.nextInt();
        }

        int max=quantity[items-1];
        System.out.print("maximum qunatity is "+max);
        int min=quantity[0];
        System.out.print("minimum qunatity is "+min);
        int totalStock=0;
        for(int i=0;i<quantity.length;i++){
            totalStock+=quantity[i];
        }
        System.out.print("totalStock is "+totalStock);
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<quantity.length;i++){
            if(!mp.containsKey(quantity[i])){
                mp.put(quantity[i],1);
            }
            else{
                mp.put(quantity[i],mp.get(quantity[i])+1);
            }
        }
        boolean duplicate =false;
        for(int n:mp.keySet()){
            if(mp.get(n)>1){
                duplicate=true;
                break;

            }
            else{
                continue;
            }
        }
        if(!duplicate) {
            System.out.print("no duplicate found");
        }
        else{
            System.out.println("duplicate found");
        }
        int k=2;
        k=k%items;
        int[] rotated=new int[items];
        int idx=0;
        for(int i=items-k;i<items;i++){
            rotated[idx++]=quantity[i];
        }
        for(int i=0;i<items-k;i++){
            rotated[idx++]=quantity[i];
        }
        for(int i=0;i<rotated.length;i++){
            System.out.print(rotated[i]+" ");
        }
        System.out.print("Enter rows and cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] grid = new int[r][c];

        System.out.println("Enter grid elements:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose:");

        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}

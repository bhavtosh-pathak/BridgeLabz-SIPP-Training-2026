public class BSTSearchUsername {


    static class Node {

        int val;
        Node left,right;


        Node(int val){

            this.val=val;

        }
    }



    static boolean search(Node root,int target){


        Node current=root;


        while(current!=null){


            if(target==current.val)

                return true;


            else if(target<current.val)

                current=current.left;


            else

                current=current.right;

        }


        return false;

    }





    public static void main(String[] args){


        Node root=new Node(50);

        root.left=new Node(30);

        root.right=new Node(70);

        root.left.left=new Node(20);


        System.out.println(
                search(root,30));


        System.out.println(
                search(root,100));

    }
}
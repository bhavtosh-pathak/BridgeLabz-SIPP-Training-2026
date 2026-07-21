public class BSTValidation {


    static class Node{


        int val;

        Node left,right;


        Node(int val){

            this.val=val;

        }

    }




    static boolean isValidBST(Node root){


        return validate(
                root,
                Long.MIN_VALUE,
                Long.MAX_VALUE);

    }




    static boolean validate(
            Node node,
            long min,
            long max){


        if(node==null)

            return true;



        if(node.val<=min ||
                node.val>=max)

            return false;



        return validate(
                node.left,
                min,
                node.val)
                &&
                validate(
                        node.right,
                        node.val,
                        max);

    }





    public static void main(String[] args){


        Node root=new Node(50);


        root.left=new Node(30);

        root.right=new Node(70);

        root.left.left=new Node(20);


        System.out.println(
                isValidBST(root));

    }
}
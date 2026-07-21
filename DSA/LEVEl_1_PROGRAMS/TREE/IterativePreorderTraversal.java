import java.util.*;

public class IterativePreorderTraversal {


    static class Node{

        int val;
        Node left,right;


        Node(int val){

            this.val=val;

        }

    }




    static List<Integer> preorder(Node root){


        List<Integer> result =
                new ArrayList<>();


        if(root==null)
            return result;



        Stack<Node> stack =
                new Stack<>();


        stack.push(root);



        while(!stack.isEmpty()){


            Node node=stack.pop();


            result.add(node.val);



            if(node.right!=null)

                stack.push(node.right);



            if(node.left!=null)

                stack.push(node.left);


        }


        return result;

    }




    public static void main(String[] args){


        Node root=new Node(1);


        root.left=new Node(2);

        root.right=new Node(3);


        root.left.left=new Node(4);



        System.out.println(
                preorder(root));

    }
}
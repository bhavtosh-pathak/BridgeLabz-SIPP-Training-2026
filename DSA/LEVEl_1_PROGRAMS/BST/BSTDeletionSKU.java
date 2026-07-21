public class BSTDeletionSKU {


    static class Node{


        int val;

        Node left,right;


        Node(int val){

            this.val=val;

        }

    }




    static Node delete(Node node,int sku){


        if(node==null)

            return null;



        if(sku<node.val){


            node.left =
                    delete(node.left,sku);

        }


        else if(sku>node.val){


            node.right =
                    delete(node.right,sku);

        }


        else{


            // No child

            if(node.left==null &&
                    node.right==null)

                return null;



            // Only right child

            if(node.left==null)

                return node.right;



            // Only left child

            if(node.right==null)

                return node.left;



            // Two children

            Node successor=node.right;


            while(successor.left!=null)

                successor=successor.left;



            node.val=successor.val;


            node.right =
                    delete(node.right,
                            successor.val);

        }



        return node;

    }




    static void inorder(Node root){


        if(root==null)
            return;


        inorder(root.left);

        System.out.print(root.val+" ");

        inorder(root.right);

    }





    public static void main(String[] args){


        Node root=new Node(50);


        root.left=new Node(30);

        root.right=new Node(70);

        root.left.left=new Node(20);

        root.left.right=new Node(40);



        root=delete(root,30);



        inorder(root);

    }
}
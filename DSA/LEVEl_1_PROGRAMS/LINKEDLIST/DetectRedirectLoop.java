public class DetectRedirectLoop {


    static class Node{


        String url;

        Node next;



        Node(String url){

            this.url=url;

        }

    }




    static boolean hasRedirectLoop(Node head){


        Node slow=head;

        Node fast=head;



        while(fast!=null &&
                fast.next!=null){


            slow=slow.next;


            fast=fast.next.next;



            if(slow==fast)

                return true;


        }


        return false;

    }




    public static void main(String[] args){



        Node a=new Node("A");

        Node b=new Node("B");

        Node c=new Node("C");



        a.next=b;

        b.next=c;


        // Creating cycle

        c.next=a;



        System.out.println(
                hasRedirectLoop(a));

    }
}
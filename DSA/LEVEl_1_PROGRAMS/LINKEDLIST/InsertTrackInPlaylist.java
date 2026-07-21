public class InsertTrackInPlaylist {


    static class Node {

        int trackId;
        Node next;


        Node(int trackId){

            this.trackId=trackId;

        }
    }



    static void insertAfter(Node current,int trackId){


        Node newNode = new Node(trackId);


        newNode.next = current.next;


        current.next = newNode;

    }




    static void display(Node head){

        while(head!=null){

            System.out.print(head.trackId+" ");

            head=head.next;

        }

    }




    public static void main(String[] args){


        Node first = new Node(101);

        first.next = new Node(102);

        first.next.next = new Node(103);



        insertAfter(first,999);



        display(first);

    }
}
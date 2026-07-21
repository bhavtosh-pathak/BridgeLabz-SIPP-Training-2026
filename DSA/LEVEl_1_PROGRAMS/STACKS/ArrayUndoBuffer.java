public class ArrayUndoBuffer {


    static class UndoBuffer {


        String[] data;
        int top;


        UndoBuffer(int maxDepth){

            data = new String[maxDepth];

            top = -1;

        }



        boolean push(String edit){


            if(top == data.length-1){

                System.out.println("Undo Buffer Full");

                return false;

            }


            data[++top]=edit;

            return true;

        }




        String pop(){


            if(isEmpty())

                throw new RuntimeException("Nothing to undo");


            return data[top--];

        }




        String peek(){


            if(isEmpty())

                throw new RuntimeException("Buffer Empty");


            return data[top];

        }




        boolean isEmpty(){

            return top==-1;

        }

    }





    public static void main(String[] args){


        UndoBuffer stack =
                new UndoBuffer(3);



        stack.push("Type A");

        stack.push("Type B");

        stack.push("Type C");



        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.pop());

    }
}
public class FunctionCallStack {


    static class Frame{


        String functionName;

        Frame next;



        Frame(String name, Frame next){

            this.functionName=name;

            this.next=next;

        }

    }



    static class CallStack{


        Frame top=null;



        void push(String functionName){


            top =
                    new Frame(functionName,top);

        }




        String pop(){


            if(top==null)

                throw new RuntimeException(
                        "No Active Function");


            String name=top.functionName;


            top=top.next;


            return name;

        }




        String peek(){


            if(top==null)

                return null;


            return top.functionName;

        }


    }




    public static void main(String[] args){


        CallStack stack =
                new CallStack();



        stack.push("main");

        stack.push("login()");

        stack.push("validate()");



        System.out.println(
                stack.peek());


        System.out.println(
                stack.pop());


        System.out.println(
                stack.pop());

    }
}
import java.util.*;

public class BalancedVrackets {


    static boolean isValid(String s){


        Stack<Character> stack =
                new Stack<>();



        for(char c:s.toCharArray()){



            if(c=='(' ||
                    c=='{' ||
                    c=='['){


                stack.push(c);

            }


            else{


                if(stack.isEmpty())

                    return false;



                char open=stack.pop();



                if((c==')' && open!='(') ||
                        (c=='}' && open!='{') ||
                        (c==']' && open!='['))


                    return false;

            }

        }


        return stack.isEmpty();

    }




    public static void main(String[] args){


        String config =
                "{[()]}";


        System.out.println(
                isValid(config));

    }
}
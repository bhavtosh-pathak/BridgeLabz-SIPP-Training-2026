import java.util.HashMap;

public class MinimumCoverageWindow {


    static String minWindowSubstring(
            String s,String t){


        HashMap<Character,Integer> need =
                new HashMap<>();


        for(char c:t.toCharArray()){

            need.put(c,
                    need.getOrDefault(c,0)+1);

        }



        HashMap<Character,Integer> window =
                new HashMap<>();


        int required=need.size();

        int formed=0;


        int start=0;

        int minLen=Integer.MAX_VALUE;

        int minStart=0;



        for(int end=0;end<s.length();end++){


            char c=s.charAt(end);


            window.put(c,
                    window.getOrDefault(c,0)+1);



            if(need.containsKey(c)
                    &&
                    window.get(c).equals(need.get(c))){

                formed++;

            }




            while(formed==required){


                if(end-start+1 < minLen){


                    minLen=end-start+1;

                    minStart=start;

                }



                char left=s.charAt(start);


                window.put(left,
                        window.get(left)-1);



                if(need.containsKey(left)
                        &&
                        window.get(left)<need.get(left)){


                    formed--;

                }


                start++;

            }

        }


        return minLen==Integer.MAX_VALUE
                ? ""
                :
                s.substring(minStart,minStart+minLen);

    }




    public static void main(String[] args){


        String s="ADOBECODEBANC";

        String t="ABC";


        System.out.println(
                minWindowSubstring(s,t));

    }
}
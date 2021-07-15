public class Solution {
    public int solve(String A) {
        Stack<Character> st = new Stack<>();
        for( int i =0; i <A.length();i++)
        {
            if(A.charAt(i)=='{' || A.charAt(i)=='(' || A.charAt(i)=='[' )
            st.push(A.charAt(i));

            else if(st.isEmpty()) // } // {]
            return 0;

            else
            {

                if( (A.charAt(i)==')' && st.pop()!='(') || (A.charAt(i)==']' && st.pop()!='[') || (A.charAt(i)=='}' && st.pop()!='{') )
                return 0;

                // else return 0;   )
            }
        }
        if(st.isEmpty())
        return 1;

        return 0;
    }
}
//1. keep puhsing in st till opening braces
//2. if closing comes, check if peek not equal to same closing type , then , return 0; else pop;
//3, after while loop , if st is empty => balanced

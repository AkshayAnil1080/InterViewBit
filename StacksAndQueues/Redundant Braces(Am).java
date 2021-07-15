public class Solution {
    public int braces(String A) {
        Stack<Character> st = new Stack<>();
        if(A.length()==3 && A.charAt(0)=='(' && A.charAt(2)==')')
        return 1;
        for( int i =0; i <A.length();i++)
        {
            if(A.charAt(i)=='+' || A.charAt(i)=='-' || A.charAt(i)=='*' || A.charAt(i)=='/' || A.charAt(i)=='(')
            st.push(A.charAt(i));

            if(A.charAt(i)==')')
            {
                if(st.peek()=='(')
                return 1;
                else
                {
                    while(!st.isEmpty() && st.peek()!='(')
                    st.pop();

                    st.pop();
                }
            }
        }

        return 0;
    }
}
//1, push opening brack and operators
//2. if clising comes , check if peek ==( => reundant braces
// else pop all items till opening comes including it

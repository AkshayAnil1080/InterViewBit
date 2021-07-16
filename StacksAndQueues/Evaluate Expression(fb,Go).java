public class Solution {
    public int evalRPN(String[] A) {
// s1.equals(s2) - comapre the content use equalsTo() or compare() - true
    Stack<Integer> st = new Stack<>();
    int res= 0;
    for( int i =0; i<A.length;i++)
    {
        if(A[i].equals("+") || A[i].equals("-") || A[i].equals("*") || A[i].equals("/"))
        {
            int a =0, b=0;
            if(!st.isEmpty())  b = st.pop();
            if(!st.isEmpty()) a = st.pop();

            if(A[i].equals("+"))    res=a+b;
             if(A[i].equals("*") )  res=a*b;
              if(A[i].equals("/"))  res=a/b;
               if(A[i].equals("-")) res=a-b;

            st.push(res);
        }
        else
        st.push(Integer.parseInt(A[i]));

    }

    return st.peek();

    }
}

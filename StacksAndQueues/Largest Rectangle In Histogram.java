public class Solution {
    public int largestRectangleArea(int[] A) {
        Stack<Integer> st = new Stack<Integer>();
        int n = A.length;
        int res=0;
        for(int i =0 ; i<A.length;i++)
        // jis i current pe h abhi ho, agr usse chota buliding stack me present h , need to pop and update the height in res.
        {
            while(!st.isEmpty() && A[st.peek()] >= A[i])
            {
                int top =st.pop();
                int curr= A[top] * (st.isEmpty()? i:(i-st.peek()-1));
                res=Math.max(res,curr);
            }
            st.push(i);
        }

        // remainging ele in Stack
        while(!st.isEmpty())
        {
            int top = st.pop();
            int curr = A[top] * (st.isEmpty() ? n:(n-st.peek()-1) );
            res=Math.max(res,curr);
        }
        return res;
    }
}

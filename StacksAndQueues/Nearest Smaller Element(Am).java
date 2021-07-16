public class Solution {
    public int[] prevSmaller(int[] A) {


        int n=A.length;
        int ans[] = new int [n];
        int index=0; ans[index++]=-1;
        if(n==1) return ans;
        Stack<Integer> st = new Stack<>();
        int res=0;
        st.push(A[0]);

        for(int i=1;i<n; i++)
        {
            while(!st.isEmpty() && st.peek() >= A[i])
            {
                st.pop();
            }
            res = (st.isEmpty())? -1:st.peek();
            ans[index++]=res;

            st.push(A[i]);
        }
        return ans;
    }
}

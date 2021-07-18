public class Solution {
    public int maxSpecialProduct(int[] A) {

        Stack<Integer> st  = new Stack<Integer>();
        long ans=0;
        int i =0;
        while(i<A.length)
        {
            if(st.isEmpty() || A[st.peek()] > A[i])
            st.push(i++);

            else
            {
                 st.pop();

                long prod = (long)i * (long)(st.isEmpty() ? 0: st.peek());
                ans= Math.max(ans,prod);
            }
        }
        return (int)(ans%1000000007);
    }
}


// stack me ek x index pada h - > if(A[x] < A[i]) ith k liye right special i hoga answer
//                                 else
//                                     pop & is empty 0; else st.peek();

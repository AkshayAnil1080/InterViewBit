public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
       Stack<Integer> st = new Stack<>();
       int n = A.length;
       int ans =0;

       for( int i =0; i <n ;i++)
       {
           while(!st.isEmpty() && A[st.peek()] < A[i])

          { //a store pop ht
           int pop_ht = A[st.peek()];
           st.pop();

            //b if stack is empty there is no left pillar greater the A[i] that can hold the water
            if(st.isEmpty()) break;

            //Get the distance between the// left and right boundary of // popped bar
            int distance = i -st.peek() -1;

            //  Calculate the min. height
            int min_height
                    = Math.min(A[st.peek()],
                               A[i])
                      - pop_ht;

                ans += distance * min_height;
       }
       st.push(i);
    }
    return ans;
}
}

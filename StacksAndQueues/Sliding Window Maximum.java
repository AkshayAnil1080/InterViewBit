public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) {
        if(B>A.length)
        {
            int max =A[0]; int ans[]= new int[1];
            for( int i =0 ; i<A.length; i++)
            max =Math.max(max, A[i]);

            ans[0]= max; return ans;

         }
      ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
      int n = A.length;
      int ans[] = new int[n-B+1];
      int  i=0;
      for( i =0 ; i<B; i++)
      {
            while(!dq.isEmpty() && A[dq.peekLast()] <= A[i])
        {
            dq.removeLast();
        }
        dq.addLast(i);
      }
    //   i=B
      for( i=B ; i<n; i++)
      {
        ans[i-B] =  A[dq.peekFirst()];

          while(!dq.isEmpty() && dq.peekFirst() <= i-B)  // if x< i-k => ele at x curr window se piche jaa chuka, remove it
          dq.removeFirst();

            // now follow the same steps
           while(!dq.isEmpty() && A[dq.peekLast()] <= A[i])
           dq.removeLast();

           dq.addLast(i);
      }

      ans[i-B]= A[dq.peekFirst()];  // for last window
      return ans;

}
}

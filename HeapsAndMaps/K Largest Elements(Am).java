public class Solution {
    public int[] solve(int[] A, int B) {
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        for( int i=0; i<B;i++)
        {
            pq.add(A[i]);
        }
        for( int i=B; i<A.length; i++)
        {
            if(pq.peek() < A[i])
            {   pq.remove();
                pq.add(A[i]);
            }
        }
    int ans [] = new int [B];
        int ind= 0;
        while(!pq.isEmpty())
        {
            ans[ind++]=pq.remove();
        }
        return ans;
    }
}
/// 1.maitain a min heap of size k, push k ele
    // 2 traveerse in remaining array-> if(pq.peek() < A[i]) remove top ele and push A[i]
    // print min heap

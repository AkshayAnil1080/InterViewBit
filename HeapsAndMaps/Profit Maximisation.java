public class Solution {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for( int i =0 ; i<A.length; i++)
        {
            pq.add(A[i]);
        }
        int sum =0;
        for(int i =0 ; i<B; i++)
        {
            int curr=pq.remove();
            sum+=curr;

            if(curr-1>0)
            {
                pq.add(curr-1);
            }
        }
        return sum;
    }
}

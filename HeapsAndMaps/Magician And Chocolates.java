public class Solution {
    public int nchoc(int A, int[] B) {
        long mod = 1000000007;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for( int i =0; i <B.length; i++)
        pq.add(B[i]);

        long sum =0;
        for( int i =0; i<A; i++)
        {
            int curr=  pq.remove();
            sum = (sum%mod + (long)curr%mod)%mod ;

            curr=curr/2;
            if(curr>0)
            pq.add(curr);

            if(pq.isEmpty())
            return (int)sum;

        }
        return (int)(sum%mod);
    }
}

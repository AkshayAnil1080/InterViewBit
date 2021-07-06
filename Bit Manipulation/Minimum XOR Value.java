public class Solution {
    public int findMinXor(int[] A) {
      Arrays.sort(A);
        int res=Integer.MAX_VALUE;
        for( int i =0; i<A.length-1;i++)
        {
            res=Math.min(res, A[i]^A[i+1]);
        }
        return res;
    }
}

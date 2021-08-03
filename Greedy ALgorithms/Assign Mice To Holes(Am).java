public class Solution {
    public int mice(int[] A, int[] B) {
        int time =0;
        Arrays.sort(A);
        Arrays.sort(B);
        for( int i=0; i<A.length; i++)
    {
        time = Math.max(time, Math.abs(A[i]-B[i]));
    }
    return time;
    }
}

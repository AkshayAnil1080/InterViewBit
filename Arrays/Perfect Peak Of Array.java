.public class Solution {
    public int perfectPeak(int[] A) {
            int n = A.length;
        int max[] = new int[n]; // from left
        int min[] = new int[n]; // from right
        max[0] = A[0];
        min[n-1]=A[n-1];
        for( int i =1 ; i<n; i++)
        {
            max[i] = Math.max(A[i],max[i-1]);
            min[n-i-1] = Math.min(min[n-i], A[n-i-1]);
        }

        for( int  i= 1 ;i<n-1 ; i++)
        {
            if(A[i] > max[i-1] && A[i]<min[i+1])
            return 1;
        }
        return 0;
    }

}

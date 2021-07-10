public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int  n = A.length;
        for( int i =0 ; i<n ;i++)
        {
            while(i<n-1 && A[i]==A[i+1])
            i++;

            if(A[i]==n-i-1)
            return 1;
        }
        return -1;
    }
}

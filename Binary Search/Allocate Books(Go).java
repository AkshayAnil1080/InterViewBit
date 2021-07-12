public class Solution {
    public int books(int[] A, int B) {
        if(A.length < B)
        return -1;
        int n = A.length;
        int sum =0;
        int max=0;
        int res=-1;
        for( int i=0 ;i<n; i++)
        {
            sum+=A[i];
            max=Math.max(max,A[i]);
        }
        int low = max; int high=sum;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(isfeasible(A, n, B, mid))
            {
                res = mid;
                high=mid-1;
            }
            else
            low =mid+1;

        }
        return res;
    }
    boolean isfeasible(int A[] , int n, int B, int ans)
    {
        int req=1, sum=0;
        for( int i=0 ;i<n ;i++)
        {
            if(sum+A[i]>ans)
            {
                req++;
                sum=A[i];
            }
            else
            sum+=A[i];
        }
        return (req<=B);
    }
}

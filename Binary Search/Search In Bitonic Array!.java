public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int i =0; int j =n-1;
        int bp =-1;
        for( i=0; i<n-1;i++)
        {
            if(A[i]>A[i+1])
            {   bp=i;
                break;
            }
        }
       int ans1 = bSinc(A,0,bp,B);
        int ans2 = bSdec(A,bp+1,n-1,B);
        if(ans1!=-1)
        return ans1;

        if(ans2!=-1)
        return ans2;

        return -1;
    }
    int bSinc( int A[], int i , int j ,int B)
    {
        int low = i; int high=j;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(A[mid]==B)
            return mid;
            else if(A[mid] > B)
            high=mid-1;
            else
            low =mid+1;
        }
        return -1;
    }

    int bSdec( int A[], int i , int j ,int B)
    {
        int low = i; int high=j;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(A[mid]==B)
            return mid;
            else if(A[mid] > B)
            low=mid+1;
            else
            high =mid-1;
        }
        return -1;
    }
}

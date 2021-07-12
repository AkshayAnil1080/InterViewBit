public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int n = A.length;
        int low=0; int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(A[mid] == B) return mid;

            if(A[low] <A[mid])   // check if left half sorted
            {
                if(B>=A[low] && B<A[mid] )   // check if present in left half update high
                high=mid-1;
                else    // update low
                low= mid+1;
            }
            else  // irght half sorted
            {
                if(B>A[mid] && B<=A[high])  // if present in right half update low
                low=mid+1;
                else    // else update high
                high=mid-1;
            }
        }
        return -1;
    }
}

public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int i =0; int j=n-1;

        while(i<=j)
        {
            int mid = (i+j)/2;
            if(A[mid]<=B)
            i=mid+1;
            else
            j=mid-1;
        }
        return i;
    }
}
// just return low val
// A[mid]<=b low=mid+1;
// else
// h=mid-1;
//
// ret low
//
//
//
// Output Format
// Return an integer denoting the number of elements which are less than or equal to B.
//
//
//
// Example Input
// Input 1:
//
//  A = [1, 3, 4, 4, 6]
//  B = 4

// Output 1:
//
//  4
// Output 2:

 // 2

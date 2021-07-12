public class Solution {
    public int searchMatrix(int[][] A, int B) {
        int r = A.length;
        int c = A[0].length;
        int i=0;
        int j=c-1;

        while(i<r && j>=0)
        {
            if(A[i][j]==B)
            return 1;

            else if(A[i][j]<B)
            i++;
            else j--;

        }
        return 0;
    }
}


// start from righttop or leftbottom point

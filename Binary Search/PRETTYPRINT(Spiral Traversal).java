public class Solution {
    public int[][] prettyPrint(int A) {
        int n=2*A-1;
        int mat[][] = new int[n][n];
        int r = mat.length;
        int c = mat[0].length;


            int top=0; int left= 0;  int bottom=r-1; int right =c-1;
            while(top<=bottom && left<=right)
            {
                for( int i =left; i<=right; i++)
                mat[top][i]=A;
                    top++;

                for( int i =top ; i<=bottom ;i++)
                mat[i][right]=A;
                    right--;

                for( int i =right; i>=left; i--)
                mat[bottom][i] =A;
                    bottom--;

                for( int i =bottom; i>=top; i--)
                mat[i][left] =A;
                    left++;

                A--;
            }
        return mat;
    }
}


public class Solution {
    public int uniquePaths(int A, int B) {
        int dp[][] = new int[A+1][B+1];
        for( int i=0; i<B+1;i++)
        dp[1][i]=1;
        for( int i=0;i<A+1;i++)
        {
            dp[i][1]=1;
        }
        for( int i=2;i<A+1;i++)
        {
            for( int j=2; j<B+1; j++)
            {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        // if(A==1 || B==1)
        // return 1;

        // return uniquePaths(A,B-1) + uniquePaths(A-1,B);
        return dp[A][B];
    }
}

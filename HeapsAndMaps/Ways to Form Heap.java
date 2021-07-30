//  to find number of max heap can be obtianed fron given number say if n=4; o/p is 3.
// we must know :
//   a. no of max ele ar level h = 2^h.
//   b. no. of ele before a particalur level h = 2^h -1;
//   c. heigh of max heap = logh (since its a complete binary tree)
//  Formula : t(n) = (n-1)C L *t(L)* t(R)    -- 1.
//
//   to find  nodes in left sub tree-
//   (number of nodes before leaf level(h) - 1(root)  )/2 + min( (2^h)/2 , Z )
//   = (2^h -1-1)/2 + min( (2^h)/2 , Z )   --2.

// => R = n-1-L   -- 3.
//  put 2 and 3 on 1.
// if last level is completely filled => no of nodes at last level 2^h/2
// else total nodes - nodes before level h : Z =  n-(2^h-1)

public class Solution {

    long dp[] ;
    long nck[][] ;
    int log2[] ;
    long mod = 1000000007;
    // nck
    long choose( int n , int k)
    {
         if (k > n)  return 0;

        if (n <= 1) return 1;

        if (k == 0)  return 1;

        if (nck[n][k] != -1) return nck[n][k];

        long answer = choose(n - 1, k - 1) + choose(n - 1, k);
        answer%=mod;
        nck[n][k] = answer;
        return answer;
    }
    int getL(int n)
    {
        if(n==1) return 0;
        int h=  log2[n];
        int maxAth = (1<<h)/2 ;

        int lastLevelEle = n -((1<<h) -1);
        int exactlyAtlast = Math.min(maxAth, lastLevelEle);

        return ( 1<<(h-1) ) - 1 + exactlyAtlast;

    }

    public long getNumberOfMaxHeaps(int n)
    {
        if(n<=1)
            return 1;

        if(dp[n]!=-1)
            return dp[n];

        int L = getL(n);
        long ans = (choose(n-1,L)*getNumberOfMaxHeaps(L))%mod*(getNumberOfMaxHeaps(n-1-L));
        ans%=mod;
        dp[n] = ans;
        return ans;
    }


    public int solve(int n) {

        dp = new long[n+1];
        for(int i=0;i<=n;i++)
            dp[i]=-1;

            nck = new long[n+1][n+1];
        for(int i=0;i<=n;i++)
            for(int j=0;j<=n;j++)
                nck[i][j] = -1;

            log2 = new int[n+1];
        int currLogAnswer = -1;
        int currPower2 = 1;
        for(int i=1;i<=n;i++)
        {
	    if(currPower2==i)
            {
                currLogAnswer++;
                currPower2*=2;
            }
            log2[i] = currLogAnswer;
        }
        return (int)getNumberOfMaxHeaps(n);
    }
}

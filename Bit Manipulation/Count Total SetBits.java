public class Solution {
    public int solve(int A) {

        if(A==0)
        return 0;
        int mod = 1000000007;
        long x = (int)(Math.log(A) / Math.log(2));
        long y = (x * (1 << (x-1)) )%mod ;                   // x* 2^(X-1)
        int z = (A - (1 << x) +1 );                         // A-2^x

        long res =  y+z+solve(z-1);

        return (int)res%mod;

    }

}

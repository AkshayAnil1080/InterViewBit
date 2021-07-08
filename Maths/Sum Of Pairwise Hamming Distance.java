public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int hammingDistance(final int[] A) {
        int count[] =new int[32];
        int mod = 1000000007;
        int n = A.length;
        long ans =0;
        for( int x:A)
        {
            for( int i =0 ; i<32; i++)
            {
                count[i] +=(x&1);
                x=x/2;
            }
        }
        for( int i =0 ;i <32; i++)
        {
            ans+=( (long)count[i] * (n-count[i]) )%mod;
        }
        return (int)((2*ans)%mod);
    }
}

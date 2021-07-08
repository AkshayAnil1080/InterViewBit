public class Solution {
    public int cntBits(int[] A) {
        int n = A.length;
        int mod = 1000000007;
        int countOf1[] = new int[32];
        long ans =0;
        for( int x:  A)
        {
            for( int i =0 ; i<32; i++)
            {
                countOf1[i] += x&1;
                x=x/2;
            }
        }
        for( int i=0; i <32; i++)
        {
         ans +=  ( (long)countOf1[i]*( n-countOf1[i]) )%mod;
        }
        return (int)(2*ans%mod);
    }
}

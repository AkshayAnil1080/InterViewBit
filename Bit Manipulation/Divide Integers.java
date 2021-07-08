public class Solution {
    public int divide(int A, int B) {
        if(A==Integer.MIN_VALUE && B==-1)
        return Integer.MAX_VALUE;

        long l = A;
        long m = B;
        long s =  ( ( l<0) ^ (m<0) )? -1:1;
        long a =Math.abs(l);
        long b = Math.abs(m);
        long res =0 ;
        while(a>=b)
        {
            long x =0 ;
            while(a-(b<<1<<x) >=0)
            x++;                        // max number of b*2^x which is less than a.

            res+= (1<<x);  // quo;
            a-=(b<<x);                  /// dividend - b(divisor)*2^x(quo)
        }
        return (int)(s*res);            // return ans with sign.
    }
}

public class Solution {
	public int numSetBits(long n) {

        long count =0;
        while(n>0)
        {
            count += n&1;
            n=n/2;
        }
        return (int)count;
	}
}

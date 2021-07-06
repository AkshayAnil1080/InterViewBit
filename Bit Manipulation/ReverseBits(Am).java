public class Solution {
	public long reverse(long a) {

        int k=31;
        long res =0;
        while(a>0)
        {
            if((a&1)==1)
            res += (long)Math.pow(2,k--);
            else k--;

            a=a/2;
        }
        return res;
	}
}

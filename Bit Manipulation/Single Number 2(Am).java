public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int count=0;
        int ans =0;
         for( int i =0; i<32; i++)
        {
            count=0;
            for(int j=0 ; j<A.length; j++ )
            {
                if((A[j]&(1<<i))==(1<<i)) count++;

            }
            if(count%3!=0) ans|=(1<<i);

        }
       return ans;

    }
}

public class Solution {
    public int solve(int n) { // n=29
        int count=1;
        int len=1;
        while(count<n)
        {
            len++;
            int eleForThisLen = (1<<(len-1)/2) ;  //2^((len-1)/2)
            count+=eleForThisLen;                  // 1,2,4,6,10,14,22,30
        }
        count -= (1<<(len-1)/2) ;                    // 22
       int  offset = n-count-1;                          // positon of this number in his grp :29-22-1 =6

        int ans = (1<<(len-1));
        ans |= (offset<<(len/2));

        int valFR = (ans>>(len/2));
        int  rev = getRev(valFR);

        ans|=rev;
        return ans;

    }
    int getRev(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev|=(n&1);
            rev= rev<<1;

            n=n/2;
        }
        rev= rev>>1;  // one right shift req
        return rev;
    }
}

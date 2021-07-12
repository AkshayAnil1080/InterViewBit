public class Solution {
    public int sqrt(int A) {
       long low =1 ,high =A;
       long ans =0;
       while(low<=high)
       {
           long mid = (low+high)/2;
           if(mid*mid ==A)
           return (int)mid;
           if(mid*mid > A)
           high=mid-1;
           else
           {
            low=mid+1;
            ans =mid;
           }
       }
       return (int)Math.floor(ans);

    }
}

public class Solution {
    public int solve(int n) {
        int count=0;
       while((n&1)==0)
       {
           n=n/2; // n=n>>1;
           count++;
       }
        return count;
    }
}

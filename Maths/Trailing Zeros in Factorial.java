// O(n), O(1)

public class Solution {
    public int trailingZeroes(int n) {

        int res =0;
        int ans=0;
        while(n>=5)
        {
            ans =n/5;
            res=res+ans;
            n=n/5;
        }
        return res;
    }
}
// Explanation 1:
//
//  4! = 24
// Explanation 2:
//
//  5! = 120

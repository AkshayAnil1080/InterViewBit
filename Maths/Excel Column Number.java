// O(N) ,O(1)

public class Solution {
    public int titleToNumber(String A) {

         int res =0;
         int j=0;
        for( int i=A.length()-1;i>=0;i--)
        {
            res += (A.charAt(i)-'@') * Math.pow(26,j++);
        }
        return res;
    }
}
//
// Example Input
// Input 1:
//
//  1
// Input 2:
//
//  28
//
//
// Example Output
// Output 1:
//
//  "A"
// Output 2:
//
//  "AB"



// Input 1:
//     A = [1, 2, 3, 4, -10]
// Output 1:
//     10
// Explanation 1:
//     The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
// Idea: a. make max and res as arr[0];
//       b. traverser(1-n) -> add current ele in max and update max(max, max+arr[i]); -> to check if current ele(at i) is greater than the curr sum
//       c. then update res -> max(max,res)

TC,SC : O(n),O(1)
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] arr) {
        int n = arr.length;
        int res= arr[0];
        int max =arr[0];

        for( int i =1; i<n; i++)
        {
            max = Math.max( arr[i], max+arr[i]);
            res= Math.max(res,max);
        }
        return res;
    }
}

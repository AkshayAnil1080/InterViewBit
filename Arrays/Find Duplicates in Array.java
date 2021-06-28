// [3 4 1 4 1]
// Sample Output:
//
// 1
// If there are multiple possible answers ( like in the sample case above ), output any one.
//
// If there is no duplicate, output -1

Idea.
a. create hashset
b. put ele one by one , if not presetnt add in set else return the ele.
TC,SC :n ,n

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for( int  i=0 ; i<arr.length ;i++)
        {
            if(!set.contains(arr[i]))
            set.add(arr[i]);

            else return arr[i];
        }
        return -1;
    }
}

// Input:[3 1 2 5 3]
// Output:[3, 4]
// A = 3, B = 4

// Idea.
// a. create HashMap<int, bool>
// b. keep addin in map , if bool value null implies ele coming for first time, add in HashMap
//                         else duplicate ele -> add in ans[]
// c. run a loop , serach key in map whose bool is null -> missing ele, add in ans[]
TC,SC: n,n

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n =A.length;
        int ans[] = new int[2];
        HashMap<Integer,Boolean> map = new HashMap<>(); //a.

        int i =0;
        int index=0;
        for(i =0; i<n;i++)      //b. repeating ele
        {
            if(map.get(A[i]) == null)
            map.put(A[i],true);
            else
            ans[index++]=A[i];
        }

        for(i=1;i<=n;i++)     //c. missing ele
        {
            if(map.get(i)==null)
            ans[index]=i;
        }

        return ans;
    }
}

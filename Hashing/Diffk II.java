public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
    Set<Integer> set = new HashSet<>();
    for( int i =0;  i<A.length ;i++)
    {
        if(set.contains(A[i]+B) || set.contains(A[i]-B) )
        return 1;


        set.add(A[i]);
    }
    return 0;
    }

}

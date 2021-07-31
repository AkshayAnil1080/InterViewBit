public class Solution {
    public int solve(int[] A, int B) {
        int ans =0;
    HashSet<Integer> set = new HashSet<>();
        for( int i =0; i<A.length;i++)
        {
            if( set.contains(B^A[i]) )
            ans++;

            set.add(A[i]);
        }
        return ans;

    }
}


// idea is based on this property A^B=C => C^A=B and C^B=A;
// 1. we can just maintain a set and traverse in array,
// 2. if set contains targer^A[i], increment the count, add ele in set
// 3. after traversing return count

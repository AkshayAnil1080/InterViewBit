public class Solution {
    public int solve(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i =0; i<A.length;i++)
        {
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        for( int i=0 ; i<A.length ;i++)
        {
            if(map.get(A[i])>1)
            {
                return A[i];
            }
        }
        return -1;
    }
}

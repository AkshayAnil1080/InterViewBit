public class Solution {
    public int[] dNums(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int [A.length-B+1];
        int ind =0;
        for(int i=0; i<B;i++)
        {
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        ans[ind++]=map.size();

        for( int i=B; i<A.length; i++)
        {
            map.replace(A[i-B],map.get(A[i-B])-1);  // decrease the ferq of A[i-B] , and if becomes 0 remove it from map;
            if(map.get(A[i-B])==0)
            map.remove(A[i-B]);

             map.put(A[i], map.getOrDefault(A[i],0)+1);  // add the new ele

             ans[ind++]=map.size();
        }
        return ans;
    }
}



// /// 1. put B ele in map and increase the count , print size
//     2. traverse in remaining array ,
//     first remove A[i-B] , check if count =0 ;remove A[i-B] from map, push A[i], print map size

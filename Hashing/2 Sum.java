public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> al = new ArrayList<>();
         HashMap<Integer,Integer> map = new HashMap<>();
         for( int i=0; i<A.size(); i++)
         {
              if(map.containsKey(B-A.get(i)))
            {
                al.add(map.get(B-A.get(i)));
                al.add(i+1);
                break;
            }
            map.putIfAbsent(A.get(i),i+1);
         }
         return al;
    }
}

2 SUM
// find two numbers such that they add up to a specific target number.
// Nope its not the same problem you are thinking of right now.
// pair should have ind1<ind2 and If multiple solutions exist, output the one where index2 is minimum.
// If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.
// 1. traverse in array - check if map.containsKey(target-A[i]) , if yes add the indexes to ans.
// 2. tricky part is we cannot direclt put ele in map along with indexes,
// suppose in case there is duplicacy u need to put the minimum index
// So use, map.putIfAbsent(A[i],i+1);

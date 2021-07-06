TC,SC - n,1
// find all triplets and add in ans which are unique
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>>  al = new ArrayList<>();
        Collections.sort(A);
        int n = A.size();

         for(int i=0 ; i<n-2;i++)
        {
            int sec = i+1;
            int thr = n-1;
            while(sec < thr)
            {
                long sum = (long)A.get(i) + (long)A.get(sec) + (long)A.get(thr);
                if( sum == 0)
                {
                     ArrayList<Integer> ans = new ArrayList<Integer>();
                    ans.add(A.get(i));
                    ans.add(A.get(sec));
                    ans.add(A.get(thr));
                    if(!al.contains(ans))   /// a single line manipualtion req thats it.....
                        al.add(ans);
                }
                if(sum>0)
                thr--;  // sum exceed the current value
                else
                sec++;
            }       // sum is less the current vlaue.
        }
        return al;
    }
}

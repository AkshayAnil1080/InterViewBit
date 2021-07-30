public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        recur(res, A, new ArrayList<Integer>());
        return res;

    }
    public void recur( ArrayList<ArrayList<Integer>> res, ArrayList<Integer> A, ArrayList<Integer> curr)

    {
       if(A.size()==0)
       res.add(new ArrayList<Integer>(curr));

       for( int  i=0 ; i<A.size(); i++)
       {
           curr.add(A.get(i));   ///add in curr and have to remove from A then recur
           ArrayList<Integer> Adup = new ArrayList<>(A); // but cannot change the original A, as havet to itr for i=0; i<A>size()l
           Adup.remove(i);  // copy the original A in Adup and pass Adup to recur.

           recur(res, Adup, curr);
           curr.remove(curr.size() -1);// emptying the same curr when return is reached via BC.
       }
    }
}


idea :
//// need to recur under a for loop
// 1. pass a AL<AL<int>>res, A, Al<int>curr into fun
// 2. add A[i] to curr , need to remove A[i] from and add next to curr.
// but cannot change the original A, as havet to itr for i=0; i<A>size()l
// Adup.remove(i);  // copy the original A in Adup and pass Adup to recur.
// 3. After reccursion // emptying the same curr when return is reached via BC.

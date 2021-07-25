public class Solution {
    int curr_sum;
    ArrayList<Integer> al1 = new ArrayList<>();
    ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {

        curr_sum=0;

      fun(A,B);
       return ans;

    }
   void fun(TreeNode A, int B)
   {
       //1.
       if (A==null)  return;

       else if ( A.left==null && A.right==null && curr_sum+A.val !=B) return;

       //3.
       else if( (A.left==null && A.right==null) && curr_sum+A.val==B)
       {
            al1.add(A.val);  // add the curr A.val`
            ans.add(new ArrayList<>(al1));  // add list in ans
            al1.remove(al1.size()-1); // remove the curr added ele
            return; // complete previous parent call
       }

    // else add the val in ArrayList and maintain curr_sum
      al1.add(A.val);
       curr_sum +=  A.val;   // store the processed value

     fun(A.left,B) ;
     fun(A.right,B);

     curr_sum -=A.val;
     al1.remove(al1.size()-1);

   }
}


//  idea :
// need to maintain track of sum from root to curr node
// and ele through this path

// bc. if null ||  leaf && curr_sum+A.val !=B return
//   else if leaf && leaf && curr_sum+A.val ==B
// {  4 steps - 1. add curr ele in AL 2
// 2. ans.add(new AL<>(al1)
// 3.  remove the currently added ele
// 4 return // complete prev parent call

public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        return fun(A,0,B)?1:0;
    }
    boolean fun(TreeNode A, int res, int B)
   {
       if(A==null) return false;

        int pro_val = res +  A.val;   // store the processed value

       if(A.left==null && A.right==null)
       return (pro_val==B);

     return (fun(A.left, pro_val,B) || fun(A.right,pro_val,B)) ;

   }

}
// idea: since ans can be from rst or lst = > ret fun(root.left) || fun(root.right)
//now what we have do is calculate the left sum till ot reaches leaf and see if equal to given sum
// starting the fun , add the curr root.val and // bc if root==leaf ret(curr_sum==givensum)

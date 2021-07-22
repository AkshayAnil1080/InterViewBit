public class Solution {
    public int lca(TreeNode A, int B, int C) {

       if(search(A,B)==false || search(A,C)==false)
       return -1;
       TreeNode ans = lca_fun(A,B,C);
       if(ans==null)
       return -1;
       else
       return ans.val;
    }
    TreeNode lca_fun(TreeNode A, int B, int C)
    {
         if(A==null) return null;
        if(A.val==B || A.val ==C)
        return A;

    TreeNode left = lca_fun(A.left,B,C);
    TreeNode right = lca_fun(A.right, B,C);
    //1
    if(left!=null && right!=null)
    return A;
    //2
    if(left!=null && right==null)
    return left;
    //3
    else return right;
    }

     boolean search(TreeNode A, int B)
    {
        if(A==null) return false;
        if(A.val == B) return true;

       return (search(A.left,B) || search(A.right,B));
    }
}
// Idea:lca - 2 base cond  1. null check 2. if  root equals to B or C return root
//          + 2 rec one for left then right
//          + 3 cases - 1. if(left and right both not null) return root
//                      2. if(left!=null && right==null) return left
//                      3. else ret right;

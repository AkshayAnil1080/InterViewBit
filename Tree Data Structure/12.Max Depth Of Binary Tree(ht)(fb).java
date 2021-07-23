public class Solution {
    public int maxDepth(TreeNode A) {
       if(A==null) return 0;
       else
       return Math.max(maxDepth(A.left), maxDepth(A.right)) +1;
    }
}

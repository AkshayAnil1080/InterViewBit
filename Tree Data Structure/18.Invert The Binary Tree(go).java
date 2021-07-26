public class Solution {
    public TreeNode invertTree(TreeNode A) {
        if(A==null)
        return null;

        TreeNode temp = A;
        invertTree(temp.left);
        invertTree(temp.right);
        //imagine there is just 3 nodes in a tree.
        TreeNode curr=null;
        curr=temp.left;
        temp.left=temp.right;
        temp.right=curr;

        return A;
    }
}

// idea: recur left, right then swap the nodes

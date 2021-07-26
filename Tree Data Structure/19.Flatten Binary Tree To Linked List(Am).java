 // idea : either do preorder and append ele in right in a  new tree
 public class Solution {
    TreeNode head = new TreeNode(0);
    TreeNode curr=head;
    public TreeNode flatten(TreeNode a) {

       fun(a);   // pteorder

        return head.right;
    }
    void fun (TreeNode a)
    {
        if(a!=null)
        {
            curr.right=new TreeNode(a.val);
            curr=curr.right;
               fun(a.left);
                fun(a.right);

        }
    }
}

// 2. observe the order is right left node , use rec stack and add those values in a new tree.
public class Solution {
    TreeNode ans;
    public TreeNode flatten(TreeNode a) {
        ans=null;

       fun(a);

        return ans;
    }
    void fun (TreeNode a)
    {
        if(a!=null)
        {
        fun(a.right);
         fun(a.left);

        a.right= ans;
        ans =a;
        ans.left=null;

        }
    }
}

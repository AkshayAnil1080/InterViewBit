// Idea: Level Order - push root, print root, then push left node into q and update ptr to right of root.
public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
      ArrayList<Integer> al= new ArrayList<Integer>();
      Queue<TreeNode> q = new LinkedList<>();

        q.add(A);
      while(!q.isEmpty())
      {
        TreeNode curr = q.remove();
        while(curr!=null)
        {
            al.add(curr.val);

            if(curr.left!=null)
            q.add(curr.left);

            curr=curr.right;
        }
      }
      return al;
    }
}

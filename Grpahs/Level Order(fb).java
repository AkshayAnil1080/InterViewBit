public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        q.add(A);
        while(!q.isEmpty())
        {
            int size =q.size();
            ArrayList<Integer> al = new ArrayList<>();
            for( int i =0;i<size; i++)
            {
                TreeNode curr = q.remove();
                al.add(curr.val);
                if(curr.left!=null)  q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            ans.add(al);
        }
        return ans;
    }
}

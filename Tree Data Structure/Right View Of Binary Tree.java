// idea: do level order and pop the items from q till the size of previous level and add the last node in AL.
public class Solution {
   public ArrayList<Integer> solve(TreeNode A) {
       ArrayList<Integer> al = new ArrayList<Integer>();
       if(A==null) return al;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(A);
       while(!q.isEmpty())
       {
           int size=q.size();
         for( int i =0; i<size; i++)
          {
            TreeNode curr= q.poll();
           if(i==size-1)
            al.add(curr.val);

            if(curr.left!=null)
            q.add(curr.left);

            if(curr.right!=null)
            q.add(curr.right);
          }

       }

       return al;
   }
}

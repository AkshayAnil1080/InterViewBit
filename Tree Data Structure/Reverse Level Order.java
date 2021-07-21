// Idea: do level order but store every ele in stacks, 2. pop all ele from stack and add to AL, return AL.
public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {

         ArrayList<Integer> al = new ArrayList<Integer>();
        if(A==null) return al;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(A);
        while(!q.isEmpty())
        {
            int size=q.size();

          for( int i =0; i<size; i++)
           {
             TreeNode curr= q.poll();
            st.push(curr.val);

            if(curr.right!=null)
             q.add(curr.right);

             if(curr.left!=null)
             q.add(curr.left);

           }

        }
        while(!st.isEmpty())
        al.add(st.pop());

        return al;
    }
}

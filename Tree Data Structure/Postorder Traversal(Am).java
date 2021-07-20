// idea
 //1 puhs root in fir Stack
 //2 loop while fir is not empty()
        //1. pop a node from fir and move to second
        //2. if popped node has children push into first
//3 pirnt contents of second stack.
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {

         ArrayList<Integer> al = new ArrayList<Integer>();
        if(A==null) return al;
        Stack<TreeNode> fir = new Stack<>();
        Stack<TreeNode> sec = new Stack<>();

        TreeNode curr =A;
        fir.push(curr);
            while(!fir.isEmpty())
            {
                curr= fir.pop();
                sec.push(curr);
                if(curr.left!=null)   fir.push(curr.left);
                if(curr.right!=null) fir.push(curr.right);

            }
        while(!sec.isEmpty())
        {
            al.add(sec.pop().val);
        }

        return al;
    }
}

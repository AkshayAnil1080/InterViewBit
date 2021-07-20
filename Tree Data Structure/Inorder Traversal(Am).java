public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(A==null) return al;
        Stack<TreeNode> st = new Stack<>();

     TreeNode curr= A;
     while(curr!=null  || !st.isEmpty())
     {
         while(curr!=null)
         {
             st.push(curr);
             curr=curr.left;
         }

         TreeNode temp = st.pop();
         al.add(temp.val);

         curr=temp.right;
     }
        return al;

    }
}

/// tow nested loop. 1.first push all the left ele in stack. 2.pop one by one store in al 3. move right;

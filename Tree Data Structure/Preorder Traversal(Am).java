// O(n),O(n)
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();

        st.push(A);
        while(!st.isEmpty())
        {       TreeNode curr= st.pop();
                al.add(curr.val);

                // preorder follows root, left, right. since its stack we are using we need to pish right first and then left
                if(curr.right!=null) st.push(curr.right);
                 if(curr.left!=null) st.push(curr.left);

        }
        return al;
    }
}

// O(N),O(h)
// space optimized
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        TreeNode curr=A;
        st.push(curr);
        while(!st.isEmpty())
        {
            while(curr!=null)
            {
                al.add(curr.val);

                // OR space optimized just store right in stack
                if(curr.right!=null) st.push(curr.right);
                curr=curr.left;
            }
            curr=st.pop();
        }
        return al;
    }
}

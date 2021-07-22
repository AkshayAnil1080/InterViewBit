 // idea use two stack to store each level , in odd numbre of levels, one extra empty AL is added, So add only when AL is not empty
public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {

        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(A);
        while(!s1.isEmpty() || !s2.isEmpty())
        {
              ArrayList<Integer> ans1 = new ArrayList<>();
            while(!s1.isEmpty())
            {
                TreeNode curr = s1.pop();
                ans1.add(curr.val);

                if(curr.left!=null)
                {
                    s2.push(curr.left);
                }
                if(curr.right!=null)
                s2.push(curr.right);
            }
            if(!ans1.isEmpty())
            al.add(ans1);

             ArrayList<Integer> ans2 = new ArrayList<>();
             while(!s2.isEmpty())
            {
                 TreeNode curr = s2.pop();
                ArrayList<Integer> ans = new ArrayList<>();
                ans2.add(curr.val);

                if(curr.right!=null)
                s1.push(curr.right);

                if(curr.left!=null)
                {
                    s1.push(curr.left);
                }

            }
        if(!ans2.isEmpty())
            al.add(ans2);

        }
        return al;
    }
}

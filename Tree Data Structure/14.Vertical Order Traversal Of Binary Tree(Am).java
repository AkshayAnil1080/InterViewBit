class Pair
 {
     TreeNode first;
     int second;
     Pair(TreeNode n , int a)
     {
         first=n; second=a;
     }
 }
public class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {

         ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
           if(A==null) return al;
        TreeMap<Integer, ArrayList<Integer>> mp = new TreeMap<>();

        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(A,0));
        while(q.size()>0)
        {
            int size =q.size();
            for( int i =0; i<size;i++)
            {
                TreeNode temp = q.peek().first;
                int d = q.peek().second;
                q.remove();
                if(!mp.containsKey(d))
                {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(temp.val);
                    mp.put(d,ans);
                }
                else
                mp.get(d).add(temp.val);

                if(temp.left!=null) q.add(new Pair(temp.left, d-1));
                if(temp.right!=null) q.add(new Pair(temp.right, d+1));

            }
        }
        for( int x : mp.keySet())
    {
        al.add(mp.get(x));
    }
        return al;
    }
}

/// idea: to print node in each vertical level starting from leftmost
// level order for each level and d =0; and maintain a treemap<int, AL>
1. push root,d in q - if move left push(root.left,d-1) - if move right push(root.right,d+1);
2. for each level - if (map.containsKey(d))  push that ele in AL , else make new AL and add in maxDepth
3. print ele of treemap

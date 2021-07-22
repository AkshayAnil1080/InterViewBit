// 1. given bst , storing inorder into AL.
// 2. two ptr search in AL
public class Solution {
    public int t2Sum(TreeNode A, int B) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(A,al);
        int ans= two_ptr(al,B);

        return ans;

    }
    void inorder(TreeNode A, ArrayList<Integer> al)
    {
        if(A!=null)
        {
            inorder(A.left,al);
            al.add(A.val);
            inorder(A.right,al);
        }
    }
    int two_ptr(ArrayList<Integer> al, int B)
    {
        int n=al.size(); int low=0; int high=n-1;

        while(low<high)
        {
            if(al.get(low)+al.get(high)==B)
            return 1;

            else if(al.get(low)+al.get(high)>B)
            high--;

            else low++;
        }
        return 0;
    }
}


// editorial
//1 storin inroder in AL.
//2 putting ele in MAP, (NOTE: here also checks the duplicacy problem too.)
public class Solution {
    ArrayList<Integer> inorder = new ArrayList<Integer>();
    public int t2Sum(TreeNode A, int B)
    {
        in(A);
        int j = inorder.size()-1;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:inorder)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        for(Integer i:inorder)      // 9 10 20  B=20  // itreating in AL, at i =10
        // if(map.contains(B-i)) ie is 10 present do not dir ret true; check if ith == B-ith , then the frequncy of ith must be atleast twice to make 10+10=B(20)

        {
            if(map.containsKey(B-i))
            {
                if(i==B-i)
                    if(map.get(i)>=2)
                        return 1;
                    else
                        continue;
                else
                    return 1;
            }
        }
        return 0;
    }
    public void in(TreeNode root)
    {
        if(root==null)
            return;

        in(root.left);
        inorder.add(root.val);
        in(root.right);
    }
}

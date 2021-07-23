public class Solution {
    public int minDepth(TreeNode A) {
         if(A==null) return 0;
         if(A.left==null && A.right==null) // my ans.
         return 1;

         // two more cases can ocurr/  left null and right not null so move left +1;  for vice versa move right+1;
         if(A.left==null && A.right!=null)
         return minDepth(A.right)+1;

         if(A.right==null)
         return minDepth(A.left)+1;

       else
       return 1+ Math.min(minDepth(A.left), minDepth(A.right)) ;
    }
}

// 3 cases - to find path from root to nearest leaf  and leaf = if(A.left==null && A.right==null)
  // 1. if leaf  ret 1;
  // 2. if left null but right not null - move right - ret fun(A.right)+1;
  // 3. vice versa = ret fun(A.left)+1;
  // 4. else ret min(fun(A.left), fun(A.right))+1;

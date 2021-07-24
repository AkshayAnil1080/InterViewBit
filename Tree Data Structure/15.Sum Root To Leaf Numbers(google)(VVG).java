int fun(TreeNode A, int res)
   {
       if(A==null) return 0;
        int pro_val = (res*10+ A.val)%1003;   // store the processed value

       if(A.left==null && A.right==null)
       return pro_val;


       int ans = fun(A.left, pro_val) +  fun(A.right,pro_val);

       return ans%1003;
   }
}

// this also works
int fun(TreeNode A, int res)
    {
        if(A==null) return 0;
        if(A.left==null && A.right==null)
        return (res*10 + A.val)%1003;

        // store the processed value
        int pro_val = (res*10+ A.val)%1003;

        int ans = fun(A.left, pro_val) +  fun(A.right,pro_val);

        return ans%1003;
    }

ques:
1
/ \
2   3
The root-to-leaf path 1->2 represents the number 12.

The root-to-leaf path 1->3 represents the number 13.

Return the sum = (12 + 13) % 1003 = 25 % 1003 = 25.


/// idea:  recur left anf right  line 10 , -> first left part wil be complteted ,
// if leaf reached return the processed value,  + ans from right tree;

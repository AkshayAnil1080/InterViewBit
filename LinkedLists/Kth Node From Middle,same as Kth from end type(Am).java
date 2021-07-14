public class Solution {
    public int solve(ListNode A, int B) {

          ListNode slow = A;
        ListNode fast =A;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }


        fast = A;
        for( int i=0; i<B;i++)
        {
            fast=fast.next;
            if(fast==slow.next)
            return -1;
        }
        ListNode ans =A;
        while(fast!=slow)
        {
            ans=ans.next;
            fast=fast.next;
        }

        return ans.val;

    }
}

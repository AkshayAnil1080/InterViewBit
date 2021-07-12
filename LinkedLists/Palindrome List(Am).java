public class Solution {
    public int lPalin(ListNode A) {
        if(A==null) return 1;

        ListNode slow =A, fast=A;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev = reverse(slow.next);

        ListNode curr  = A;
        while(rev!=null)
        {
            if(curr.val != rev.val)
            {
                return 0;
            }
            rev=rev.next;
            curr=curr.next;
        }
        return 1;
    }
    ListNode reverse(ListNode t1)
    {
        ListNode curr  = t1;
        ListNode prev =null;
        ListNode next =null;
        while(curr!=null)
        {
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

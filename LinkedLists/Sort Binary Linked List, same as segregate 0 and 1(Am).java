public class Solution {
    public ListNode solve(ListNode A) {
        ListNode ptr = A;
        ListNode curr=A;
        while(ptr!=null)
        {
            if(ptr.val==0)
            {
                int temp = ptr.val;
                ptr.val = curr.val;
                curr.val = temp;

                curr=curr.next;
            }
            ptr=ptr.next;
        }
        return A;
    }
}

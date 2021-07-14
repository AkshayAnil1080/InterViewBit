public class Solution {
	public ListNode detectCycle(ListNode a) {

        ListNode slow = a;
        ListNode fast = a;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
            break;
        }
        if(slow!=fast)
        return null;

         slow =a;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
	}
}

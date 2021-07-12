public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode curr = A;
        while(curr!=null && curr.next!=null)
        {
            int temp =curr.val;
            curr.val = curr.next.val;
            curr.next.val = temp;

            curr=curr.next.next;
        }
        return A;
    }
}

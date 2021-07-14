public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode curr=A, next=null, prev=null;
        int count=0;
        while(curr!=null && count<B)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
        {
            ListNode curr_head = reverseList(next, B);
            A.next = curr_head;
        }
        return prev;
    }
}

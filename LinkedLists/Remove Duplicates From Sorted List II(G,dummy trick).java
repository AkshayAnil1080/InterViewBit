public class Solution {
    public ListNode deleteDuplicates(ListNode A) {

        // trick need to include one dummy ListNode   /1 1 1  2 3
        ListNode dummy = new ListNode(0);
        dummy.next=A;
        ListNode prev=dummy;
        ListNode curr =A;
        while(curr!=null)
        {

            while(curr.next!=null && prev.next.val == curr.next.val)
            curr=curr.next;                                                 // 3rd 1

            if(prev.next==curr)  // If current has unique value i.e current is not updated, Move the prev pointer to next node
            {
                prev=prev.next;
            }

            else                  // current still have the dup value , delete all dup now // firs 1 -> 2... yeah///
            prev.next=curr.next;

            //it
            curr=curr.next;
        }
        //update head;
        A=dummy.next;
        return A;

    }
}

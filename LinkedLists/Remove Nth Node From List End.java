public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode first = A;
        if(A.next==null && B==1)
        return null;
        for( int i =0 ; i<B; i++)
        {

            first=first.next;
            if(first==null) return A.next;
        }
        ListNode second = A;
        while(first.next!=null)
        {
            second = second.next;
            first=first.next;
        }
        second.next = second.next.next;
        return A;
    }
}

// O(1* n)  -- Achieved

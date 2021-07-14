
public class Solution {
    public ListNode solve(ListNode A, int B) {

        ListNode curr =A, next=null, prev=null;
        int count=0;
        while(curr!=null && count<B)
        {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr= next;
            count++;
        }

        if(A!=null)
        A.next= curr;

        //3 i dont want o reveere next k, let use a while loop toskip next k nodes.
        count=0;
        while(next!=null && count<B-1)
        {
            next=next.next;
            count++;
        }
        // call recusrion for next k and join the next to head of reversed next k nodes.
         if(next!=null)
         {
             next.next = solve(next.next, B);
         }
         return prev;
    }
}

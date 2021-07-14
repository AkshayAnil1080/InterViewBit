public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode ss=null;
        ListNode se=null, ls=null , le=null;
        ListNode curr = A;
        while(curr!=null)
        {
            if(curr.val<B)
            {
                if(ss==null)
                {
                    ss=curr;
                    se=ss;
                }

                else
                {
                    se.next=curr;
                    se=se.next;
                }
            }

            else
            {
                if(ls==null)
                {   ls=curr;
                    le=ls;
                }

                else
                {
                    le.next=curr;
                    le=le.next;
                }
            }
            curr=curr.next;

        }

        if(ss==null || ls==null)
        return A;

        se.next=ls;
        le.next=null;
        return ss;
    }
}

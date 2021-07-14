public class Solution {
    public ListNode insertionSortList(ListNode A) {
       ListNode curr=A.next;

        while(curr!=null)
        {

            ListNode temp=A;
            while(temp!=curr)
            {
                if(temp.val<key)
                temp=temp.next;

                else
                {
                    int l=temp.val;
                    temp.val=curr.val;
                    curr.val=l;
                }
            }
            curr=curr.next;
        }
        return A;
    }
}

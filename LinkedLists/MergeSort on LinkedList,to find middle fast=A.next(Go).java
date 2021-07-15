public class Solution {
    public ListNode sortList(ListNode A) {
         return mergeSort(A);
    }

      ListNode mergeSort(ListNode A)
    {
        if(A==null || A.next==null) return A;

        ListNode node = middle(A);// right half;
        ListNode next= node.next; // other half;
        node.next=null;// make right half next=null

        return sortedMerge(mergeSort(A), mergeSort(next));
    }
    ListNode sortedMerge(ListNode A, ListNode B)
    {
        ListNode ans = null;
        if(A==null) return B;
        if(B==null) return A;
        if(A.val<=B.val)
        {
            ans=A;
            ans.next=sortedMerge(A.next,B);
        }
        else
       {
           ans=B;
         ans.next=sortedMerge(A, B.next);
        // return B;
       }
       return ans;
    }
     ListNode middle(ListNode A)
    {
        if(A==null)return null;
        ListNode slow=A;
        ListNode fast=A.next;  // because if fast at A;  for 10 ele slow comes at 6th pos and partiion become of 6 and 4 ele - wrong
        // so we have to make fast ptr as A.next - now slow points to 5 th pos and partiion is 5 and 5 - right.
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}

public class Solution {
    public ListNode rotateRight(ListNode A, int k) {

         int l=0;
            for(ListNode t1=A; t1!=null; t1=t1.next)
            {
                l++;
            }
            k=k%l;
          if(k==0 || l==1)
             return A;

 /// going to kh point - using logic to find kth from end
       ListNode curr = A;
       int count=0;
        while(curr!=null &&  count<k)
        {
            curr=curr.next;
            if(curr==null)   // traversed more than k ..case when len is greater then k.
            return A;
          count++;
        }
        ListNode B = A;
        while(curr.next!=null)
        {
            curr=curr.next;
            B=B.next;
        }
//
    // store the next ref of kth- this will be head of our answer
       ListNode C=B.next;
    // make next null of kth
       B.next=null;
    // since curr was at last, make curr poin to A;
        curr.next=A;

        return C;
    }
}

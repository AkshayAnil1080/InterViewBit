//  1(X) 2(n) 3 4(m) 5(Y)  -  m=2, n=4;
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        // BC
        if(A==null || A.next==null || B==C) return A;

        ListNode X = A , m=A;
        for( int i=0; i<B-2; i++)
        {
            X=X.next;
        }
        if(B>1)  // 1 2 3 , 1 2
         m=X.next;

        ListNode n =A;
        for( int i =0; i<C-1 ;i++)
        {
            n=n.next;
        }
        ListNode Y = n.next;

        // X.next=null;
         n.next=null;

        // attaching links
        //case1
        ListNode headOfrev = rev(m,n);
        if(X==m)   // eg 1(X,m) 2(n) 3(Y) , 1 2
        {
            m.next=Y;
            return headOfrev;
        }
        // case 2.
        X.next=headOfrev;
        m.next=Y;
        return A;

    }
    ListNode rev(ListNode m, ListNode n)
    {
        ListNode prev=null, next=null, curr=m;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

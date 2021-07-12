1st way

public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A==null) return B;
        else if(B==null) return A;
        ListNode ans = null;

        if(A.val >B.val)
        {
            ans=B;
            B=B.next;

        }
        else{
            ans=A;
            A=A.next;
        }
        ListNode temp = ans;

        while(A!=null && B!=null)
        {
            if( A.val<B.val)
            {
             temp.next= new ListNode(A.val);
             A=A.next;
            }
            else
            {
                temp.next= new ListNode(B.val);
                B=B.next;
            }
             temp=temp.next;
        }
       if(A==null)
       temp.next=B;

       if(B==null)
       temp.next=A;

        return ans;
    }
}

2nd way
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A==null) return B;
        else if(B==null) return A;
        else if(A.val<B.val)
        {
            A.next=mergeTwoLists(A.next, B);
            return A;
        }
        else{
            B.next= mergeTwoLists(B.next,A);
            return B;
        }
        // return null;
    }
}

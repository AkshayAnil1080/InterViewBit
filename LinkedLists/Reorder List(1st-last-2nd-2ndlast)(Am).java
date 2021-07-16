//idea: find middle, put all ele after middle into a Stack
public class Solution {
   public ListNode reorderList(ListNode A) {

        if(A==null || A.next==null ||  A.next.next==null) return A;

       ListNode slow=A;
       ListNode fast =A;
       while(fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }
       // middle at slow    1 2 3(middle) 4
       // push ale after that in stack
       ListNode temp =slow.next;
       Stack<ListNode> st = new Stack<ListNode>();
       st.push(temp);
       while(temp.next!=null)
       {
           temp=temp.next;
           st.push(temp);
       }
       // make middle.next =null // ll mow is 1 2 3 , stack contains 4.
       slow.next=null;

       // traverse in A-middle. pop nodes from stack and keep pushing it between  elements. // insert a node between two ptr.
       ListNode curr=A, ptr=A.next;
       while(curr!=slow && !st.isEmpty() && ptr!=null)
       {
            curr.next=st.pop();
            curr.next.next=ptr;
            curr=ptr;
            ptr=ptr.next;
       }

       return A;
   }
}

public class Solution {
    public ListNode solve(ListNode A) {
         ListNode temp= A.next;
       ArrayDeque<Integer> st= new ArrayDeque<>();
        st.push(temp.val);
       while(temp!=null && temp.next!=null)
       {
           temp=temp.next.next;
           if(temp!=null)
           st.push(temp.val);
       }
    temp = A.next;
      temp.val = st.pop();
       while(temp!=null && temp.next!=null )
       {

           temp=temp.next.next;
           if(!st.isEmpty())
           temp.val = st.pop();
       }
       return A;
    }
}

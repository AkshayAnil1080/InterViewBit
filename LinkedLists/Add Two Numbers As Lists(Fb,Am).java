public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        int carry =0 ;
        ListNode prev=null, temp=null,head =null;
        ListNode curr1 = A;
        ListNode curr2= B;
        while(curr1!=null || curr2!=null)
        {
          int s = carry +  ((curr1!=null)? curr1.val:0) +  ((curr2!=null)? curr2.val:0);
          int sum = s%10;
          carry  = s/10;

          temp = new ListNode(sum);
          if(head ==null)
          {
              head = temp;
          }
          else
          prev.next = temp;

          //udpate prev
          prev = temp;

          if(curr1!=null) curr1=curr1.next;
          if(curr2!=null) curr2=curr2.next;
        }

        //handle left carry
        if(carry>0)
        temp.next = new ListNode(carry);

        return head;

    }
  }

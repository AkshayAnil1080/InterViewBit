public class Solution {
    public int isPalindrome(int n) {
        if(n<0) return 0;
        int temp = n;

        int rev =0;
        while(n!=0)
        {
            int rem =n%10;
            rev= rev*10 + rem;
            n=n/10;

        }
        if(rev==temp)
        return 1;

        else return 0;
    }
}


// Input : 12121
// Output : True
//
// Input : 123
// Output : False

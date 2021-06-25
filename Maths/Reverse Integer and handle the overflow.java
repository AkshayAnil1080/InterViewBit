public class Solution {
    public int reverse(int n) {





        int prev_rev= 0;
        int rev=0;
        while(n!=0)
        {
            int rem = n%10;
            rev = rev*10 + rem;

            if( (rev-rem)/10 != prev_rev)
            {
                return 0;    // overload condtion true
            }
            prev_rev=rev;
            n=n/10;
        }

        // return (negativeFlag==true) ?  -rev : rev;

        return rev;
     }

}


// Example1:
//
// x = 123,
//
// return 321
//
// Example2:
//
// x = -123,
//
// return -321
//
// Return 0 if the result overflows and does not fit in a 32 bit signed integer

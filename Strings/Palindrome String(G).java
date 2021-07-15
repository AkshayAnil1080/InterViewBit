public class Solution {
    public int isPalindrome(String A) {
    int n = A.length();
        int i =0;  int j=n-1;
        while(i<=j)   // this is most eff one.
        {
            char c1 = A.charAt(i);
            char c2 = A.charAt(j);
            //we only need to considetr letter or digit , if false just move i forward and j backward
            if(!Character.isLetterOrDigit(c1))   // tricky part
            i++;
            else  if(!Character.isLetterOrDigit(c2))
            j--;

            else
            {   // since here a and capital A is considered to same we need to convert both in lower or upper
                    c1=Character.toLowerCase(c1);
                    c2=Character.toLowerCase(c2);
                    if(c1==c2)
                    { i++; j--; }  //if same move i forth and j back , else ret 0;


                    else
                    { return 0;}
            }
        }
            return 1;
    }
}

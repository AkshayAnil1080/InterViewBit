

// O(logn), O(res.length())
public class Solution {
    public String convertToTitle(int n) {

        String str="";

       int a =0 ;

        while(n!=0)
        {
             a = n%26;
            {
                if(a%26==0)
               { str=str+'Z'; n--;}
                else
                str=str+(char)(a+64);
            }
            n=n/26;

        }

       StringBuffer res = new StringBuffer(str);
       res.reverse();

       return res.toString();

    }
}

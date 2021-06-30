// For example:
//
// Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
//
// Note: The result may be very large, so you need to return a string instead of an integer.

//       a. converin to string array.
// Idea :b.the sorting i req is not any standard one -> need  to use a comparator
//       c. after sorting if first ch of first ele is 0 - > the ele were  0, 0,0,0,..
//       d. else we append ele as String into StringBuilder
TC, SC : n,n
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        String str[] = new String[A.length];      //a.
        for( int i =0 ; i<A.length; i++)
        {
            str[i] = String.valueOf(A[i]);
            // System.out.print(str[i] + " ");
        }

        Comparator<String> com = new Comparator<String>()  //b.
        {   @Override
            public int compare(String s1, String s2)
            {
                String ans1=s1+s2;
                String ans2=s2+s1;
                // System.out.println(ans2.compareTo(ans1));
                return ans2.compareTo(ans1);
            }
        };
        Arrays.sort(str,com);

        if(str[0].charAt(0)=='0')   // eg arr was 0 , 0 , 0, 0 ,0   //c.
        return "0";

        StringBuilder sb = new StringBuilder();  //d.
        for(String ele : str)
        {
            sb.append(ele);
        }
        return sb.toString();

    }
}

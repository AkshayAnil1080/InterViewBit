Check Palindrome!
// Given a String. Check if characters of the given string can be rearranged to form a palindrome
// idea: put all ele in hahsmap<Characters, Integer with its occurences
//1. if string length even - the values set in map must be even
// 2. if string length is odd- only one value in values set should be odd.
public class Solution {
    public int solve(String A) {
        HashMap<Character,Integer> map = new HashMap<>();

        for( int i =0; i<A.length() ;i++)
        {
            map.put(A.charAt(i), map.getOrDefault(A.charAt(i),0)+1);
        }

    boolean flag = false;
    if(A.length()%2==0)
        for( int x : map.values())
        {
            if(x%2!=0)
            {
                return 0;
            }
        }

        else
        {
            int c=0;
            for( int x:  map.values())
            {

                if(x%2!=0)
                c++;

                if(c>1)
                return 0;
            }
        }
        return 1;
    }
}

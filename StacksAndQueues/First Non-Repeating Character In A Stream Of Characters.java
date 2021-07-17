// sol1 - Achieved
public class Solution {
    public String solve(String A) {
        int n = A.length();
        char[] ans=new char[n];

        HashMap<Character, Integer> mp = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for( int i =0; i<A.length(); i++)
        {
            mp.put(A.charAt(i), mp.getOrDefault(A.charAt(i),0)+1);
            q.add(A.charAt(i));
            while(!q.isEmpty() && mp.get(q.peek())>1)
                 q.remove();
            //     if(mp.get(q.peek())==1)
            //    { res+= (char)q.peek(); break; }
            //     else

            if(q.isEmpty())
           ans[i]='#';
            else
             ans[i]=q.peek();
        }
        return new String(ans);
    }
}
// sol2
public class Solution {
    public String solve(String A) {

        int n = A.length();
        int count[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        char[] ans=new char[n];
        for( int i =0; i<A.length(); i++)
        {
            char c =A.charAt(i);
            count[c-'a']++;

            if(count[c-'a']==1) q.add(c);
            while(!q.isEmpty() && count[q.peek()-'a'] > 1 )
            {
                q.poll();
            }
            if(q.isEmpty())
           ans[i]='#';
            else
             ans[i]=q.peek();
        }
        return new String(ans);
    }
}

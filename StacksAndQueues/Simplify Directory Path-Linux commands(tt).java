editorial
public class Solution {
    public String simplifyPath(String A) {
         String[] path = A.split("/");

        List<String> s = new ArrayList<>();

        for (String x : path) {
            switch (x) {
                case "..":
                    if (!s.isEmpty())
                        s.remove(s.size() - 1);
                    break;
                case "":
                case ".": break;
                default: s.add(x);
            }
        }
    StringBuilder sb = new StringBuilder(s.isEmpty() ? "/" : "");
        for (String elem : s) sb.append("/").append(elem);

        return sb.toString();
    }
}


sol 2
public class Solution {
    public String simplifyPath(String arr) {

         arr = (String) arr.subSequence(1, arr.length());
       String[] A = arr.split("/");
       ArrayDeque<String> st = new ArrayDeque<>();

       for(int i =0; i <A.length; i++)
       {
           if(A[i].equals(".."))
            {if(!st.isEmpty())
            st.pop();}

            else if(A[i].matches("[a-zA-Z]+"))
            {
                st.push("/" + A[i]);
            }
       }
       StringBuilder sb  = new StringBuilder();
       if(st.isEmpty())
        return "/";

        while(!st.isEmpty())
        {
            sb.append(st.removeLast());
        }
        return sb.toString();
    }
}

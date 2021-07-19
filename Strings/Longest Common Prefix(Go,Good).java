public class Solution {
    public String longestCommonPrefix(String[] A) {

        StringBuilder sb = new StringBuilder();
        if(A.length==0)
        return sb.toString();

        Arrays.sort(A);

        String fir=A[0];
        String sec =A[A.length-1];

        int min_len = Math.min(fir.length() , sec.length());
        int i =0;
        while(i<min_len)
        {
            if(fir.charAt(i) == sec.charAt(i))
            sb.append(fir.charAt(i));

            else break;

            i++;
        }
        return sb.toString();
    }
}

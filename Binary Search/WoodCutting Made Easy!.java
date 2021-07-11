public class Solution {
    public int solve(int[] A, int B) {

        int n =A.length;
        int max =A[0];
        for( int i =1; i<n;i++)
        {
            max = Math.max(max,A[i]);
        }
       int count =0 ;
       while(count<B)
       {
           count =0 ;
           for( int i =0 ; i<n;i++)
           {
               if((A[i]-max)>0)
               count+=(A[i]-max);
           }
           max--;
       }
       return max+1;
    }
}

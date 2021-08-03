public class Solution {
    public int solve(int[] A, int B) {

       int c=0;
       int pre[]= new int[A.length+1];
       int odd=0;
       {
           for( int i=0; i<A.length ;i++)
           {
               pre[odd]++;

               if(A[i]%2!=0)
               odd++;

               if(odd>=B)
               c=c+pre[odd-B];
           }
       }
       return c;
    }
}

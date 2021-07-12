public class Solution {
    public int findMedian(int[][] A) {
        int r = A.length;
        int c = A[0].length;

        int min =A[0][0];
        int max= A[0][c-1];

        for( int i =0 ;i <r;i++)
        {
            if(A[i][0] < min) min =A[i][0];
            if(A[i][c-1] > max) max= A[i][c-1];
        }
        /////////////
         int medPos =  (r*c+1)/2;
         while(min<max)
         {
             int mid = min +(max-min)/2;
             int midPos=0;
                int pos =0;
             for(int i =0; i<r ;i++)
             {
                 pos = Arrays.binarySearch(A[i], mid);
                 if(pos<0)              // if ele not found and is greater than all ele
                    pos = Math.abs(pos)-1;

                else  // ele found return pos+1;
                {
                    while(pos<c && A[i][pos]==mid)
                    pos+=1; // traversing throgh all occurence
                }

                //if ele not found eg 1 2 3 5 6 7 (A,4) -> 3
                midPos = midPos+pos;
             }
             if(midPos<medPos)
             min=mid+1;
             else
             max=mid;

         }
         return min;
    }
}

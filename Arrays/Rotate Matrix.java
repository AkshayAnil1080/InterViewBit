
// Idea:  90 degree clockwise
//   a. find transpose
//   b. swap 1st col to last col -> 2nd to 2nd last col > and so on....
//
// [                             
//     [1, 2],                     ->   [3, 1],
//     [3, 4]                           [4, 2]
// ]

//   Idea:  90 degree anticlockwise
//     a. find transpose
//     b. swap 1st row to last row -> 2nd to 2nd last row > and so on....
//
// TC,SC - n^2, 1
    public class Solution {
    	public void rotate(ArrayList<ArrayList<Integer>> al) {

            int n = al.size();
            // transpose
            for( int i= 0 ;i<n; i++)
            for(int j=i+1; j<n ;j++)
            {
                int t1 = al.get(i).get(j);
                int t2 = al.get(j).get(i);
                al.get(i).set(j,t2);
                al.get(j).set(i,t1);
            }

            // swap columns -> 1st to last -> 2 nd to 2nd last
            for(int  i=0 ; i<n; i++)
            {
                int l =0; int h = n-1;
                while(l<h)
                {
                    // swap  mat[i][l]  and mat[i][h]
                    int t1= al.get(i).get(l);
                    int t2= al.get(i).get(h);

                    al.get(i).set(l,t2);
                    al.get(i).set(h,t1);
                    l++; h--;
                }
            }

    	}
    }

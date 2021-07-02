
// Given numRows = 5,
// Return
// [
//      [1],
//      [1,1],
//      [1,2,1],
//      [1,3,3,1],
//      [1,4,6,4,1]
// ]

// Idea : a. mark 1st ele of all rows = 1;
//        b. now every ele(i,j)  = ele(i-1)(j-1) +  ele(i-1)(j);
//        c. eg at ele[1][1] = ele[0][0] + ele[0][1] , but ele[0][1] not present - need to check if j < al.get(i-1)size then only add
//        else just ele(i,j)  = ele(i-1)(j-1)
// TC,SC:  O(n^2) , O(n^2)

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {

ArrayList<ArrayList<Integer>> al= new ArrayList<ArrayList<Integer>>();
        for( int i =0; i<A ;i++)
        al.add( new ArrayList<Integer>());
        int temp =0;

        for( int i= 0; i<A; i++)
        {
            for( int j=0; j<i+1; j++)
            {
                if(j==0)      //a.
                al.get(i).add(1);

                else
                {
                    if(j < al.get(i-1).size())
                    {
                    temp = al.get(i-1).get(j-1) +  al.get(i-1).get(j);  //b
                    }
                    else
                    temp =  al.get(i-1).get(j-1); //c

                    al.get(i).add(temp);
                }
            }
        }
        return al;
    }
}

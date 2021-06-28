// Given [1, 2, 3, 4]
//  a1 >= a2 <= a3 >= a4 <= a5.....
// So, in example case, you will return [2, 1, 4, 3]
Idea :
a.sort array  1 2 3 4
b. swap first two and then next two  -> 2 1 4 3

// TC,SC : nlogn , 1
public class Solution {
    public int[] wave(int[] A) {

        Arrays.sort(A);
        for(int i=0 ; i<A.length-1; i=i+2)
        {
            int temp =A[i];
            A[i] =A[i+1];
            A[i+1]=temp;
        }
        return A;

    }


}

public class Solution {
    public int solve(int A, int B, int C, int D) {

        if(A==B && C==D)
        return 1;

        else if(A==C && B==D)
        return 1;

        else if(A==D && B==C)
        return 1;

        else
        return 0;
    }
}


Example Input
Input 1:

 A = 1
 B = 1
 C = 2
 D = 2
Input 2:

 A = 1
 B = 2
 C = 3
 D = 4


Example Output
Output 1:

 1
Output 2:

 0

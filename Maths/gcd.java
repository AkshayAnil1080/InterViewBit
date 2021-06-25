// O(log(max(A,B))) , O(log(max(A,B)))  - Euclids way

public class Solution {
    public int gcd(int A, int B) {

        if(B==0)
        return A;
        else
        return gcd(B,A%B);
    }
}


// m : 6
// n : 9
//
// GCD(m, n) : 3

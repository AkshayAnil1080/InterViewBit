public class Solution {
    public int[] primesum(int A) {
        int ans[] = new int [2];

        for( int i=2; i<A;i++)
        {
            if(isPrime(i) && isPrime(A-i))
            {
                ans[0]=i; ans[1]=A-i;
                return ans;
            }

        }
        return ans;

    }
 boolean isPrime(int n)
 {
     for(int i =2; i*i<=n;i++)
     {
         if(n%i==0)
         return false;
     }
     return true;
 }
}


Input : 4
Output: 2 + 2 = 4

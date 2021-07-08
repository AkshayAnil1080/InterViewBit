public class Solution {
    public int solve(int A, int[] B) {
        long mod=1000000007;
        int n = B.length;
        if(A==n) return 0;
        Arrays.sort(B);
        int N=A-n;


        ArrayList<Integer> al =new ArrayList<>();
        al.add(B[0]-1);                  //starting Gap
        for(int i=1;i<n;i++)
        al.add(B[i]-B[i-1]-1);              //Middle gaps

        al.add(A-B[n-1]);                     //End Gaps

        long ans=0;
        ans=fact(N);
        for(int i=0;i<al.size();i++)
        {
            ans*=(power(fact(al.get(i)),1000000005)%mod);
            ans=ans%mod;
        }
        long z=1;
        for( int i= 1;i<al.size()-1; i++)
        {
            if(al.get(i)<2) continue;
            z*=power(2,al.get(i)-1);
            z=z%mod;
        }
        ans=(ans*z)%mod;
        return (int)(ans%mod);
    }

     long fact(long N)
    {
        long mod=1000000007;
        long ans=1;
        for(long i=1;i<=N;i++)
        {
            ans*=1;
            ans=ans%mod;
        }
        return ans;
    }

    long power(long a,long N)
    {
        long mod=1000000007;
        if(N==0) return 1;
        if(N==1) return a;
        long temp=(power(a,N/2))%mod;

        if(N%2==0) return ((temp*temp)%mod);
        return ((((a*temp)%mod)*temp)%mod)%mod;
    }


}

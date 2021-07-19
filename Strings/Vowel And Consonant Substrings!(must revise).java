public class Solution {
    public int solve(String A) {
        long mod = 1000000007;
        int n = A.length();
        int vo[] = new int[n+1];
        int co[] = new int[n+1];


    if("aeiou".contains(A.charAt(n-1)+""))
    vo[n-1]=1;
    else
    co[n-1]=1;
    for( int i =n-2; i>=0; i--)
    {
        if("aeiou".contains(A.charAt(i)+""))
        {
            vo[i]=vo[i+1]+1;
            co[i]=co[i+1];
        }
        else
        {co[i]=co[i+1]+1;
        vo[i]=vo[i+1];
        }

    }
        long ans=0;
        for( int i =0; i<n; i++)
        {
            if("aeiou".contains(A.charAt(i)+""))
            {
                ans= (long)ans%mod+ (long)co[i]%mod ;
            }
            else
           ans= (long)ans%mod+ (long)vo[i]%mod ;
        }
        return (int)ans;
    }

}

// Idea:
// 1.     // filling arrays - co[i] = number of consonants from ith to last
            // and vo[i] = number of vowels from ith to last
// 2. // now traverse again in original String
// if vow at  i= > No(sepecial string) = 1*(x) = x is number of consonants from ith to last
// sim if con at i =>  No(sepecial string) = 1*(x) = x is number of vowels from ith to last

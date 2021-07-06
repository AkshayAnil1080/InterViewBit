// n,1 - two ptr
public class Solution {
    public int diffPossible(int[] A, int B) {

  int n = A.length;
    int i =0; int j=0;
    while(i<n && j<n)
    {
        if(A[i]-A[j]==B && i!=j)
        return 1;

        else if(A[i]-A[j]>B)
        {
            j++;
        }
        else
        i++;
    }
    return 0;
}
}


// n,n - hashset
public class Solution {
    public int diffPossible(int[] A, int B) {
   HashSet<Integer> set  = new HashSet<>();
   for( int x : A)
   {
       if(set.contains(x-B))
       return 1;
       set.add(x);

   }
   return 0;
 }
}

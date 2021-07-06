// n,1
public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
     int i=0 ; int j=0 ;
     int n =A.length;
     // here -ve will be handled among -ve and +ve among +ve
          while(i<n && j <n)    // y not i=0 and j=n-1 ; while(i<=j) // to handle the clash of +ve - (-ve) ,
     {
         int d = A[i]-A[j];
         if(i!=j && d==B)
         return 1;
         else if(d <B)
         i++;
         else
         j++;
     }
     return 0;
    }
}


// using hashset
public class Solution {
    public int solve(int[] A, int B) {
     HashSet<Integer> set = new HashSet<>();
     for( int i=0 ; i<A.length; i++)
     {
         if(set.contains(A[i]-B) || set.contains(A[i]+B))
         return 1;
         set.add(A[i]);
     }
     return 0;
    }
}

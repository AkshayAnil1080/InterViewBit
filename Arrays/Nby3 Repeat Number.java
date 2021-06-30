// Idea : Moores Soritng ALgo - two set formed -> one having prime candidate havnin frequency >n/2
//                                             -> another ele whose frequency < n/2
//
//     a. if to find >n/2 - we search in set 1. and need to maintain only on candidate
//     b. to search in set 2, we need to maintain two candidate, (among them one will be prime)
//        we dont know which one
//      So , we check the count for both candidate ,and if freq>n/3 we return it. if one having freq>n/2 is encountered first we return than ele only 
// Example :

// Input : [1 2 3 1 1]
// Output : 1
// 1 occurs 3 times which is more than 5/3 times.
// TC, SC - n,1
      public class Solution {
  	// DO NOT MODIFY THE LIST
  	public int repeatedNumber(final List<Integer> a) {
          int c1 =0 ;int c2=0;
          int f = Integer.MIN_VALUE; // or max
          int s = Integer.MIN_VALUE;// or max - it should be the ele not present in arr
          int n = a.size();
          for(int i=0; i<a.size(); i++)
          {//a.
          int j = a.get(i);
          if(f == j)
          c1++;

          else if(s==j)  //b.
          c2++;

          else if(c1==0)  //c.
          { f = j ; c1++;}

          else if(c2==0)  //d.
          {s =j ; c2++;}

          else{           //e.
              c1--; c2--;
          }
          }

          c1=0; c2=0;
           for(int i=0; i<n; i++)
           {
               if(a.get(i) == f) c1++;
               else if(a.get(i) == s) c2++;
           }
           if(c1>n/3)
           return f;

           if(c2 >n/3)
          return s;

           return -1;

  	}
  }

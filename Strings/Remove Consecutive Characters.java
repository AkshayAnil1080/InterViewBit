
// Idea  : store count from right to left - eg aabcd =  2 1 1 1 1
// traversing in String if(count[i]==B) i=i+B; else { add characters till count[i] time ahead and update i=i+count[i]}
public class Solution {
    public String solve(String A, int B) {
        int n = A.length();
       StringBuilder sb = new StringBuilder();
        int count[] = new int[A.length()];

        count[n-1]=1;
        for( int i=n-2; i>=0; i--)
        {
            if(A.charAt(i)!=A.charAt(i+1))
            count[i]=1;

             if(A.charAt(i)==A.charAt(i+1))
             {
            count[i] = 1+ count[i+1];
             }
        }

        // for( int x : count)
        // System.out.print(x+" ");
        int i =0;
        while(i<n)
        {
            if(count[i]==B)
            {
                i=i+B;
            }

          else
            {
                    int j=i, k=0;
                    while( k<count[i] )
                    { sb.append(A.charAt(j)); j++; k++;
                    }

                i=i+count[i];
            }
        }
        // sb.append(A.charAt(n-1));
        return sb.toString();
    }
}
// Editorial
// idea for ith pos , if next characters are repreating j++;
// now j-i stores the count of reptition of ith character -  check if(j-i)==B, ignore all reptition and upadte i =j;
//                                                           else include all repition ans answer res=res+A(i);  i++;
String res="";
for( int i=0; i<n; i++)
{
  int j=i;
  while(j<A.length() && A.charAt(j)==A.charAt(i))
  j++;

  if(j-i ==B)  i=j;
  else
  {res=res+A.charAt(i); i++; }
}

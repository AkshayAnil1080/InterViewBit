// TC,SC - n,1
// Dutch National Flag .
// 0 - last index-> l
// 1 - last index-> i
// 2 - start index-> h
// So While loop (i<=h)
 // A[i] if found 1 -> continue  i++;
      // if found 0 -> swap(A[i],A[l]) i++ ;l++;
      // if found 2 -> swap(A[i],A[h]) h--;
public class Solution {
	public void sortColors(ArrayList<Integer> al) {
        int l=0 ;   // for 0.
        int n=al.size();
        int i=0; // for 1
        int h=n-1; //for 2

       while(i<=h)
        {
            if(al.get(i)==1) i++;
            else if(al.get(i)==0)
            {
                int t1= al.get(l);
                int t2 = al.get(i);
                 al.set(l,t2);
                 al.set(i,t1);
                 l++;
                 i++;
            }
            else
            {   int t1= al.get(h);
                int t2 = al.get(i);
                al.set(h,t2);
                al.set(i,t1);

                 h--;
            }
        }
	}
}

// to considers duplicate when elements are repeated more than twice.
// a. traverse in Array
// b. if(i<n-2 and A[i]==A[i+1]==A[i+2]) continue; no problem
//     else
//     {
//       A[j++]=A[i];
//     }
//
// TC,SC -n,1

public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {

        int j=0;

        for( int i =0 ;i <a.size();i++)  // i<a.size()-2 here i tried but not work for if elements is just 1 or 2.
        {
            if(i<a.size()-2 && a.get(i).equals(a.get(i+1)) && a.get(i).equals(a.get(i+2)) ) continue;
            else
            {
                a.set(j++,a.get(i));

            }

        }

        return j;

	}
}

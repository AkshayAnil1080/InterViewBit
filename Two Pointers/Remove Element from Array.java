
// Idea:  copy the distinct ele to beginning(j++) return j ;
// O(n)

public class Solution {
	public int removeElement(ArrayList<Integer> al, int b) {
        int j= 0;
        int n = al.size();
        for(int i = 0; i<n ; i++)
        {
            if(!al.get(i) .equals(b))
            {
                al.set(j++, al.get(i));
            }
        }
        return j;
	}

}


class Triplet implements Comparable<Triplet>
{
    int val , aPos, vPos;
    Triplet(int v, int ap, int vp)
    {
        val =v; aPos=ap; vPos = vp;
    }
    public int compareTo(Triplet t)
    {
        if(val<=t.val) return -1;
        else return 1;
    }
}


public class Solution {
    public int[] solve(int[][] arr) {

        int k = arr.length;
        int n = arr[0].length;
        int ans[] = new int[k*n]; int ind=0;
PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>();

 for(int i=0; i<k; i++)
        {
            pq.add(new Triplet(arr[i][0], i,0));
        }

         while(!pq.isEmpty())
        {
            Triplet curr = pq.poll();
            ans[ind++]  =curr.val;

            int ap = curr.aPos ; int vp = curr.vPos;

            if(vp+1 < n)
            pq.add(new Triplet(arr[ap][vp+1] , ap, vp+1));
        }

        return ans;

    }
}

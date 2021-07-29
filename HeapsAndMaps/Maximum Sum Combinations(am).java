class Triplet
{
    int x ; int y; int sum ;
    Triplet(int x, int y, int sum)
    {
        this.x=x; this.y=y; this.sum=sum;
    }
}

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        Collections.sort(A, (a,b) -> b-a);
        Collections.sort(B, (a,b) -> b-a);
        ArrayList<Integer> ans = new ArrayList<>();

        PriorityQueue<Triplet> pq = new PriorityQueue<>((a,b) -> b.sum - a.sum);

        for(int i=0; i<A.size();i++)
        {
            pq.add(new Triplet(i,0,A.get(i)+B.get(0)) );
        }
        for( int i =0 ;i<C; i++)
        {
            Triplet curr=  pq.remove();
            ans.add(curr.sum);

            // checking is size of B is now equals to curr.y
            if(curr.y==B.size()-1) continue;

            //case2.
            pq.add(new Triplet(curr.x, curr.y+1 , A.get(curr.x) + B.get(curr.y+1)) );
        }
        return ans;
    }
}

// 1, adding all ele in A+B[0] and pushing into queue
// 2. run loop c times - since want c times max sum Comb
// 3. poll once and check of size of array b is still remaining , then get the index of curr A, the next B and push to q

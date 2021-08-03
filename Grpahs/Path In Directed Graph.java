public class Solution {
    int ans=0;
    public int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i=0; i<A+1; i++)
        adj.add(new ArrayList<>());

        for( int i =0; i<B.length;i++)
        {
            adj.get(B[i][0]).add(B[i][1]);
        }
        boolean vis[] = new boolean[A+1];
        for( int i =1; i<A;i++)
        {
            if(vis[i]==false)
            dfs(adj,i,vis,A);
        }
        return ans;
    }
   void  dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[],int A)
    {
        if(s==A){
            ans=1; return;
        }

        vis[s]=true;
        for( int x: adj.get(s))
        {
            if(vis[x]==false)
            dfs(adj,x,vis,A);
        }
    }
}

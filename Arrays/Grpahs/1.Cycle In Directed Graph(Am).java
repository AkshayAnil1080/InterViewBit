public class Solution {
    public int solve(int A, int[][] B) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i=0; i<A+1 ;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for( int i=0; i<B.length;i++)
        {
            adj.get(B[i][0]).add(B[i][1]);
        }

        int indegree[] = new int[A+1];
        for( int u=1;u<A+1;u++)
        {
            for(int x : adj.get(u))
            indegree[x]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for( int i =1; i<A+1;i++)
        if(indegree[i]==0)
        q.add(i);


        int count=0;
        while(!q.isEmpty())
        {
            int u = q.poll();
            for( int x: adj.get(u))
            if(--indegree[x]==0)
            q.add(x);

            count++;
        }
        if(count!=A)
        return 1;

    return 0;

    }
}


// 1 sol:
public class Solution {
    public int solve(int A, int[][] B) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i=0; i<A+1 ;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for( int i=0; i<B.length;i++)
        {
            adj.get(B[i][0]).add(B[i][1]);
        }

       if(dfs(adj,A)==true) return 1;

       return 0;
    }
   boolean dfsrec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] vis, boolean[] recSt )
    {
        vis[s]=true; recSt[s]=true;

        for( int u: adj.get(s) )
        {
            if(vis[u]==false && dfsrec(adj, u, vis, recSt)==true)
            return true;

            else if(recSt[u]==true)
            return true;
        }
        recSt[s]=false;
        return false;
    }
    boolean dfs(ArrayList<ArrayList<Integer>> adj, int A )
    {
        boolean vis[]= new boolean[A+1];
        boolean recSt[] = new boolean[A+1];
        for( int i=1;i <A+1;i++)
        {
            if(vis[i]==false)
                if(dfsrec(adj,i,vis,recSt)==true)
                return true;
        }
        return  false;
    }
}


idea:
1. find back edge
2 way : do top sort, when polling out from queue maintain count++;    at last if(count!=V) ret 1; // cycle exists

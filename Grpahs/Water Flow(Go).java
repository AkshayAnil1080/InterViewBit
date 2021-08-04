public class Solution {
    class pair
    {
        int x ; int y;
        pair(int x, int y)
        {this.x=x; this.y=y;}
    }

    int  ans=0;
    public int solve(int[][] A) {
        int n = A.length;  int m = A[0].length;
        int v[][] = new int[n][m];  int vis[][] =new int[n][m];

        for(int i=0; i <n; i++)
        {
          vis[i][0]=1; // 1st row
          v[i][m-1]=1; // last row
          bfs(A,n-1,m-1,i,m-1,v); // for last since handling red lake start fomr last
          bfs(A,n-1,m-1,i,0,vis); // 1st row blue lake , start from 0,0
        }

        for( int i =0; i<m; i++)
        {
            vis[0][i]=1;
            v[n-1][i]=1;
           bfs(A,n-1,m-1,n-1,i,v);
           bfs(A,n-1,m-1,0,i,vis);
        }
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==1 && v[i][j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }

    void bfs(int [][] A, int n, int m , int a, int b, int[][] v)
    {
        int x,y;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(a,b));
        while(!q.isEmpty()){
            pair p=q.poll();
            x=p.x;
            y=p.y;
            if(x-1>=0 && A[x-1][y]>=A[x][y] && v[x-1][y]==0){
                q.add(new pair(x-1,y));
                v[x-1][y]=1;
            }
            if(x+1<=n && A[x+1][y]>=A[x][y] && v[x+1][y]==0){
                q.add(new pair(x+1,y));
                v[x+1][y]=1;
            }
            if(y-1>=0 && A[x][y-1]>=A[x][y] && v[x][y-1]==0){
                q.add(new pair(x,y-1));
                v[x][y-1]=1;
            }
            if(y+1<=m && A[x][y+1]>=A[x][y] && v[x][y+1]==0){
                q.add(new pair(x,y+1));
                v[x][y+1]=1;
            }
        }
        return;
    }
}

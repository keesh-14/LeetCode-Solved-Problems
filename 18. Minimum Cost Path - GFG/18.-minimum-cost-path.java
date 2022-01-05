// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.minimumCostPath(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
class Pair
{
  int x, y, data;
  Pair(int x,int y,int data)
  {
    this.x=x;
    this.y=y;
    this.data=data;
  }
}
    public int minimumCostPath(int[][] grid)
    {
        int n = grid.length;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((t1,t2)->(t1.data-t2.data));
         // boolean visited[][]=new boolean[n][n]
          pq.offer(new Pair(0,0,grid[0][0]));
        //visited[0][0]=true;
        grid[0][0] = -1;
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        while(!pq.isEmpty())
        {
          Pair curr=pq.poll();
          int currx=curr.x;
          int  curry=curr.y;
          int data=curr.data;
          if(currx == n-1 && curry==n-1)
          return data;
          for(int i[]:dir)
          {
            int nextx=currx+i[0];
            int nexty=curry+i[1];
            if(nextx<0 || nexty<0 || nextx>=n || nexty>=n || grid[nextx][nexty]==-1)
            continue;
            
            int currentCost = data + grid[nextx][nexty];
            grid[nextx][nexty]=-1;
            pq.offer(new Pair(nextx,nexty,currentCost));
           
          }
        }
        return 0;
    }
}
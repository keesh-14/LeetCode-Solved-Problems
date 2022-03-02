// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        int grid[][] = new int[V][V];
        int k = 0;
        
        for(ArrayList<ArrayList<Integer>> ad : adj)
        {
            for(ArrayList<Integer> al : ad)
            {
                grid[k][al.get(0)] = al.get(1);
            }
            k++;
            
        }
        int dist[] = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] = 0;
        boolean vis[] = new boolean[V];
        int sum =0;
        for(int i=0;i<V;i++)
        {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j=0;j<V;j++)
            {
                if(vis[j]!=true && dist[j]<min)
                {
                    min = dist[j];
                    idx = j;
                }
            }
            vis[idx] = true;
            sum = sum + min;
            for(int j=0;j<V;j++)
            {
                if(grid[idx][j]!=0 && vis[j]!=true)
                {
                    dist[j] = Math.min(dist[j],grid[idx][j]);
                }
            }
        }
        
        return sum;
        
    }
}

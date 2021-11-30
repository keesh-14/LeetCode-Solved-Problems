class Solution {
    public boolean back(List<List<Integer>> adj,boolean vis[],int st,int ed)
    {
        if(st==ed)
            return true;
        vis[st] = true;
        List<Integer> al = new ArrayList<Integer>(adj.get(st));
        for(int t : al)
        {
            if(vis[t]!=true)
            {
                vis[t] = true;
                if(back(adj,vis,t,ed))
                    return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
            
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean vis[] = new boolean[n];
        
        if(back(adj,vis,start,end))
            return true;
        else
            return false;
    }
}
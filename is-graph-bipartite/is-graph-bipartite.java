class Solution {
    public boolean DFS(int graph[][],int res[],int S)
    {
        
        for(int i=0;i<graph[S].length;i++)
        {
            
            if(res[S]==res[graph[S][i]])
                return false;
            if(res[graph[S][i]]==0)
            {
                if(res[S]==1)
                res[graph[S][i]]=2;   
                else if(res[S]==2)
                res[graph[S][i]]=1;
                
                if(!DFS(graph,res,graph[S][i]))
                    return false;
            
            }
            
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int res[] = new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(res[i]==0)
            {
                res[i]=1;
                if(!DFS(graph,res,i))
                    return false;
            }
        }
        return true;
        
    }
}
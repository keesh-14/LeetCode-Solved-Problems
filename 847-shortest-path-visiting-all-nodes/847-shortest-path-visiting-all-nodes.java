class Solution {
    class Pair{
        int val;
        int mask;
        Pair(int val,int mask)
        {
            this.val = val;
            this.mask = mask;
        }
    }
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int target = (1<<n) - 1;
        
        boolean visited[][] = new boolean[n][target];
        
        Queue<Pair> q = new LinkedList<Pair>(); 
        for(int i=0;i<n;i++)
        {
            q.add(new Pair(i,1<<i));
        }
        
        int steps = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                Pair curr = q.poll();
                if(curr.mask==target)
                    return steps;
                if(visited[curr.val][curr.mask])
                    continue;
                visited[curr.val][curr.mask] = true;
                for(int x : graph[curr.val])
                {
                    q.add(new Pair(x,curr.mask | (1<<x)));
                    
                }
            }
            steps++;
            
        }
        return steps;
    }
}
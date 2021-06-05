class Solution {
    public void DFS(int S,int D,int[][] graph,List<List<Integer>> al,ArrayList<Integer> a)
    {
        if(S==D)
        {    
            al.add(new ArrayList<Integer>(a));
            return;
        }
        for(int i:graph[S])
        {
            a.add(i);
            DFS(i,D,graph,al,a);
            a.remove(a.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        int source = 0;
        int dest = graph.length -1;
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        DFS(source,dest,graph,al,a);
        return al;
    }
}
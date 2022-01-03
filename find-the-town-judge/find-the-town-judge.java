class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int adj[][] = new int[n][n];
        for(int i=0;i<trust.length;i++)
        {
            adj[trust[i][0]-1][trust[i][1]-1]=1;
        }
        for(int i=0;i<adj.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<adj.length;j++)
            {
                if(adj[j][i]==0 && i!=j)
                    flag = false;
            }
            if(flag==true)
                al.add(i);
                
        }
        if(al.size()==0)
            return -1;
        int x = -1;
        for(int i=0;i<al.size();i++)
        {
           boolean present = false; 
           for(int j=0;j<trust.length;j++) 
            if(al.get(i)+1==trust[j][0])
            {
                present = true; 
                
            }
            if(!present)
            {
                x = al.get(i)+1;
            }
        }
        return x;
    }
}
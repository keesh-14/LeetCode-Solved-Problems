class Solution {
   
    public int numIslands(char[][] grid) {
          int count = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    
                     DFS(i,j,grid);
            
                }
                    
            }
        }
        return count;
    }
    public void DFS(int i,int j,char grid[][])
    {
        if(i<0 || j<0 || j>=grid[0].length || i>=grid.length || grid[i][j]=='0')
            return ;
        if(grid[i][j]=='1')
        {
            
                grid[i][j] = '0';
                 DFS(i,j+1,grid); 
                 DFS(i+1,j,grid);
                 DFS(i-1,j,grid); 
                 DFS(i,j-1,grid); 
            
        }
    }
}
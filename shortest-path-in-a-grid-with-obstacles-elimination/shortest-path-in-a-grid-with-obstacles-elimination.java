class Solution {
    public int shortestPath(int[][] grid, int k) {
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; 
        int m = grid.length;
        int n = grid[0].length;
        
        // visited[i][j][k] means whether the element in grid at grid[i][j] has been visited with k number of obstacles eliminated already
        boolean[][][] visited = new boolean[m][n][k + 1]; 
        visited[0][0][0] = true; //grid[0][0] is 0 with 0 obstacles eliminated
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 0});
        
        int shortestPath = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int[] presentLoc = q.poll();
                int x = presentLoc[0];
                int y = presentLoc[1];
                int alreadyEliminated = presentLoc[2];
                
                if(x == m - 1 && y == n - 1) return shortestPath;
                
                for(int[] dir : dirs) {
                    int neighborX = x + dir[0];
                    int neighborY = y + dir[1];
                    int nextElimination = alreadyEliminated;
                    
                    if(neighborX >= 0 && neighborX < m && neighborY >= 0 && neighborY < n) {
                        if(grid[neighborX][neighborY] == 1) {
                            nextElimination++;
                        }
                        
                        if(nextElimination <= k && !visited[neighborX][neighborY][nextElimination]) {
                            visited[neighborX][neighborY][nextElimination] = true;
                            q.offer(new int[]{neighborX, neighborY, nextElimination});
                        }
                    }
                }
            }
            shortestPath++;
        }
        return -1;
    }
}
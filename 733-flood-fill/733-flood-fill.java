class Solution {
    public void DFS(int image[][],int i,int j,int newColor,boolean vis[][],int c)
    {
        if(i>=image.length || j>=image[0].length || i<0 || j<0 || image[i][j]!=c || vis[i][j]==true)
            return;
        image[i][j] = newColor;
        vis[i][j] = true;
        DFS(image,i,j+1,newColor,vis,c);
        DFS(image,i+1,j,newColor,vis,c);
        DFS(image,i,j-1,newColor,vis,c);
        DFS(image,i-1,j,newColor,vis,c);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean vis[][] = new boolean[image.length][image[0].length];
                int c = image[sr][sc];
               
                    DFS(image,sr,sc,newColor,vis,c);
                
    
        return image;
    }
}
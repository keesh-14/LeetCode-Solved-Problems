class Solution {
    public int check(int board[][],int i,int j)
    {
        
        int count = 0;
        if(j<board[i].length-1 && board[i][j+1]==1)
            count++;
        if(i>0 && board[i-1][j]==1)
            count++;
        if(j>0 && board[i][j-1]==1)
            count++;
        if(i<board.length-1 && board[i+1][j]==1)
            count++;
        if(i<board.length-1 && j<board[i].length-1 && board[i+1][j+1]==1)
            count++;
        if(i>0 && j>0 && board[i-1][j-1]==1)
            count++;
        if(i<board.length-1 && j>0 && board[i+1][j-1]==1)
            count++;
        if(i>0 && j<board[i].length-1 && board[i-1][j+1]==1)
            count++;
        
        
     return count;
        
    }
    public void gameOfLife(int[][] board) {
        int temp[][] = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(check(board,i,j)==3 && board[i][j]==0)
                    temp[i][j] = 1;
                else if(check(board,i,j)<2 || check(board,i,j)>3)
                    temp[i][j] = 0;
                else 
                    temp[i][j] = board[i][j];
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j] = temp[i][j];
            }
        }
        
    }
}
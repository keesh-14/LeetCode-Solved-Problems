class Solution {
    int count = 0;
    public void back(boolean col[],int row,boolean Ndiag[],boolean Rdiag[])
    {
        if(col.length==row)
        {
            count++;
            return;
        }
        for(int i=0;i<col.length;i++)
        {
            if(col[i]==false && Ndiag[row+i]==false && Rdiag[row - i + col.length-1]==false)
            {
                col[i]=true;
                Ndiag[row+i]=true;
                Rdiag[row - i + col.length-1]=true;
                back(col,row+1,Ndiag,Rdiag);
                col[i]=false;
                Ndiag[row+i]=false;
                Rdiag[row - i + col.length-1]=false;
                
            }
        }
    }
    public int totalNQueens(int n) {
        boolean col[] = new boolean[n];
        boolean Ndiag[] = new boolean[2*n-1];
        boolean Rdiag[] = new boolean[2*n-1];
        
        back(col,0,Ndiag,Rdiag);
        return count;
    }
}
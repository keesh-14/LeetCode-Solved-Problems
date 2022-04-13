class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int dir=1;
        int count = 1;
        while(left<=right && top<=bottom)
        {
            if(dir%4==1)
            {
                for(int i=left;i<=right;i++)
                {
                    mat[top][i]=count;
                    count++;
                }
                top++;
                
            }
            else if(dir%4==2)
            {
                for(int i=top;i<=bottom;i++)
                {
                    mat[i][right] = count;
                    count++;
                }
                right--;
            }
            else if(dir%4==3)
            {
                for(int i=right;i>=left;i--)
                {
                    mat[bottom][i] = count;
                    count++;
                }
                bottom--;
            }
            else if(dir%4==0)
            {
                for(int i=bottom;i>=top;i--)
                {
                    mat[i][left] = count;
                    count++;
                }
                left++;
            }
            dir++;
                
        }
    
          return mat;
        }
}
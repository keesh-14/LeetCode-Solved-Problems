class Solution {
     public boolean binary(int n,int matrix[][],int low,int high,int target)
    {
        while(low<=high)
        {
           int  mid = (low+high)/2;
            if(matrix[n][mid]==target)
                return true;
            else if(matrix[n][mid]>target)
            {
                high = mid -1;
            }
            else 
                low = mid + 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
               if(binary(i,matrix,0,matrix[i].length-1,target))
                   return true;
         }
        return false;
    }
}
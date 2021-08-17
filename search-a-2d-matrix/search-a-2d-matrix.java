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
       int top=0;
       int bottom = matrix.length-1;
        int len = matrix[0].length-1;
       while(top<=bottom)
       {
           int mid = (top + bottom)/2;
           if(matrix[mid][len]>=target && matrix[mid][0]<=target)
           {
               if(binary(mid,matrix,0,matrix[mid].length-1,target))
                   return true;
               else 
                   return false;
           }
           else if(matrix[mid][len]<target)
           {
               top =  mid + 1;
           }
           else if(matrix[mid][0]>target)
               bottom = mid - 1;
        }
        return false;
    }
}
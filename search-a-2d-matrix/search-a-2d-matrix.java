class Solution {
    public boolean search(int arr[],int low,int high,int target)
    {
        if(low<=high)
        {
           int  mid = (low+high)/2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid]>target)
                return search(arr,low,mid-1,target);
            else 
                return search(arr,mid+1,high,target);
            
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int row = 0;
        int bottom= matrix.length-1;
        while(top<=bottom)
        {
           int  mid = (top + bottom)/2;
           if(matrix[mid][0]<=target && matrix[mid][matrix[mid].length-1]>=target)
            {
                row = mid;
               break;
            }
            else if(matrix[mid][matrix[mid].length-1]<target)
                top++;
            else if(matrix[mid][0]>target)
                bottom--;
        }
        return search(matrix[row],0,matrix[row].length-1,target);
    }
}
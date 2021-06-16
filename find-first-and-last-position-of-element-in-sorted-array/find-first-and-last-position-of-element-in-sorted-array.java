class Solution {
    public int binaryL(int nums[],int target)
    {
        int low=0;
        int high = nums.length-1;
        int ind = -1;
       while(low<=high)
       {
           int mid = (low+high)/2;
           if(nums[mid]==target)
               ind = mid;
            if(nums[mid]>=target)
               high = mid -1;
           else 
               low = mid + 1;
       }
        return ind;
    }
    public int binaryR(int nums[],int target)
    {
        int low=0;
        int high = nums.length-1;
        int ind = -1;
       while(low<=high)
       {
          int  mid = (low+high)/2;
           if(nums[mid]==target)
               ind = mid;
           if(nums[mid]<=target)
               low = mid +1;
           else 
               high = mid - 1;
       }
        return ind;
    }
    
    public int[] searchRange(int[] nums, int target) {
           int temp1 = binaryL(nums,target);
        int temp2 = binaryR(nums,target);
        int arr[] = new int[2];
        arr[0]=temp1;
        arr[1] = temp2;
         return arr; 
    }
}
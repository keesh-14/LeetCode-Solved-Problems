class Solution {
   public int binary(int nums[],int low,int high)
   {
       while(low<=high)
       {
           int mid  = (low+high)/2;
           if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
               return mid;
           else if(nums[mid-1]>nums[mid])
               high = mid -1;
           else if(nums[mid+1]>nums[mid])
               low = mid+1;
               
       }
       return -1;
   }
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        else if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        int peek = binary(nums,1,nums.length-2);
        return peek;
        
    }
}
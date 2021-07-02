class Solution {
    int a[] = new int[2];
   public int binaryL(int low,int high,int[] nums,int target)
   {
       while(low<=high)
       {
           int mid = (low + high)/2;
           if(nums[mid]==target && (mid==0 || nums[mid-1]!=target))
               return mid;
           else if(nums[mid]>=target)
               high = mid - 1;
           else 
               low = mid + 1;
               
       }
       return -1;
   }
    public int binaryR(int low,int high,int[] nums,int target)
   {
       while(low<=high)
       {
           int mid = (low + high)/2;
           if(nums[mid]==target && (mid==nums.length-1 || nums[mid+1]!=target))
               return mid;
           else if(nums[mid]>target)
               high = mid - 1;
           else 
               low = mid + 1;
               
       }
       return -1;
   }
    public int[] searchRange(int[] nums, int target) {
       
        a[0] = binaryL(0,nums.length-1,nums,target);
        a[1] = binaryR(0,nums.length-1,nums,target);
        return a;
        
          
    }
}
class Solution {
    public int psearch(int low, int high,int nums[])
    {
          if(high<low)
            return -1;
        // if(high==low)
        //     return low;
        int mid=(low+high)/2;
        if(mid<high && nums[mid]>nums[mid+1])
            return mid;
        else if(mid>low && nums[mid]<nums[mid-1])
            return mid-1;
        else if(nums[mid]>nums[0])
            return psearch(mid+1,high,nums);
        return psearch(low,mid-1,nums);
            
        
           
    }
    public int binarysearch(int low,int high,int target,int nums[])
    {
        int mid = (low + high)/2;
       
           if(low<=high)
           {
           if(nums[mid]==target)
               return mid;
            else if(nums[mid]<target)
                return binarysearch(mid+1,high,target,nums);
            else 
                return binarysearch(low,mid-1,target,nums);
           }
        
        return -1;
    }
    public int search(int[] nums, int target) {
         int pivot = psearch(0,nums.length-1,nums);
        if(pivot==-1)
            return binarysearch(0,nums.length-1,target,nums);
         int left =  binarysearch(0,pivot,target,nums);
          int right = binarysearch(pivot+1,nums.length-1,target,nums);
        if(left!=-1)
            return left;
        if(right != -1)
            return right;
        
        return -1;
    }
}
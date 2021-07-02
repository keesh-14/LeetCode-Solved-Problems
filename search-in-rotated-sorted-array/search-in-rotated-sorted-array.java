class Solution {
    public int psearch(int[] nums,int low,int high)
    {
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(mid!=nums.length-1 && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[0]<=nums[mid])
                low = mid + 1;
            else 
                high = mid -1;
        }
           return -1; 
    }
    public int binaryL(int[] nums,int low,int high,int target)
    {
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return -1;
    }
     public int binaryR(int[] nums,int low,int high,int target)
    {
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot = psearch(nums,0,nums.length-1);
        System.out.println(pivot);
        int i=-1;
        int j=-1;
        if(pivot==-1)
         i = binaryL(nums,0,nums.length-1,target);
         else 
         {
            i = binaryL(nums,0,pivot,target); 
            j = binaryR(nums,pivot+1,nums.length-1,target);
         }
        if(i==-1 && j==-1)
            return -1;
        else if(i==-1)
            return j;
       
            return i;
    }
}
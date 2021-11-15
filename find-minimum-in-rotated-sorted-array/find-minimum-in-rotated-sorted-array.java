class Solution {
    public int pivot(int nums[],int low,int high)
    {
    
        while(low<=high)
        {
            int mid = (high + low)/2;
            if(mid!=0 && nums[mid-1]>nums[mid])
                return mid;
            if(mid!=nums.length-1 && nums[mid]>nums[mid+1])
                return mid+1;
            else if(nums[mid]>nums[0])
                low = mid + 1;
            else 
                high = mid -1;
        }
        return -1;
            
    }
    public int findMin(int[] nums) {
        int p = pivot(nums,0,nums.length-1);
        if(p==-1)
            return nums[0];
        return nums[p];
    }
}
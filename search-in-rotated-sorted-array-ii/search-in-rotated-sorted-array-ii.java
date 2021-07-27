class Solution {
    public int pivot(int[] arr,int low,int high)
    {
        for(int i=low+1;i<=high;i++)
        {
            if(arr[i-1]>arr[i])
                return i;
        }
            return -1;
    }
    public boolean binary(int nums[],int low,int high,int target)
    {
        if(low>high)
            return false;
        int mid = (high + low)/2;
        if(nums[mid]==target)
            return true;
        else if(nums[mid]<target)
            return binary(nums,mid+1,high,target);
        else
            return binary(nums,low,mid-1,target);
    }
    public boolean search(int[] nums, int target) {
        int p = pivot(nums,0,nums.length-1);
        if(p==-1)
        {
           return binary(nums,0,nums.length-1,target);
        }
        System.out.println(p);
         return binary(nums,0,p-1,target) || binary(nums,p,nums.length-1,target);
        
    }
}
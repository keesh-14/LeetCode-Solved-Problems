class Solution {
    public void nextPermutation(int[] nums) {
        int i=0;
     
        for( i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
            
                break;
            }
        }
        if(i==-1)
        {
            Arrays.sort(nums);
            return;
        }
        int j=0;
        
        for(j=nums.length-1;j>=0;j--)
        {
            if(nums[j]>nums[i])
                break;
        }
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
        Arrays.sort(nums,i+1,nums.length);
        
    }
}
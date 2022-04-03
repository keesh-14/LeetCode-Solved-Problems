class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        int a=nums[nums.length-1];
        while(i>=0 && nums[i]>=a)
        {
            a = nums[i];
            i--;
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
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        Arrays.sort(nums,i+1,nums.length);
        
        
    }
}
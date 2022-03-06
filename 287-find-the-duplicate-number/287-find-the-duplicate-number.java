class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            int idx = Math.abs(nums[i]);
            if(nums[idx-1]<0)
                return idx;
            nums[idx-1] = nums[idx-1] * -1;
            
        }
        return nums.length;
    }
}
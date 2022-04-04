class Solution {
    public int majorityElement(int[] nums) {
        int currentMax = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==currentMax)
                count++;
            else 
                count--;
            if(count==0)
            {
                currentMax = nums[i];
                count = 1;
            }
            
        }
        return currentMax;
    }
}
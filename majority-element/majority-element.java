class Solution {
    public int majorityElement(int[] nums) {
        int m=0;
        int count =1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[m])
            {
                count--;
            }else 
            {
                count++;
            }
            if(count==0)
            {
                count=1;
                m=i;
            }
        }
        count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[m])
                count++;
        }
        if(count>nums.length/2)
            return nums[m];
        return -1;
    }
}
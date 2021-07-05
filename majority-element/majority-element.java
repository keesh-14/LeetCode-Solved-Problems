class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int m = nums[0];
        int i=1;
        int count=1;
        int j=0;
        while(j<nums.length)
        {
            if(nums[j]==nums[i])
                count++;
            else 
                count--;
            if(count==0)
            {
                count = 1;
                m = nums[j];
                i=j; 
            }
            j++;
        }
        return m;
    }
}
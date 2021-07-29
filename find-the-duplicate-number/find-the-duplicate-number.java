class Solution {
    public int findDuplicate(int[] nums) {
         int slow = nums[nums[0]];
         int fast = nums[nums[nums[0]]];
        while(fast!=slow)
        {
            fast = nums[nums[fast]];
            slow = nums[slow];
        }
        slow = nums[0];
        while(fast!=slow)
        {
            fast = nums[fast];
            slow = nums[slow];
        }
        return fast;
    }
}
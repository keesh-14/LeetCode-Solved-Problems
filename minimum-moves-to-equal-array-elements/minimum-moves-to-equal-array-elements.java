class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            min = Math.min(nums[i],min);
            sum = nums[i]+sum;
        }
        return sum - nums.length*min;
    }
}
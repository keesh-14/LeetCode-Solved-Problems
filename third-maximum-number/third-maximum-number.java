class Solution {
    public int thirdMax(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>first)
            {
                third = second;
                second = first;
                first = nums[i];
                
            }
            else if(first!=nums[i] && nums[i]>second)
            {
                third = second;
                second = nums[i];
            }
            else if(second!=nums[i] && first!=nums[i] && nums[i]>third)
            {
                third = nums[i];
            }
        }
        if(hs.size()<3)
            return first;
        return third;
    }
}
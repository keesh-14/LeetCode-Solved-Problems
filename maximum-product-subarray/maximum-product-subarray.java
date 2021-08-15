class Solution {
    public int maxProduct(int[] nums) {
        int omax = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                max = 1;
                min = 1;
                mx = 0;
            }
            int temp = max;
            max = Math.max(max*nums[i],Math.max(min*nums[i],nums[i]));
            min = Math.min(temp*nums[i],Math.min(min*nums[i],nums[i]));
            omax = Math.max(mx,Math.max(max,omax));
        }
        return omax;
    }
}
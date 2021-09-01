class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int m= nums[i] + nums[j];
        while(i<j)
        {
            int s = nums[i]+nums[j];
            if(m<s)
            {
                m = s;
            }
            i++;
            j--;
        }
        return m;
    }
}
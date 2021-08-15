class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int i=0;
        int j=0;
        int pre = 1;
        while(i<nums.length)
        {
          //  if(i<nums.length && pre[i]<k)
            // {
            //     count = count + i;
            //     i++;
            // }
            pre = pre*nums[i];
            while( i<nums.length && j<=i && pre>=k)
            {
                 pre = pre/nums[j];
                j++;
                 
                
            }
            count = count + i - j + 1;
            i++;
        }
        return count;
    }
}
class Solution {
    public int jump(int[] nums) {
        int max = nums[0];
        int jump = 1;
        int step = nums[0];
        if(nums[0]==0 || nums.length==1)
            return 0;
        for(int i=1;i<nums.length;i++)
        {
            if(i==nums.length-1)
              return jump;
            max = Math.max(nums[i]+i,max);
            step--;
            if(step==0)
            {
                jump++;
                if(max<=i)
                    return -1;
                step = max - i;
            }
        }
        return jump;
    }
}
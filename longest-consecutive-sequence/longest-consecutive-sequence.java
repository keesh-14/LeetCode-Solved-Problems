class Solution {
    
    public int longestConsecutive(int[] nums) {
        int count=1;
        int res=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]-1))
                continue;
            else if(hs.contains(nums[i]+1))
            {
                count=1;
                int j=1;
                while(hs.contains(nums[i]+j))
                {
                    count++;
                    j++;
                }
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
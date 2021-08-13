class Solution {
    
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        if(nums.length==0)
            return 0;
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
            
        }
        int max = 0;
       
        for(int i=0;i<nums.length;i++)
        {
             int count=1;
            if(hs.contains(nums[i]+1))
                continue;
            int temp = nums[i]-1;
            while(hs.contains(temp))
            {
                temp--;
                count++;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
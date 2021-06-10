class Solution {
    
    public int longestConsecutive(int[] nums) {
                  HashSet<Integer> hs = new HashSet<Integer>();
       int count=1;
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int j=1;
         
                 if(hs.contains(nums[i]-j))
                {
                  continue; 
                }
            
                while(hs.contains(nums[i]+j))
                {
                    count++;
                    j++;
                }
                
            
            res=Math.max(count,res);
            count=1;
        }
        return res;
    }
}
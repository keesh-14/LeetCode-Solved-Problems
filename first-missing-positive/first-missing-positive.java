class Solution {
    public int firstMissingPositive(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            min = Math.min(nums[i],min);
            else 
                continue;
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            hs.add(nums[i]);
        }
        int k=1;
        for(int i=0;i<n;i++)
        {
            if(hs.contains(k))
                k++;
            else 
                return k;
        }
        return k;
        }
}
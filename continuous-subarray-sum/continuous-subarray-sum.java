class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int pre = 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==0 && nums[i]==0)
                return true;
        }
        for(int i=0;i<nums.length;i++)
        {
            pre = pre + nums[i];
            if(pre%k==0 && i>0)
                return true;
            if(hm.containsKey(pre%k))
            {
                if(i-hm.get(pre%k)>1)
                {
                   return true;
                }
            }
            hm.put(pre%k,i);
        }
        return false;
    }
}
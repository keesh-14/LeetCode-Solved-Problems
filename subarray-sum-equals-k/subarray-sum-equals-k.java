class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int count = 0;
        int pre = 0;
        for(int i=0;i<nums.length;i++)
        {
            pre = pre + nums[i];
            if(k==pre)
                count++;
            if(hm.containsKey(pre-k))
            {
                count = count + hm.get(pre-k);
            }
            if(hm.containsKey(pre))
            hm.put(pre,hm.get(pre)+1);
            else 
            hm.put(pre,1);
        }
        return count;
    }
}
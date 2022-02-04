class Solution {
    public int findMaxLength(int[] nums) {
        int pre  = 0;
        int len = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]== 0)
                pre  -= 1;
             else 
                 pre += 1;
            if(pre ==0)
                len = i+1;
            if(hm.containsKey(pre))
                len  = Math.max(len,i-hm.get(pre));
            else 
                hm.put(pre,i);
        }
        return len;
    }
}
class Solution {
    public int findMaxLength(int[] nums) {
           for(int i=0;i<nums.length;i++)
           {
               if(nums[i]==0)
                   nums[i] = -1;
           }
        int sum=0;
        int res =0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            if(sum==0)
                res = i+1;
            if(hm.containsKey(sum))
                res = Math.max(res,i-hm.get(sum));
            else
                hm.put(sum,i);
        }
        return res;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
             HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]) && i!=hm.get(target-nums[i]))
            {
                arr[0]=i;
                arr[1]=hm.get(target-nums[i]);
            }
            
        }
        return arr;
            
    }
}
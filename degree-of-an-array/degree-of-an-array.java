class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            hm.put(nums[i],hm.get(nums[i])+1);
            else 
            hm.put(nums[i],1);
        }
        int max=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n=0;
        for(Map.Entry<Integer,Integer> a : hm.entrySet())
        {
            if(a.getValue()>=max)
            {
            max = a.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> a : hm.entrySet())
        {
            if(a.getValue()==max)
            {
              al.add(a.getKey());
            }
        }
        int min = Integer.MAX_VALUE;
        for(int temp:al)
        {
              int i=0;
            int j = nums.length-1;
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]==temp)
                    break;
            }
            for(j=nums.length-1;j>=0;j--)
            {
                if(nums[j]==temp)
                    break;
            }
            min = Math.min(j-i+1,min);
                
        }
        return min;        
        
        
    }
}
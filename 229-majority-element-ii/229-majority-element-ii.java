class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int scount = 0;
        int fcount = 0;
        for(int i=0;i<nums.length;i++)
        {
        
            if(max == nums[i])
                fcount++;
            else if(secondMax==nums[i])
                scount++;
            else if(fcount==0)
            {
                max=nums[i];
                fcount=1;
                
            }
            else if(scount == 0)
            {
                secondMax = nums[i];
                scount = 1;
                
            }
            else
            {
                scount--;
                fcount--;
                
            }
            
        }
        fcount = 0;
        scount = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max)
                fcount++;
            else if(nums[i]==secondMax)
                scount++;
        }
        if(nums.length/3<fcount)
            al.add(max);
        if(nums.length/3<scount)
            al.add(secondMax);
        
        return al;
    }
}
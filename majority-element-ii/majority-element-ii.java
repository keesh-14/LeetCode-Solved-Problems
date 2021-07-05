class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al = new ArrayList<Integer>();
        int c1=0;
        int c2=0;
        int i=0;
        int max1=Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(i<nums.length)
        {
            if(nums[i]==max1)
            {
                c1++;
            }
            else if(nums[i]==max2)
            {
                c2++;
            }
            else if(c1==0)
            {
                max1 = nums[i];
                c1++;
            }
            else if(c2==0)
            {
                max2 = nums[i];
                c2++;
            }
            else 
            {
                c1--;
                c2--;
            }
            i++;
        }
        c1 = 0;
        c2 = 0;
        for(int c=0;c<nums.length;c++)
        {
            if(nums[c]==max1)
                c1++;
            if(nums[c]==max2)
                c2++;
            
        }
        if(c1>nums.length/3)
            al.add(max1);
        if(c2>nums.length/3)
            al.add(max2);
        return al;
    }
}
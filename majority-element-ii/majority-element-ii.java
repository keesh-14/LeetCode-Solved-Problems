class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int c1 = 0;
        int c2 = 0;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==num1)
                c1++;
            else if(nums[i]==num2)
                c2++;
            else if(c1==0)
            {
                num1=nums[i];
                c1++;
            }
            else if(c2 == 0)
            {
                num2 = nums[i];
                c2++;
            }
            else 
            {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==num1)
                c1++;
            if(nums[i]==num2)
                c2++;
        }
        if(c1>nums.length/3)
            al.add(num1);
        if(c2>nums.length/3)
            al.add(num2);
        return al;
    }
}
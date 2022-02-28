class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> al = new ArrayList<String>();
        if(nums.length==0)
            return al;
        if(nums.length==1)
        {
            al.add(String.valueOf(nums[0]));
            return al;
        }
        int last = -1;
        for(int i=1;i<nums.length;i++)
        {
            boolean flag = false;
            int a = nums[i-1];
            int k = a;
            while(i<nums.length && (a+1==nums[i]) )
            {
                flag = true;
                a++;
                i++;
            }
            if(a==k)
            al.add(String.valueOf(k));
            else 
            {
                String c = String.valueOf(a);
                al.add(k+"->"+c);
                last = a;
            }
            
            
        }
        if(last!=nums[nums.length-1])
            al.add(String.valueOf(nums[nums.length-1]));
        
        
        return al;
    }
}
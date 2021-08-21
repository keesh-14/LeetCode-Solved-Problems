class Solution {
    public String largestNumber(int[] nums) {
        String st = "";
        String ans[] = new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] =  Integer.toString(nums[i]);
        }
        Arrays.sort(ans,(s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(ans[i].equals("0"))
                count++;
             st = st + ans[i];
        }
        if(count==ans.length)
            return "0";
        return st;
    }
}
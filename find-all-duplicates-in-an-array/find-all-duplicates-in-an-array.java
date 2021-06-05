class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int index = Math.abs(nums[i]);
            if(nums[index-1]<0)
            {
                al.add(index);
              
            }
            else
                nums[index -1] = -nums[index -1];
        }
        return al;
    }
}
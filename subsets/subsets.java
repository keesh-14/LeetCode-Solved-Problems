class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public void back(int nums[],List<Integer> al,int index)
    {
        res.add(new ArrayList<Integer>(al));
        for(int i=index;i<nums.length;i++)
        {
            al.add(nums[i]);
            back(nums,al,i+1);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> al = new ArrayList<Integer>();
        back(nums,al,0);
        return res;
    }
}
class Solution {
    public void back(List<List<Integer>> res,List<Integer> al,int nums[],int k)
    {
        if(k>nums.length)
            return;
        res.add(new ArrayList<Integer>(al));
        for(int i=k;i<nums.length;i++)
        {
            al.add(nums[i]);
            back(res,al,nums,i+1);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        back(res,al,nums,0);
        return res;
    }
}
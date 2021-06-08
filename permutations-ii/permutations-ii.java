class Solution {
    public void per(List<Integer> al,List<List<Integer>> res,int[] nums,boolean vis[])
    {
        if(nums.length==al.size())
        {
            res.add(new ArrayList<Integer>(al));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(vis[i]==false)
            {
                vis[i]=true;
                al.add(nums[i]);
                per(al,res,nums,vis);
                al.remove(al.size()-1);
                vis[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<List<Integer>> r= new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        boolean vis[] = new boolean[nums.length];
        per(al,res,nums,vis);
        HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
        for(int i=0;i<res.size();i++)
            {
                hs.add(res.get(i));
            }
        for(List<Integer> i: hs)
        {
            r.add(i);
        }
        return r;
    }
}
class Solution {
    HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
    public void bac(List<List<Integer>> res,List<Integer> al,int nums[],int index)
    {
        
        res.add(new ArrayList<Integer>(al));
       for(int i=index;i<nums.length;i++)
       {
            if(i>index && nums[i]==nums[i-1])
                continue;
            al.add(nums[i]);    
            bac(res,al,nums,i+1);
            al.remove(al.size()-1);      
        
       }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        Arrays.sort(nums);
        bac(res,al,nums,0);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(List<Integer> a : res)
        {
            hs.add(a);
        }
        for(List<Integer> a:hs)
        {
            ans.add(a);
        }
        return ans;
    }
}
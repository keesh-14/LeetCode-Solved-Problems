class Solution {
    public void rec(List<Integer> al,List<List<Integer>> res,int nums[],boolean check[])
    {
        if(nums.length == al.size())
        {
            res.add(new ArrayList<>(al));
            return;
            
        }
        for(int i=0;i<nums.length;i++)
        {
             if(check[i]==false)
             {
                check[i]=true;
                 al.add(nums[i]);
                 rec(al,res,nums,check);
                 al.remove(al.size()-1);
                 check[i]=false;
             }
    
        }
        return ;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        boolean check[] = new boolean[nums.length];
        rec(al,res,nums,check);
        return res;
    }
}
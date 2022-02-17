class Solution {
    public void back(int in, int target,List<Integer> al,List<List<Integer>> res,int candidates[])
    {
        if(target<0)
            return;
        if(target==0)
        {
            res.add(new ArrayList<Integer>(al));
            return;
            
        }
        
        for(int i=in;i<candidates.length;i++)
        {
            al.add(candidates[i]);
            back(i,target-candidates[i],al,res,candidates);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        back(0,target,al,res,candidates);
        return res;
        
    }
}
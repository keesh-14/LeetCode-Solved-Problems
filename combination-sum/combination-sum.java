class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public void back(int index,List<Integer> al,int target,int[] candidates)
    {
        if(target<0)
            return;
        if(target==0)
        {
             res.add(new ArrayList<Integer>(al));
            
        }
        for(int i=index;i<candidates.length;i++)
        {
           
            al.add(candidates[i]);
            back(i,al,target-candidates[i],candidates);
            al.remove(al.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> al = new ArrayList<Integer>();
        back(0,al,target,candidates);
        return res;
    }
}
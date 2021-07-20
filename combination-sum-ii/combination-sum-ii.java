class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
    public void back(int[] candidates,int target,List<Integer> al,int index,boolean[] check)
    {
        if(target<0)
            return;
        if(target==0)
        {
            res.add(new ArrayList<Integer>(al));
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(check[i]==false)
            {
            al.add(candidates[i]);
            check[i]=true;
            back(candidates,target-candidates[i],al,i+1,check);
            al.remove(al.size()-1);
            check[i]=false;    
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> al = new ArrayList<Integer>();
        Arrays.sort(candidates);
        boolean check[] = new boolean[candidates.length];
        back(candidates,target,al,0,check);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(List<Integer> a:res)
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
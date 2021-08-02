class Solution {
    public void back(int i,int j,List<Integer> al,List<List<Integer>> res,int k)
    {
        if(k==0)
        {
            
            res.add(new ArrayList<Integer>(al));
            return;
        }
        for(int x=i;x<=j;x++)
        {
            al.add(x);
            back(x+1,j,al,res,k-1);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        back(1,n,al,res,k);
        return res;
    }
}
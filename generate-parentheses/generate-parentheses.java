class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> output = new ArrayList<String>();
        back(n,output,0,0,"");
        return output;
    }
    public void back(int max,List<String> output,int close,int open,String curr)
    {
        if(curr.length()==max*2)
        {
            output.add(curr);
            return;
        }
        
        if(open<max)
        {
            back(max,output,close,open+1,curr+'(');
        }
        if(close<open)
        {
            back(max,output,close+1,open,curr+')');
        }
    }
}
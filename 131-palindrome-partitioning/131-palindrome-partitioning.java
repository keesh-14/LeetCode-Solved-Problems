class Solution {
    public boolean isPal(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
    public void back(List<List<String>> res,List<String> al,String s,int index)
    {
        if(s.length()==index)
        {
           res.add(new ArrayList<String>(al));
            return;
        }
        for(int i = index;i<s.length();i++)
        {
            String st = s.substring(index,i+1);
            if(isPal(st))
            {
                al.add(st);
                back(res,al,s,i+1);
                al.remove(al.size()-1);
            }
        }
        
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> al = new ArrayList<String>();
        back(res,al,s,0);
        return res;
    }
}
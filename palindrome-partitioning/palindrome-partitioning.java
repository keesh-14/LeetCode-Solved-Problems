class Solution {
    List<List<String>> res = new ArrayList<List<String>>();
    public boolean isPallindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
        
    }
    public void back(List<String> al,int index,String s,String st)
    {
        if(s.length()==0)  
        {
            res.add(new ArrayList<String>(al));
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.println(st);
            st = st+ s.charAt(i);
            if(isPallindrome(st))
            {
            al.add(st);
            back(al,i+1,s.substring(i+1),"");
            al.remove(al.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> al = new ArrayList<String>();
        back(al,0,s,"");
        return res;
    }
}
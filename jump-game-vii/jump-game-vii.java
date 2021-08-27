class Solution {
    public boolean can(String s,int x,int y)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        if(s.charAt(s.length()-1)=='1')
            return false;
       
        q.add(0);
        int max =0;
            while(!q.isEmpty())
            {
                int curr = q.poll();
                 if(curr==s.length()-1)
                     return true;
                 for(int i=Math.max(curr+x,max);i<=curr+y && i<s.length();i++)
                 {
                    if(s.charAt(i)=='0')
                    {
                        q.add(i);
                    }
                  }
                max = Math.max(max,curr+y);
            }
      return false;  
    }
    public boolean canReach(String s, int minJump, int maxJump) {
        return can(s,minJump,maxJump);
    }
}
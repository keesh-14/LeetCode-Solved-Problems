class Solution {
    public String removeDuplicateLetters(String s) {
        boolean exists[] = new boolean[26];
        int freq[] = new int[26];
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']--;
            if(exists[s.charAt(i)-'a'])
                continue;
            while(st.size()>0 && st.peek()>s.charAt(i) && freq[st.peek()-'a']>0)
            {
                char res = st.pop();
                exists[res-'a']=false; 
                
            }
            st.push(s.charAt(i));
            exists[s.charAt(i)-'a']=true;
        }
        char ans[] = new char[st.size()]; 
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i] = st.pop();
        }
       // String str="";
       //  for(int i=0;i<ans.length;i++)
       //  {
       //      str = str + ans[i];
       //  }
        return new String(ans);
    }
}
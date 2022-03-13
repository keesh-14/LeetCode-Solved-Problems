class Solution {
    public boolean isValid(char a,char b)
    {
        if((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'))
            return true ;
        return false;
    }
    public boolean isValid(String s) {
        char c[] = new char[s.length()];
        c = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='(' || c[i]=='{' || c[i]=='[')
            {
                st.add(c[i]);
            }
            else 
            {
                if(st.isEmpty())
                    return false;
                if(!isValid(st.peek(),c[i]))
                    return false;
                else 
                {
                    st.pop();
                }
            }
            
        }
        if(!st.isEmpty())
            return false;
        return true;
    }
}
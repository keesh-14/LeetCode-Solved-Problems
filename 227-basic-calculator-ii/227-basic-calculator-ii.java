class Solution {
    
    public int calculate(String s) {
        s = s + "+";
        char op ='+';
        int currNum  = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(s.charAt(i)))
            currNum = 10*currNum+(s.charAt(i)-'0');
            else if(c=='+'||c=='-'||c=='/'||c=='*')
            {
            
                if(op=='+')
                {
                    st.add(currNum);
                }
                else if(op =='-')
                {
                    st.add(-currNum);
                }
                else if(op=='*')
                {
                    st.add(st.pop()*currNum);
                }
                else if(op=='/')
                {
                    st.add(st.pop()/currNum);
                }
                currNum = 0;
                op = c;
            }
        }
        int ans  = 0;
        while(!st.isEmpty())
        {
            ans += st.pop(); 
        }
        return ans;
    }
}
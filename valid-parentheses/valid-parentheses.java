class Solution {
    public static boolean isBalanced(char a,char b)
    {
        if((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'))
            return true;
        return false;
    }
    public static boolean isValid(String s)
    {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                st.add(s.charAt(i));
            else
            {
                if(!st.isEmpty())
                {
                    
                    if(!isBalanced(st.peek(),s.charAt(i)))
                       return false;
                    else 
                        st.pop();
                       
                }
                else 
                {
                    return false;
                }
                      
                    
            }
                 
        }
        if(!st.isEmpty())
            return false;
      
    return true; 
    }

}

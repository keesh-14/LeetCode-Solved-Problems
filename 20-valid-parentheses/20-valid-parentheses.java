class Solution {
    public boolean isValidP(char a,char b)
    {
        if((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}'))
            return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.add(s.charAt(i));
            }
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
            {
                   if(st.isEmpty())
                       return false;
                   if(!isValidP(st.peek(),s.charAt(i)))
                   {
                       return false;
                       
                   }
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
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int i=0;
        while(i!=n)
        {
            String st ="";
            if(i==0)
            {
             st = s.substring(i+1) + s.charAt(0);
            }
            else 
            {
            st = s.substring(i+1) + s.substring(0,i+1);
            }
            System.out.println(st);
            if(st.equals(goal))
                return true;
            
            i++;
        }
        return false;
    }
}
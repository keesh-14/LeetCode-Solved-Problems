class Solution {
    public String reverseWords(String s) {
        ArrayList<String> al = new ArrayList<String>();
        String str="";
        int j=0;
        for(int i=j;i<s.length();i++)
        {
            
            while(j<s.length() && s.charAt(j)!=' ')
            {
               
              str = str + s.charAt(j);
                j++; 
            }
            i=j;
            if(str!="")
             al.add(str);
           str="";
           j++;
        }
        Collections.reverse(al);
        String st ="";
        for(int i=0;i<al.size();i++)
        {
            st=st+al.get(i)+" ";
        }
        return st.trim();
    }
}
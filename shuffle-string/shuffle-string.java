class Solution {
    public String restoreString(String s, int[] indices) {
        char ans[] = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ans[indices[i]] = s.charAt(i);
        }
        String a="";
        for(int i=0;i<s.length();i++)
        {
            a = a + ans[i];
        }
        return a;
    }
}
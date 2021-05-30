class Solution {
    public boolean isSubsequence(String s, String t) {
        return isSubsequence(s,t,0,0);
    }
    
    public boolean isSubsequence(String s, String t, int i, int j) {
        if(i >= s.length()) return true;  //"" is substring for any string
        if(j >= t.length()) return false; //not fully found a substring
        
        if(s.charAt(i) == t.charAt(j)) 
            return isSubsequence(s,t,i+1,j+1);
        return isSubsequence(s,t,i,j+1);
    }
}
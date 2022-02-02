class Solution {
    public List<Integer> findAnagrams(String s2, String s1) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        int n=s1.length();
        int m=s2.length();
        if(n>m) return al;
        for(int i=0;i<n;i++) {
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
        }
        if(isEqual(c1, c2)){
              al.add(0);   
        }
        for(int i=n;i<m;i++) {
            c2[s2.charAt(i-n)-'a']--;
            c2[s2.charAt(i)-'a']++;
            if(isEqual(c1, c2)) 
            {
                al.add(i-n+1);
            }
        }
        return al;
    }
    
    boolean isEqual(int[] c1, int[] c2) {
        for(int i=0;i<26;i++) {
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
    
}
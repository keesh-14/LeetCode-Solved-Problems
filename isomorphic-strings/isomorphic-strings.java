class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), t.charAt(i));
            reverseMap.put(t.charAt(i), s.charAt(i));
        }
        
        String result1 = "";
        String result2 = "";
        for (int i = 0; i < s.length(); i++) {
            result1 += map.get(s.charAt(i));
            result2 += reverseMap.get(t.charAt(i));
        }
        
        return result1.equals(t) && result2.equals(s);
    }
}
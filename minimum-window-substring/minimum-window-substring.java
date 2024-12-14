class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) {
            return "";
        }

    // creating a frequency map for t
    HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();

      for(int i=0;i<t.length();i++) {
        hmap1.put(t.charAt(i), hmap1.getOrDefault(t.charAt(i), 0) + 1);
      }

      int i=0; 
      int j=0;
      int match_count = 0; 
      String str = "";
    
    // creating a frequency map for s
    HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();

      while(true) {
        
        boolean flag1 = false; 
        boolean flag2 = false;
        
        // Accquire characters
        while(i<s.length() && match_count<t.length()){
         hmap2.put(s.charAt(i), hmap2.getOrDefault(s.charAt(i), 0) + 1);

         if(hmap1.containsKey(s.charAt(i)) && hmap1.get(s.charAt(i)) >= hmap2.get(s.charAt(i))){
             match_count++;
         }
         flag1=true;
         i++;
      }

      // Release Characters
      while(j<i && match_count ==t.length()){
          if(str.length() == 0 || s.substring(j,i).length()<str.length()) {
              str = s.substring(j,i);
          }

          if(hmap2.get(s.charAt(j))==1){
            hmap2.remove(s.charAt(j));
          } else {
            hmap2.put(s.charAt(j), hmap2.get(s.charAt(j))-1);
          }

         if(hmap1.getOrDefault(s.charAt(j),0)>hmap2.getOrDefault(s.charAt(j),0))
        {
                    match_count--;
        }

          flag2 = true;
          j++;
      }

      if(flag1 == false && flag2 == false){
         break;
      }
      
    }

    return str;
  }
}
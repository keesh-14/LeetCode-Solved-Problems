class Solution {
    public boolean isNumber(String s) {
        boolean seenDigit = false;
        boolean seenExponent = false; 
        boolean seenDot = false;

        for(int i=0;i<s.length();i++){
           char character = s.charAt(i);
           if(Character.isDigit(character)){
               seenDigit = true;
           } else if(character == '+' || character == '-') {
              if(i>0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') {
                  return false;
              } 
           } else if(character=='e' || character=='E'){
                 if(seenExponent || !seenDigit) {
                    return false;
                 }
                 seenExponent = true;
                 seenDigit = false;
           } else if(character=='.'){
             if(seenDot || seenExponent){
                return false;
             }
             seenDot = true; 
           } else {
              return false;
           }
        }
        return seenDigit;
    }
}
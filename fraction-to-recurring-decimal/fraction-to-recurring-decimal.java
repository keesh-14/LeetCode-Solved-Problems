class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder sb = new StringBuilder();
        
        if (numerator > 0 ^ denominator > 0) sb.append('-');
        
        long n = Math.abs((long)numerator), d = Math.abs((long)denominator),
             q = n/d , r = n%d ;
        sb.append(q);
        
        if (r == 0) return sb.toString();
        else {
            sb.append('.');
            r *= 10;
        }
        
        HashMap<Long,Integer> map = new HashMap<>();
        for (int start = sb.length(); r != 0; start++, r *= 10) {
			//If this dividend has already appeared, stop and add "()"
            int repetition = map.getOrDefault(r,-1);
            if (repetition != -1) {
                sb.insert(repetition, "(");
                sb.append(')');
                break;
            }
			//Store the index to note the start of repition for particular dividend
            map.put(r,start);
            q = r/d;
            r = r%d;
            sb.append(q);
        }
        return sb.toString();
    }
}
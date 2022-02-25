class Solution {
    public int compareVersion(String version1, String version2) {
        String s1[] = version1.split("\\.");
        String s2[] = version2.split("\\.");
        System.out.println(s1.length);
        System.out.println(s2.length);
        int i = 0;
        int j = 0;
        while(i<s1.length && j<s2.length)
        {
            int t1 = Integer.parseInt(s1[i]);
            int t2 = Integer.parseInt(s2[j]);
            System.out.println(t1+" "+t2+" Hello");
            if(t1<t2)
                return -1;
            else if(t1>t2)
                return 1;
           
            i++;
            j++;
        }
        while(i<s1.length)
        {
            int t1 = Integer.parseInt(s1[i]);
            if(t1!=0)
            {
                return 1;
            }
           
            i++;
            
        }
         while(j<s2.length)
        {
            int t2 = Integer.parseInt(s2[j]);
            if(t2!=0)
            {
                return -1;
            }
           
            j++;
            
        }
        return 0;
    }
}
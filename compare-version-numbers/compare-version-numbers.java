class Solution {
    public int check(String s1,String s2)
    {
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        if(n1>n2)
            return 1;
        else if(n1<n2)
            return -1;
        else 
            return 0;
    }
    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
   
        int i=0;
        while(i<v1.length && i<v2.length)
        {
            if(check(v1[i],v2[i])==0)
            {
                i++;
            }
            else
            {
                return check(v1[i],v2[i]);
            }
                
        }
        while(i<v1.length)
        {
             if(check(v1[i],"0")==0)
            {
                i++;
            }
            else
            {
                return check(v1[i],"0");
            }
        }
         while(i<v2.length)
        {
             if(check("0",v2[i])==0)
            {
                i++;
            }
            else
            {
                return check("0",v2[i]);
            }
        }
        
        return 0;
    }
}
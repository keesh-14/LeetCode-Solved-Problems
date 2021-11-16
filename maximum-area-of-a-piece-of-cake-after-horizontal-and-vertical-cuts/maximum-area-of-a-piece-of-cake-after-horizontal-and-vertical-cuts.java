class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        int l1[] = new int[horizontalCuts.length+2];
        int l2[] = new int[verticalCuts.length+2];
        l1[0] = 0;
        l2[0] = 0;
        l1[l1.length-1] = h;
        l2[l2.length-1] = w;
        long max_l=0;
        long max_b = 0;
        int x = 1; 
        for(int i :horizontalCuts)
        {
            l1[x] = i;
            x++;
        }
        x = 1; 
        for(int i : verticalCuts)
        {
            l2[x] = i;
            x++;
        }
        // for(int i:l1)
        // {
        //     System.out.print(i);
        // }
        // System.out.println();
        // for(int i:l2)
        // {
        //     System.out.print(i);
        // }
        Arrays.sort(l1);
        Arrays.sort(l2);
            
        for(int i=1;i<l1.length;i++)
        {
            max_l = Math.max(l1[i]-l1[i-1],max_l);
        }
        for(int i=1;i<l2.length;i++)
        {
            max_b = Math.max(l2[i]-l2[i-1],max_b);
        }
        return (int)((max_l * max_b)%1000000007);
        
    }
}
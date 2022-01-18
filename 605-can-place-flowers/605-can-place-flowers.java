class Solution {
    public boolean canPlaceFlowers(int[] flowered, int n) {
       
        int count=0;
        for(int i=0;i<flowered.length;i++)
        {
            
            if(flowered[i]==1)
                continue;
            
            if( (i>0 && flowered[i-1]==1) || (i<flowered.length-1 && flowered[i+1]==1) )
                continue;
            
            flowered[i] = 1;
            count++;
        }
        
        if(count>=n)
               return true;
        return false;
        
        
    }
}
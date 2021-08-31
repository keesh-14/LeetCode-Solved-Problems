class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0;
        for(i=0;i<gas.length;i++)
        {
            
                int gs = gas[i]-cost[i];
                
                int j = (i+1)%gas.length;
                int flag = 1;
                while(gs>=0)
                {
                    
                    if(flag!=1 && j==i)
                        return i;
                    flag = 0;
                   gs = gs + gas[j] - cost[j];
                   j++;
                   j = j%gas.length;
                }
                  
          }

            return -1;
        
    }
}
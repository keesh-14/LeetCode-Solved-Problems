class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int count =0,maxDist =0,last =-1;
        for(int i=0;i<n;i++){
            if(seats[i]==1){
                //for first scenario
                if(last<0){
                    last = i;
                    maxDist = i;
                    
                }
				//for second scenario
                else {
                    
                    count = (i-last)/2;
                    last = i;
                    maxDist = Math.max(maxDist,count);
                }
                
            }
        }
		//for third scenario
        maxDist = Math.max(maxDist,(n- last -1 ));
        return maxDist;
    }
}
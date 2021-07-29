class Solution {
    public int getNext(int index,boolean isForward,int nums[])
    {
        
        boolean currentIsForward = true;
        
        if(nums[index]<0)
        {
            currentIsForward = false;
        }
        if(currentIsForward!=isForward)
            return -1;
        int n = nums.length;
        int nextIndex = (index + nums[index])%n;
        
        if(nextIndex<0)
            nextIndex = nextIndex + n;
        
        if(nextIndex == index)
            return -1;
        
        return nextIndex;
     }
    public boolean circularArrayLoop(int[] nums) {
        int slow = 0;
        int fast =0;
        boolean isForward = true;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                isForward = false;
                
            }
            else 
            {
                isForward = true;
            }
            // slow = getNext(i,isForward,nums);
            // fast = getNext(i,isForward,nums);
            // if(fast!=-1)
            // {
            //     fast = getNext(fast,isForward,nums);
            // }
            slow = i;
            fast = i;
            do
            {
                slow = getNext(slow,isForward,nums);
                fast = getNext(fast,isForward,nums);
                if(fast!=-1)
                {
                    fast = getNext(fast,isForward,nums);
                }
            }while(slow!=-1 && fast!=-1 && slow!=fast);
            if(slow!=-1 && fast==slow)
            return true;
        }
        return false;
        
    }
}
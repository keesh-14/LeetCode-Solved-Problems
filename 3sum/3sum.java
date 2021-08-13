class Solution {
    public List<List<Integer>> twoSum(int nums[],int low,int high,int x)
    {
        List<Integer> res = new ArrayList<Integer>();
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        while(low<high)
        {
            if(nums[low]+nums[high]==x)
            {
                
                res.add(nums[low]);
                res.add(nums[high]);
                 al.add(new ArrayList<Integer>(res));
                res.clear();
                low++;
                high--;
            
            }
            else if(nums[low]+nums[high]<x)
            {
                low++;
            }
            else 
                high--;
            
        }
        return al;
    }
   public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
      List<List<Integer>> res = new ArrayList<List<Integer>>();
       for(int i=0;i<nums.length;i++)
       {
           List<List<Integer>> al  = twoSum(nums,i+1,nums.length-1,-nums[i]);
           for(List<Integer> c: al)
           {
                c.add(0,nums[i]);
                res.add(c);
           }
        
           
       }
       Set<List<Integer>> hm = new LinkedHashSet<List<Integer>>();
       for(List<Integer> t:res)
       {
           hm.add(t);
       }
       res.clear();
       for(List<Integer> s:hm)
       {
           res.add(s);
       }
       return res;
    }
}
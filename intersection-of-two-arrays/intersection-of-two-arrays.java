class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> s = new HashSet<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            s.add(nums2[i]);
            
        }
        for(int k:hs)
        {
            if(s.contains(k))
                al.add(k);
        }
        int arr[] = new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i] = al.get(i);
        }
        return arr;
    }
    
}
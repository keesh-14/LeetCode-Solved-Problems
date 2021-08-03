class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        st.add(nums2[nums2.length-1]);
        hm.put(nums2[nums2.length-1],-1);
        for(int i=nums2.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && nums2[i]>st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                hm.put(nums2[i],-1);
            }
            else 
            {
                hm.put(nums2[i],st.peek());
            }
            st.add(nums2[i]);
        }
        int j=0;
        int a[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i]))
            {
                a[i] = hm.get(nums1[i]);
            }
            
        }
        return a;
    }
}
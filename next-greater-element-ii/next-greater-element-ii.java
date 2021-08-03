class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int a[] = new int[nums.length];
        Stack<Integer>  st = new Stack<Integer>();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums[i])
            {
                st.pop();
            }
            st.add(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            a[i]=-1;
            else 
            a[i] = st.peek();
            st.add(nums[i]);
        }
        
        return a;
    }
}
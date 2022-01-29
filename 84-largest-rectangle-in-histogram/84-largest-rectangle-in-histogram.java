class Solution {
    public int largestRectangleArea(int[] arr) {
         int rb[] = new int[arr.length];
         int lb[] = new int[arr.length];
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        st1.add(arr.length-1);
        st2.add(0);
        rb[arr.length-1] = arr.length;
        for(int i=arr.length-2;i>=0;i--)
        {
             while(!st1.isEmpty() && arr[st1.peek()]>=arr[i])
            {
                st1.pop(); 
                
            }
            if(st1.isEmpty())
            {
                rb[i] = arr.length;
            }
            else 
            {
                rb[i] = st1.peek();
            }
           st1.add(i);
    
        }
        lb[0] = -1;
        for(int i=1;i<arr.length;i++)
        {
             while(!st2.isEmpty() && arr[st2.peek()]>=arr[i])
            {
                st2.pop(); 
                
            }
            if(st2.isEmpty())
            {
                lb[i] = -1;
            }
            else 
            {
                lb[i] = st2.peek();
            }
           st2.add(i);
    
        }
        int max = 0;
        for(int i=0;i<arr.length;i++)
        {
            int width = rb[i] - lb[i] -1;
            max = Math.max(width*arr[i],max);
            
        }
        return max;
        
    }
}
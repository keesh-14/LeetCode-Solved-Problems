class Solution {
    public int minJumps(int[] arr) {
        HashMap<Integer,List<Integer>> hm = new HashMap<Integer,List<Integer>>();
        for(int i=0;i<arr.length;i++)
        {
            if(i<arr.length-1 && i>0 && arr[i+1]==arr[i] && arr[i-1]==arr[i])
                continue;
           if(hm.containsKey(arr[i]))
           {  
               hm.get(arr[i]).add(i);
            }
           else 
            {
               List<Integer> temp = new ArrayList<Integer>();
               temp.add(i);
               hm.put(arr[i],temp);
            }
            
        }
        boolean visited[] = new boolean[arr.length];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        visited[0] = true;
        int min = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
               int count = q.poll();
            if(count==arr.length-1)
                return min;
            if(count<arr.length-1 && !visited[count+1])
            {
                visited[count+1]=true;
                q.add(count+1);
            }
            if(count>0 && !visited[count-1])
            {
                visited[count-1]=true;
                q.add(count-1);
            }
            for(int j : hm.get(arr[count]))
            {
                if(!visited[j])
                {
                    q.add(j);
                    visited[j] = true;
                }
            }
             
        }
            min++;
            
            
        }
        return -1;
    }
}
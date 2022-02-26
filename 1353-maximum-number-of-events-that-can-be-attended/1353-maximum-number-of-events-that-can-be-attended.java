class Solution {
    public int maxEvents(int[][] events) {
       Arrays.sort(events,(t1,t2) -> t1[0]-t2[0]);
       int day=0;
       int count=0;
       int i=0;
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
       while(i<events.length || !pq.isEmpty())
       {
           if(pq.isEmpty())
           {
               day = events[i][0];
           }
           
           while(i<events.length && events[i][0]==day)
           {
               pq.add(events[i][1]);
               i++;
           }
           pq.poll();
           day++;
           count++;
           while(!pq.isEmpty() && pq.peek()<day)
               pq.poll();
       }
        return count;
    }
}
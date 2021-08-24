class Solution {
    public boolean can(int[] arr, int start,boolean vis[]) {
     
        if(start>=arr.length || start<0)
           return false;
        if(arr[start]==0)
           return true;
        if(vis[start]==true)
            return false;
        else 
            vis[start] = true;
        return can(arr,start+arr[start],vis) || can(arr,start-arr[start],vis);
    }
    public boolean canReach(int[] arr, int start) {
       boolean vis[] = new boolean[arr.length];
        return can(arr,start,vis);
    }
}
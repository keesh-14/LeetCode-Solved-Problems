class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> al = new ArrayList<Integer>();
        for(int i:arr)
        {
            al.add(i);
        }
        
        Collections.sort(al,(n1,n2)->Math.abs(n1-x)-Math.abs(n2-x));
        
        al = al.subList(0,k);
        Collections.sort(al);
        return al;
    }
}
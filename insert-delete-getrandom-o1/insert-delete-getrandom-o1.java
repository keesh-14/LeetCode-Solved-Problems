class RandomizedSet {

    /** Initialize your data structure here. */
   
    HashSet<Integer> hm;
    public RandomizedSet() {
       hm= new HashSet<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hm.contains(val))
            return false;
        else 
        { 
            hm.add(val);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(hm.contains(val))
        {
            hm.remove(val);
            return true;
        }
        else 
            return false;
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Integer[] a = hm.toArray(new Integer[hm.size()]);
        
       Random rand = new Random();
        int r = rand.nextInt(hm.size());
        return a[r];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
class MinStack {
    List<Integer> al;
    List<Integer> min;
    public MinStack() {
        al = new ArrayList<Integer>();
        min = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        al.add(val);
        if(min.size()==0)
            min.add(val);
        
        else if(min.get(min.size()-1)<val)
            min.add(val);
    }
    
    public void pop() {
        if(al.get(al.size()-1)==min.get(min.size()-1))
            min.remove(min.size()-1);
        al.remove(al.size()-1);
        
    }
    
    public int top() {
        return al.get(al.size()-1);
    }
    
    public int getMin() {
      int min = al.get(0);
      for(int i=1;i<al.size();i++)
      {
          min = Math.min(al.get(i),min);
      }
        return min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
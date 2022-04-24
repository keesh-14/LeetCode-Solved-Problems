class MinStack {
    List<Integer> al;
    public MinStack() {
        al = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        al.add(val);
    }
    
    public void pop() {
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
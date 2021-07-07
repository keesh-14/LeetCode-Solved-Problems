class LRUCache {
    class Node
    {
        int key; // for hashMap
        int value; // for doublly Linked List
        Node prev;// for doublly Linked List
        Node next; // for doublly Linked List
    }
    
    HashMap<Integer,Node> hm;
    int capacity;
    Node head;
    Node tail;
    
   
    public LRUCache(int capacity) {
        this.capacity = capacity;
        hm = new HashMap(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        int res = -1;
        Node node = hm.get(key);
        if(node!=null)
        {
            res = node.value;
            remove(node);
            add(node);
        }
        return res;
    }
    
    public void put(int key, int value) {
        Node node = hm.get(key);
        if(node!=null)
        {  
            remove(node);
            node.value = value;
            add(node);
        }
        else 
        {
            if(hm.size()==capacity)
            {
                hm.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.value = value;
            hm.put(key,new_node);
            add(new_node);
        }
    }
    public void add(Node node)
    {
      Node head_next = head.next;
        head.next = node;
        node.prev = head;
        node.next = head_next;
        head_next.prev = node;
    }
    public void remove(Node node)
    {
        Node node_next = node.next;
        Node node_prev = node.prev;
        
        node_prev.next = node_next;
        node_next.prev = node_prev;
    }
    
    
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
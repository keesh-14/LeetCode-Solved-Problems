class Solution {
    class Node {
        int val;
        int freq;
        
        public Node (int val) {
            this.val = val;
            this.freq = 1;
        }
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Node> map = new HashMap<>();
        for (int n: arr) {
            if (!map.containsKey(n)) {
                map.put(n, new Node(n));
            } else {
                map.get(n).freq++;
            }
        }
        
        PriorityQueue<Node> minHeap = new PriorityQueue<>(1, (a, b) -> Integer.compare(a.freq, b.freq));
        for (int n: map.keySet()) {
            minHeap.add(map.get(n));
        }
        
        int i = 0;
        while (i < k) {
            Node current = minHeap.poll();
            current.freq--;
            if (current.freq > 0) minHeap.add(current);
            i++;
        }
        
        int count = 0;
        while (!minHeap.isEmpty()) {
            count++;
            minHeap.poll();
        }
        
        return count;
    }
}
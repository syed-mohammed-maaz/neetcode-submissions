class LRUCache {

    Map<Integer,Integer> map;
    LinkedList<Integer> ll;
    int capacity=0;


    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>(capacity);
        ll=new LinkedList<>();
    }
    
    public int get(int key) {
        
        ll.removeFirstOccurrence(key);
        if(map.containsKey(key)){
            ll.add(key);
            return map.get(key);
        }
        
         return -1;
    }
    
    public void put(int key, int value) {
        
        map.put(key,value);
        ll.removeFirstOccurrence(key);
        ll.add(key);
        while(map.size()>capacity){
              map.remove(ll.removeFirst());
           
        }
    }
   
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
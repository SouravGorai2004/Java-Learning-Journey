
/* 
Concept >>
A LinkedHashMap internally maintains a doubly linked list of its entries.
When you override removeEldestEntry(), the map checks this condition after every put().
If it returns true, the eldest entry (the first node in the linked list) is removed
*/

import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // true → access order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;  // remove eldest when size exceeds capacity
    }
}

class LRUCacheDemo {

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println(cache); // {1=A, 2=B, 3=C}

        cache.get(1);              // access 1 → moves to end
        cache.put(4, "D");         // removes 2 (least recently used)
        System.out.println(cache); // {3=C, 1=A, 4=D}
    }
}




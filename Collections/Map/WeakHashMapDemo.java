import java.util.*;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        Integer key1 = new Integer(1000); // strong reference
        Integer key2 = new Integer(2000); // strong reference

        map.put(key1, "A");
        map.put(key2, "B");

        System.out.println("Before GC: " + map);

        key1 = null;  // key1 is no longer strongly referenced
        System.gc();  // suggest garbage collection

        // Wait a little for GC to remove weakly referenced keys
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        System.out.println("After GC: " + map);
    }
}

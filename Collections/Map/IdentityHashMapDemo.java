
import java.util.*;

public class IdentityHashMapDemo {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> identityhashmap = new IdentityHashMap<>();

        String key1 = new String("hello");
        String key2 = new String("hello"); // different object

        hashMap.put(key1, "A"); //key1.hashCode() >> hashcode1 >> index1
        hashMap.put(key2, "B"); //key1.hashCode() >> hashcode1 >> index1

        identityhashmap.put(key1, "A"); //System.identityHashCode(key1) >> hashcode2 >> index2
        identityhashmap.put(key2, "B"); //System.identityHashCode(key2) >> hashcode3 >> index3

        System.out.println("The size of HashMap is : " + hashMap.size());
        System.out.println("HASHMAP : " + hashMap);
        
        System.out.println("----------------------------------------------");

        
        System.out.println("The size of IdentityHashMap is : " + identityhashmap.size());
        System.out.println("IDENTITYHASHMAP : " + identityhashmap);
    }
}

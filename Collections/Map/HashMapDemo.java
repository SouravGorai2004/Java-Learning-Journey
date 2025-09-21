import java.util.*;
class HashMapDemo{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Sourav");
        map.put(2,"Rahul");
        map.put(3,"Bikram");
        System.out.println(map);
        for(Integer key : map.keySet()){
            System.out.println("Key : "+key+" Value : "+map.get(key));
        }
        Collection<String>list = map.values();
        System.out.println(list);


    }
}
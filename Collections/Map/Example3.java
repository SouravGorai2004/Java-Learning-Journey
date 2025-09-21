import java.util.*;
public class Example3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");


        Map<Integer,String> map2 = new LinkedHashMap<>(map);
        for(Map.Entry<Integer,String> entry : map2.entrySet()){
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
        }


    }
}

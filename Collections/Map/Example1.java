import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(1,"Sourav");
        // String num1 =map.put(2,"Rahul");
        // String num2 =map.put(1,"Sayan");
        // System.out.println(map); //{1=Sayan,2=Rahul}
        // System.out.println(num1); //null
        // System.out.println(num2); //Sourav
        Integer num1 = map.put(1,2);
        Integer num=map.remove(1);
        System.out.println(num);

    }
}

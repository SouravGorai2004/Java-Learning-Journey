import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> arr = new CopyOnWriteArrayList(Arrays.asList("Sourav", "Sayan", "Sujit"));

        System.out.println("Before loop the list is : "+arr);

        for (String name : arr) {
            System.out.println(name);
            if (name.equals("Sayan")) {
                arr.add(arr.indexOf("Sayan"),"Rahul");
            }
        }

        System.out.println("After loop the list is : "+arr);

    }
}
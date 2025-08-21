
import java.util.ArrayList;
public class Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(i);
        }

        arr.stream()
            .dropWhile(num->num%2==0)
            .forEach(System.out::println);

    }
}

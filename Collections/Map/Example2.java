import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name : ");
            map.put(i, sc.nextLine());
        }

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        System.out.println("The set view of map is : " + set);
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println("Roll : "+entry.getKey()+" Name : "+entry.getValue());
        }

    }

}

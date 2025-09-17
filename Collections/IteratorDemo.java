import java.util.*;
class IteratorDemo{
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Sourav");
        list.add("Sayan");
        list.add("Sujit");
        Iterator<String> itr = list.iterator();
        
        list.add(4,"Rahul");
        for(String s:list)
            System.out.println(s);
    }
}
// package Streams;
import java.util.ArrayList;
import java.util.List;

public class PipelineDemo {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("Sourav");
        ls.add("Sayan");
        ls.add("Rahul");
        ls.add("Sham");
        ls.add("Sayan");
        ls.add("Sujit");
        ls.add("Nandan");

        ls.stream()
                .filter(s -> {
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Called Filter for : " + s);
                    return s.startsWith("S");
                })
                .filter(l -> {
                    System.out.println("Check the lenght is gretter than 4 or not using 2nd filter : "+ l);
                    return l.length() > 4;
                })
                .map(str->{System.out.println("Map is called for : "+str);
                return str.toUpperCase();

                })
                .forEach(str->System.out.println("ForEach is called for : "+str));
    }
}

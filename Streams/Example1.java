package Streams;

import java.util.stream.Stream;
import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        arr.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
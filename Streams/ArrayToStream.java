package Streams;

import java.util.stream.Stream;

class ArrayToStream {
    public static void main(String argv[]) {
        Stream.of("Asansol", "Domohani", "Kalla", "Kulti", "Asam", "Anandapur")
                .filter(x -> x.startsWith("A"))
                .forEach(System.out::println);

    }
}
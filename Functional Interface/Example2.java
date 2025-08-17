import java.util.function.Supplier;

public class Example2 {
    public static void main (String argv[]){
        String str = "hello";
        Supplier<Integer> lengthSupplier = str::length;
        System.out.println(lengthSupplier.get());

    }
}

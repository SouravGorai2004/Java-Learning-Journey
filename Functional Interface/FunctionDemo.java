import java.util.function.Function;
import java.util.function.Predicate;


public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> fn = x -> x.length();
        System.out.println("The length of the String is : "+ fn.apply("Hello"));

        Predicate<Integer> isOdd = a -> a % 2 != 0;
        Function<Integer, Integer> fn2 = x -> {
            if (isOdd.test(x)) {
                return x + 1;
            }
            return x;
        };
        System.out.println("The new number is : "+fn2.apply(5));
    }

}

import java.util.function.BiPredicate;
import java.util.function.Predicate;

class PredicateDemo {
    public static void main(String[] args) {
        Integer x = 10;
        Integer a = 12;
        Integer b = 15;
        Predicate<Integer> isEven = n -> n % 2 == 0;
        BiPredicate<Integer, Integer> isBothEven = (p, q) -> isEven.test(p) && isEven.test(q);
        System.out.println(x+" is even ?? "+isEven.test(x));
        System.out.println(a+" AND "+b+" BOTH IS EVEN ?? "+isBothEven.test(a,b));
    }
}
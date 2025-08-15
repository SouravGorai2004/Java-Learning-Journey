import java.util.function.Function;
public class Example1 {
    static int square(int x){
        System.out.printf("The square of ");
        System.out.printf(x+" is :");
        return x*x;
    }
    public static void main(String[] args) {
        Function <Integer, Integer > fn = x -> square(x);
        System.out.println(fn.apply(5));
        Function <Integer, Integer> fn2 = Example1 :: square;
        System.out.println(fn2.apply(10));

    }
    
}

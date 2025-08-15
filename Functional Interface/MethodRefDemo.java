import java.util.function.Function;
public class MethodRefDemo {
    public static void main(String[] args) {
        //Using Lambda Exp.
        Function<String,Integer> fn = str -> str.length();
        System.out.println(fn.apply("Hello World !"));

        //Using Method Ref.
        Function<String,Integer> fn2= String :: length;
        System.out.println(fn2.apply("Hey I am Sourav..."));
        
    }
    
}

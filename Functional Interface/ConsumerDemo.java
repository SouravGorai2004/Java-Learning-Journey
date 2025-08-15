import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consume = x -> System.out.println(x);
        consume.accept("Hello world");
        consume.accept("Consumer basically consume (take a parameter)and perform some taks not return anything");
    }
    
}

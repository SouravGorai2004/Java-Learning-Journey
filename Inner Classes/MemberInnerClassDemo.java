class Car {
    private String brand = "Tesla";

    // Member Inner Class
    class Engine {
        void start() {
            System.out.println(brand + " Engine is starting...");
        }
    }
}

public class MemberInnerClassDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();  // needs outer object
        engine.start();
    }
}

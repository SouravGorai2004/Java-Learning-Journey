class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

interface Greet {
    void sayHello();
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        // 1. Anonymous inner class extending a class
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks...");
            }
        };
        dog.sound();

        // 2. Anonymous inner class implementing an interface
        Greet g = new Greet() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        g.sayHello();
    }
}

class Outer {
    static int data = 100;

    // Static Nested Class
    static class Nested {
        void show() {
            System.out.println("Accessing static data: " + data);
        }
    }
}
class StaticNestedInnerClassDemo {
    public static void main(String[] args) {
        // No need to create Outer object
        Outer.Nested obj = new Outer.Nested();
        obj.show();
    }
}

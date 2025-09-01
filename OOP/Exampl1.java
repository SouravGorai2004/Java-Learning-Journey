
class A {
    void method1() {
        System.out.println("From class A, method 1");
    }

    static void staticMethod() {
        System.out.println("From class A , Static method");
    }
}

class B extends A {
    void method2() {
        System.out.println("From class B , method 2");
    }

    @Override
    void method1() {
        System.out.println("From class B , method 1");
    }
}

class C extends B {
    @Override
    void method1() {
        System.out.println("From class C , method 1");
    }

    void method3() {
        System.out.println("From class C , method 3");
    }

    static void staticMethod() {
        System.out.println("From class C , Static method");
    }
}

public class Exampl1 {
    public static void main(String[] args) {
        A obj1 = new C();
        B obj2 = new C();
        C obj3 = new C();

        System.out.println("------------------------------");
        obj1.method1(); // class C method 1
        obj2.method1(); // class C , method 1
        obj2.method2(); // class B , method 2
        obj3.method1(); // class C , method 1
        obj3.method2(); // class B, method 2
        obj3.method3(); // class C, method 3
        System.out.println("------------------------------");

        obj1.staticMethod();   // We should write  A.staticMethod()
        obj3.staticMethod();   // We should write  C.staticMethod()
        B.staticMethod();

    }

}

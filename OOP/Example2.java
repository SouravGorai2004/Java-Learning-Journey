
class A {
    String name;
    int num;

    A(String name, int num) {
        this.name = name;
        this.num = num;
    }
}

class B extends A {
    private int age;
    private int marks;
    String cls;
    String section;

    B(String name, int num, int age, int marks, String cls, String section) {

        this(name, num, cls, section);

        this.age = age;
        this.marks = marks;
    }

    B(String name, int num, String cls, String section) {
        super(name, num);
        this.cls = cls;
        this.section = section;
    }

    int getAge() {
        return age;
    }

    int getMarks() {
        return marks;
    }
}

public class Example2 {
    public static void main(String[] args) {
        B obj = new B("Sourav", 993346, 21, 100,"12","B");
        System.out.println("Name is : " + obj.name);
        System.out.println("Number is : " + obj.num);
        System.out.println("Age is : " + obj.getAge());
        System.out.println("Marks is : " + obj.getMarks());
        System.out.println("Class is : " + obj.cls);
        System.out.println("Section is : " + obj.section);

    }

}

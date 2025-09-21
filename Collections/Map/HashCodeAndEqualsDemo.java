import java.util.*;

class Student {
    int age;
    String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name : " + this.name + " Age : " + this.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object s) {
        if (this == s)
            return true;
        if (!(s instanceof Student))
            return false;
        Student st = (Student) s;
        return this.age == st.age && this.name == st.name;
    }
}

public class HashCodeAndEqualsDemo {
    public static void main(String[] args) {
        Map<Student, Integer> student = new HashMap<>();
        Student s1 = new Student("Sourav", 18);
        Student s2 = new Student("Bikram", 20);
        Student s3 = new Student("Sourav", 18);

        student.put(s1, 98);
        student.put(s2, 95);
        student.put(s3, 98);
        System.out.println(student);
        System.out.println("S1 HASHCODE : " + s1.hashCode());
        System.out.println("S2 HASHCODE : " + s2.hashCode());
        System.out.println("S3 HASHCODE : " + s3.hashCode());

        System.out.println(new String("Hello").equals(new String("Hello")));
        System.out.println(s1.equals(s3));
    }
}

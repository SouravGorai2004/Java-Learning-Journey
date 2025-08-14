class Student {
    String name;
    int age;


    Student(){
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

class ShallowCopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;

        Student s2 = new Student(s1); // Copy Constructor
        System.out.println(s2.name + " - " + s2.age);
    }
}

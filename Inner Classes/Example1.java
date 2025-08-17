class Student {
    private String name;
    private String roll;
    private int marks;

    Student(String name, String roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void details() {
        class Check_knowldge {
            void isBrilient() {
                if (marks > 65)
                    System.out.println(name + " is a brilient student..");
                else
                    System.out.println(name + " is not a brilient student...");

            }

            void display() {
                System.out.println("Name : " + name + " | Roll : " + roll + " | Makrs : " + marks);
            }
        }
        Check_knowldge ck = new Check_knowldge();
        ck.display();
        ck.isBrilient();
        System.out.println("---------------------------------------------");

    }

}

class Example1 {
    public static void main(String[] args) {
        Student st = new Student("Sourav", "10A", 90);
        Student st2 = new Student("Sayan", "12C", 55);
        st.details();
        st2.details();
    }
}

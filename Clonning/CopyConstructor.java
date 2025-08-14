class Address {
    String vill;

    Address(String vill) {
        this.vill = vill;
    }

}

class Student {
    public String name;
    public int roll;
    public Address add;

    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
        this.add=new Address(s.add.vill);
    }

    Student(String name, int roll, Address add) {
        this.name = name;
        this.roll = roll;
        this.add = add;
    }

    public String toString() {
        return "NAME : " + this.name + ", ROLL NO : " + this.roll + " Address : " + this.add.vill;
    }
}

class CopyConstructor {
    public static void main(String[] args) {
        Address add1 = new Address("Bhanora");
        Student s1 = new Student("Sourav", 1,add1);
        Student s2 = new Student(s1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("------------AFTER MODIFICATION ------------");
        s2.name = "Sujit";
        s2.roll = 2;
        s2.add.vill="Asansol";
        System.out.println(s1);
        System.out.println(s2);
    }

}

import java.io.*;

class Address implements Serializable {
    String add;

    Address(String add) {
        System.out.println("Address constructor is called...");
        this.add = add;
    }
}

class Student implements Serializable {
    String name;
    transient int age;
    Address address;
    static String collegeName = "AEC";

    Student(String name, int age, Address address) {
        System.out.println("Student constructor is called...");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void getDetails(String msg) {
        System.out.println("------ " + msg + " ------");
        System.out.println("Name     : " + this.name);
        System.out.println("Age      : " + this.age);
        System.out.println("Address  : " + this.address.add);
        System.out.println("College  : " + Student.collegeName);
        System.out.println("--------------------------\n");
    }
}

class ObjectGraphDemo {
    public static void main(String[] args) {

        Address address = new Address("Asansol");
        Student st = new Student("Sourav", 18, address);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
            oos.writeObject(st);
            oos.close();
            System.out.println("\n>>> Serialization done!\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        st.name = "Sayan";
        Student.collegeName = "IITM";
        st.getDetails("Original object AFTER changes (post-serialization)");

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
            Student st2 = (Student) ois.readObject();
            ois.close();

            System.out.println("\n>>> Deserialization done!\n");
            st2.getDetails("Deserialized object (note: constructor not called, state restored)");

        } catch (Exception e) {
            e.printStackTrace();
        }

        st.getDetails("Original object at the end");
    }
}

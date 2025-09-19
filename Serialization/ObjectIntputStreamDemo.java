import java.io.FileInputStream;
import java.io.IOException;
// import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ObjectIntputStreamDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream("data.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s1=(Student)ois.readObject();
        System.out.println(s1.name);
        ois.close();

    }
}

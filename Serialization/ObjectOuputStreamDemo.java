import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    Student(int id , String name){
        this.id = id;
        this.name= name;
    }

}
class ObjectOuputStreamDemo{
    public static void main(String[] args) {
        Student st = new Student(1,"Sourav");
        try{
            
            FileOutputStream fos = new FileOutputStream("data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            fos.close();
            oos.close();
        }catch(IOException e){
            e.printStackTrace();

        }
        st.name="Rahul";
        System.out.println("Student name after push into file is : "+st.name);
        
    }

}

public class Example1 {
    public static void main(String[] args) {
        String s1 ="HELLO";
        String s2 = "HELLO";
        String s3 = new String ("WORLD");
        String s4 = new String ("WORLD");
        System.out.println(s1==s2);                        //true
        System.out.println(s1.equals(s2));                  //true
        System.out.println(s3==s4);                         //false
        System.out.println(s3.equals(s4));                  //true



    }
}

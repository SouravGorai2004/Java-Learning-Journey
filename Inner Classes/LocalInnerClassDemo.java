class Outer {
    private String outerData = "Outer Instance Data";
    static String age;

    void outerMethod() {
        int num = 10; // effectively final
        
        // Local Inner Class
        final class LocalInner {
            private String name;
            LocalInner(String name){
                this.name=name;

            }
            void show() {
                System.out.println("Accessing outer field: " + outerData);
                System.out.println("Accessing local variable: " + num);
                System.out.println(age);
            }
            void display(){
            System.out.println("Name : "+this.name);
            }
        }

        LocalInner local = new LocalInner("Sourav");
        local.show();
        local.display();
    }
}

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerMethod();
        
    }
}

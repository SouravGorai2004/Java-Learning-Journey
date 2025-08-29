public class Example1 extends Thread {
    public void run(){
        System.out.println("From Run Method..");
    }
    public static void main(String[] args) {
        System.out.println("First Statemenet from Main method..");
        Example1 run = new Example1();
        run.start();
        System.out.println("Hello from main");
        
    }
    
}

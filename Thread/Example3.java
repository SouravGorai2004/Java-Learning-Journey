class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Calling : " + Thread.currentThread().getName());
    }
    MyThread(String name){
        super(name);
    }
}

public class Example3 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("Sourav");
        t1.start();
        // t1.join();
        // Example3 ex = new Example3();
        // ex.join();
        System.out.println(Thread.currentThread().getName());
    
    }

}

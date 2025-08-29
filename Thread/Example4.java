class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Is Running .... ");

    }
}


public class Example4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(),"NEW THREAD");
        t1.start();
    }
    
}

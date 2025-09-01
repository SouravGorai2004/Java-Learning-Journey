class MyThread extends Thread {
    private static int counter = 0;

    static synchronized void setCounter() {
        counter++;
    }

    static int getcounter() {
        return counter;
    }

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            setCounter();
        }
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(MyThread.getcounter());


    }

}

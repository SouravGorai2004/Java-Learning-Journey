class Demo extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Demo();
        t.start();
        t.join();
        System.out.println("Hello from main");

    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("CHEF")) {

            System.out.println(Thread.currentThread().getName() + " : is starting cooking... ");
            try{
                System.out.println("Cooking in Process...");
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Cooking is complete .. Ready to Serve..");

        } else if (Thread.currentThread().getName().equals("WAITER")) {

            System.out.println(Thread.currentThread().getName() + " : is searving... ");
             try{
                System.out.println("Serving in Process...");
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Serveing is Done,Ready to Clean...");

        } else if (Thread.currentThread().getName().equals("CLEANER")) {
            System.out.println(Thread.currentThread().getName() + " : is cleaning... ");
             try{
                System.out.println("Cleaning in Process...");
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Cleaning complete ..");
        }
    }

}

public class Practice1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Practice1 main = new Practice1();
        main.setName("Program");
        MyThread runnable = new MyThread();
        Thread chef = new Thread(runnable,"CHEF");
        Thread waiter = new Thread(runnable,"WAITER");
        Thread cleaner = new Thread(runnable,"CLEANER");
        chef.start();
        chef.join();
        waiter.start();
        waiter.join();
        cleaner.start();
        cleaner.join();
        System.out.println(main.getName()+" :Execution End .....");





        
    }
}

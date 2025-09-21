class ATM {
    synchronized void withdraw(String name) {
        System.out.println(name + " is trying to withdraw ...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println(name + " is completed withdral...");

    }

    void deposit(String name) {
        System.out.println(name + " is trying to deposit ...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println(name + " is completed deposit...");

    }
}

public class Example6 {
    public static void main(String[] args) {
        ATM atm1 = new ATM();
        ATM atm2 = new ATM();

        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                atm1.withdraw("Sourav");
            }
        };
        Runnable r2 = () -> atm2.withdraw("Sayan"); // shorten from of above implementation using Lambda expression...
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread (r2);
        t1.start();
        t2.start();

        
    }

}

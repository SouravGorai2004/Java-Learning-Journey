import java.util.concurrent.locks.*;

class BankAccount {
    private final Lock lock = new ReentrantLock();
    

    void withdraw(String user) {
        System.out.println(user + " attemplting to withdraw money...");
        lock.lock();
        System.out.println(user + " acquire the lock !!");
        try {
            System.out.println("withdrawn is processing for " + user);
            Thread.sleep(3000);
            System.out.println(user + " withdrawl successfull...");
        } catch (InterruptedException e) {

        } finally {
            System.out.println(user + " release the lock...");
            lock.unlock();
        }
    }

}

public class ReentrantLockDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        BankAccount acc2 = new BankAccount();
        Runnable r1 = () -> acc.withdraw("Sourav");
        Runnable r2 = () -> acc2.withdraw("Sujit");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }

}

import java.util.concurrent.locks.*;

class Library {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock readlock = lock.readLock();
    private final ReentrantReadWriteLock.WriteLock writelock = lock.writeLock();

    void readBook(String user) {
        System.out.println(user + " tries to read book");
        if (readlock.tryLock()) {
            try {
                System.out.println(user + " reading book");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println(user + "completed reading...");
                readlock.unlock();
            }
        } else {
            System.out.println("Someone Write a book , please wait...");
        }

    }

    void writeBook(String writer) {
        System.out.println(writer + " tries to write a book");
        if (writelock.tryLock()) {
            try {
                System.out.println(writer + "Write a book");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(writer + " Completed Writing...");
                writelock.unlock();
            }
        } else {
            System.out.println("Please wait , someone read a book");
        }

    }

}

public class ReadWriteLock {

    public static void main(String[] args) {
        Library lb = new Library();
        Thread reader1 = new Thread(()->lb.readBook("Sourav"));
        Thread reader2 = new Thread(()->lb.readBook("Sujit"));
        Thread reader3 = new Thread(()->lb.readBook("Sayan"));
        
        Thread writer1 = new Thread(()->lb.writeBook("Ram"));
        Thread writer2 = new Thread(()->lb.writeBook("Shyam"));
        Thread writer3 = new Thread(()->lb.writeBook("Alise"));
        reader1.start();
        reader2.start();
        writer1.start();
        writer2.start();
        reader3.start();
        writer3.start();


    }
}

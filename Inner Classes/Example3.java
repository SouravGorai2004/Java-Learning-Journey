public class Example3 {
    public static void main(String[] args) {
        Runnable r = ()->{System.out.println("Hey its from another Thread...");};
        new Thread(r).start();
    }
}

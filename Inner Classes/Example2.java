public class Example2 {
    public static void main(String[] args) {
        Runnable t1 = new Runnable (){
            @Override 
            public void run(){
                System.out.println("New Thread..");
            }
        };
        Thread thread = new Thread(t1);
        thread.start();
    }
}

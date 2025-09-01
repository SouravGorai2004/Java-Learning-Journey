class MyThread extends Thread{
    @Override
    public void run(){
        int i=1;
        while(i<10){
            System.out.println(getName());
            try{
                
                Thread.yield();
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            i++;
        }
    }
    MyThread(String name){
        super(name);
    }
}
class Example5 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread - 1");
        MyThread t2 = new MyThread("Thread - 2");
        MyThread t3 = new MyThread("Thread - 3");
        t1.setPriority(4);
        t2.setPriority(8);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
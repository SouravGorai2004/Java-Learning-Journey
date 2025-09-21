class SharedResource{
    private int chapati;
    private boolean available;
    
    public synchronized void produce(int value){
        while(available){
            try{
                wait();

            }catch(InterruptedException e ){
                e.printStackTrace();
            }
        }
        chapati = value;
        System.out.println("Producer made chapati : "+value);
        available = true;
        notify();
    }

    public synchronized void consume(){
        while(!available){
            try{
                wait();
            }catch(InterruptedException e ){
                e.printStackTrace();
            }
        }

        System.out.println("consumer ate chapate : "+chapati);
        available=false;
        notify();
    }
}
class Producer extends Thread{
    private SharedResource resource;

    Producer(SharedResource r ){
        this.resource=r;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            resource.produce(i);
        }
    }
}
class Consumer extends Thread{
    private SharedResource resource;
    Consumer(SharedResource r){
        this.resource=r;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            resource.consume();
        }
    }
}
class ThreadCommunication{
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);
        p.start();
        c.start();
        p.join();
        c.join();
        System.out.println("Programe Ends...");
    }
}
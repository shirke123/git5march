package Multithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("In t1 is thread");
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t2 thread");
            }
        });
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }
}

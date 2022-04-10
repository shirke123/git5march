package Multithreading;

public class Multithreading extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("hii");
        }
    }

    public static void main(String[] args) {
        Multithreading obj=new Multithreading();
        obj.start();
    }
}
class Multi implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Multi obj=new Multi();
        Thread t1=new Thread(obj);
        t1.start();
        }
    }


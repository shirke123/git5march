package Multithreading;

import kotlin.jvm.Synchronized;

import java.util.Scanner;

public class
DeadLock {
    public static void main(String[] args) {
        String scanner="Scanner";
        String Printer="Printer";

        Thread desktop=new Thread(()->{
            synchronized (scanner){
                System.out.println(Thread.currentThread().getName()+"locked"+scanner);
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            synchronized (Printer){
                System.out.println(Thread.currentThread().getName()+"Locked"+Printer);

            }
        });


        Thread Laptop=new Thread(()->{
            synchronized (scanner){
                System.out.println(Thread.currentThread().getName()+"locked"+scanner);
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (Printer){
                    System.out.println(Thread.currentThread().getName()+"locked"+Printer);
                }
            }
        });
        desktop.setName("Desktop");
        Laptop.setName("Laptop");
        desktop.start();
        Laptop.start();

    }
}

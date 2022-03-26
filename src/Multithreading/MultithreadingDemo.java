package Multithreading;

public class MultithreadingDemo extends  Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("hii");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MultithreadingDemo obj=new MultithreadingDemo();
        obj.start();
    }
    }

  /*class MultiDemo implements Runnable{

    public  void run(){
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<5;i++){
            System.out.println("hii");
        }
    }

     public static void main(String[] args) {
         MultiDemo  obj=new MultiDemo();
         Thread t1=new Thread(obj);
         t1.start();
     }*/

class MultiDemo{
      public static void main(String[] args) {
          Thread t1=new Thread(() ->{
          System.out.println(Thread.currentThread().getName());
          for(int i=0;i<5;i++){
              System.out.println("hii");
          }
      });
 t1.start();
      }
  }

package Multithreading;

public class HiiDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MultithreadingDemo obj=new MultithreadingDemo();
        obj.start();
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<5;i++){
            System.out.println("hii");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Hello {
    public static void main(String[] args)throws InterruptedException {

        Thread hii=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("hii");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        Thread hello=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("hii");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        hii.start();
        hello.start();

        hii.join();
        hello.join();
        System.out.println("Bye");
    }
}
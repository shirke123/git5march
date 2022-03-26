package Multithreading;

public class HiDemo extends Thread {
    public static void main(String[] args) {


        Thread hii = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hii");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
//hii.start();
//
//Thread hello=new Thread(()->{
//    for(int i=0;i<5;i++){
//        System.out.println("hello");
//        }
//    try {
//        Thread.sleep(1000);
//    }catch (InterruptedException e){
//        e.printStackTrace();
//    }
//        });
//hello.start();
//}

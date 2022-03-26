package practise;

public class Multitasking extends Thread{
    @Override
    public void run() {
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.println("hii");
        }
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Multitasking obj1=new Multitasking();
        Multitasking obj2=new Multitasking();
        obj1.start();
        obj2.start();
    }
}


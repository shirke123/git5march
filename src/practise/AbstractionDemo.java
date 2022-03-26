package practise;

public abstract class AbstractionDemo {

    public abstract void exersize(); //abstract method

    public void play() {//non-abstract method
        System.out.println("exersize");
    }

    public void show() {
        System.out.println("show ");
    }

    class Bike extends AbstractionDemo {

    public void run() {
        System.out.println("running");
    }

        public void exersize() {
            System.out.println("xersixe");
        }


        }

//    class  Sports extends  Bike{
//        public  void play(){
//            System.out.println("playing cricket");
//        }
//        public  void  exercize(){
//            System.out.println("erxersize");
//        }
//    }
    public static void main(String[] args) {
//        Bike obj=new Bike();
//        obj.play();
//       // obj.exercize();
    }
}



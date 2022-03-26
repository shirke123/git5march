package practise;
//method overriding /run time polymorphism

public class Vehical {
    void run() {
        System.out.println("Vechicle running");
    }

}
    class Bike1 extends Vehical {
        public void run() {
            System.out.println("bike running");
        }
    }

    class Bike2 extends Bike1 {
        public void run() {
            System.out.println("bike2 running");
        }


        public static void main(String[] args) {
            Bike2 obj = new Bike2();
            obj.run();

        }
    }

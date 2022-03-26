package superdemo;
/**
 super keywords:>
  1. it refers immediate parent class instance class.
  2. it refers immediate parent class method.
  3. it refers immediate parent class constructor.
 */

public class SuperA {
    int i = 2;


    public void show() {
        System.out.println("in a superA");
    }

    public SuperA() {
        System.out.println("in a superA a constructor");

    }

    public SuperA(int i) {
        System.out.println("in a superA a parameter constructor");

    }
}
    class SuperB extends SuperA{
        int i = 4;

        public void show()
        {
            System.out.println("in a super B->"+super.i);
        }

        public SuperB() {
            super();
            System.out.println("in a superB constructor");

        }
        public SuperB(int i) {
            super(5);
            System.out.println("in a superB parameter constructor");

        }
        public  void display()
        {
           super.show();
        }
        public  static  void main(String[]args){
            SuperB obj=new SuperB(7);
              obj.display();
        }
    }



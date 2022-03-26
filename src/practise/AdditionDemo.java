package practise;

public class AdditionDemo {
    int number1;
    int number2;
    float result;

    public  void show(){
        System.out.println("show in result");
    }

    public  void  add() {
            System.out.println("addition"+number1+number2);
        }

    public  void substraction(){
            System.out.println("sub");
        }

        public static void main(String[] args) {
        AdditionDemo additionDemo=new AdditionDemo();
        additionDemo.add();
    }
}

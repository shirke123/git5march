package practise;

public class Test1 {
    int num1,num2;

    public  void show(){
        System.out.println("n the show");
    }
    class Test2 extends  Test1{
        int num3;

        public  void setNum3()
        {
            System.out.println("in the show");
        }

        public static void main(String[] args) {
            Test1 obj=new Test1();
             obj.show();
             obj.show();

        }
    }
}


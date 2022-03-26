package practise;

public class Calculator {
    int num1,num2;
    public double  Addition(int num1,int num2) {
        return num1 + num2;
    }
    public double Sub(int num1,int num2) {
        return num1 + num2;
    }
    public  double div(int num1,int num2) {
        return num1 + num2;
    }
    public double mul(int num1,int num2){
        return  num1+num2;
    }

    public static void main(String[] args) {
       Calculator cal=new Calculator();
        System.out.println(cal.Addition(2,7));
        System.out.println(cal.Sub(6,8));
        System.out.println(cal.div(3,5));
        System.out.println(cal.mul(5,5));


    }
}

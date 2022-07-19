package java8;

public class MethodRefToStatic {
    public static void main(String[] args) {

        //method reference to the static method.
        MyInterface5 myInterface5=MethodRefToStatic::display;
        myInterface5.show();
    }

    static   void display(){
        System.out.println("in display");
    }
}
interface MyInterface5{
    void show();
}

package exceptionhandling;

public class MethodOverriding
{
    public void show()throws  Exception{
        System.out.println("n show");
    }
}
class ChildClass extends MethodOverriding {
    public static void main(String[] args) throws Exception {
        ChildClass obj = new ChildClass();
        obj.show();
    }

    public void show() throws  ArithmeticException {

    }
}
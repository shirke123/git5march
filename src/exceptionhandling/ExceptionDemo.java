package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        try {
            int k = i/j; //critical exception
            System.out.println("k");
        }
        catch(Exception e)//handle  exception
        {
            System.out.println(e.getMessage());
        }
        System.out.println("hii"); //normal statement
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");

    }
}

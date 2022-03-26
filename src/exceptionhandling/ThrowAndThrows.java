package exceptionhandling;

public class ThrowAndThrows {
    public void show() throws ArithmeticException {
        throw new ArithmeticException("");
    }

    public static void main(String[] args) throws ArithmeticException, Exception {
        int age = 15;

        if (age >= 18);
        {
            System.out.println(" we can vote");
        }
       // else{
                throw new ArithmeticException("we can not vote");
            }
           //  System.out.println("hii");
           // System.out.println("hii");
        }
    //}

/**
             throw                                               Throws
   1. throw is used to throw exception.              1. Throws is used to declare exception.
   2. throw is used within method.                   2. throws is used with method signature.
   3. we can throw only  one exception at a time.    3. we can declare multiple exception at a time.
   4. throw is used with new instance.               4. throws is used with class instance.
 */



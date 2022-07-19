package basic;

public class PSVMDemo {


    /**
     * 1. public:- access modifier and specifier and jvm access the main method from outside.
     * 2. static:- without creating of object of class of jvm.
     * 3. void:- does not return anything.
     * 4. main:- Identifier and Staring points of the program.
     * 5. String:- command line arguments or parameter string of array.
     * 6. arg:-   variable array.
     * 7. []:-array.
     */

    public static void main(String[] test) {
        System.out.println(test[0]);
        System.out.println(test[1]);
    }

    public static void main(int[] test) {
        System.out.println(test[0]);
        System.out.println(test[1]);
        //return "hello";
    }
}
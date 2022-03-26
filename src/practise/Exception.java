package practise;

import java.io.IOException;

public class Exception  {
//    public static void main(String[] args) {
//        int i=0,j=2;
//        try {
//            int k= i/j;
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("hii");
//    }
//}
public static void main(String[] args) {
    /*try {
    int data=100/0;
    }catch (ArithmeticException e){
        System.out.println(e);
        e.printStackTrace();
    }
    System.out.println("rest of the code");
*/
//    int i=0,j=2;
//    try {
//        int k=i/j;
//    }catch (ArithmeticException e){
//        System.out.println(e);
//    }
//    System.out.println("hiii");


/*try {
    int data=100/0;

}catch (ArrayIndexOutOfBoundsException e){
    System.out.println(e);
}
    System.out.println("hii");
    System.out.println("hiii");*/



    try {
        int arr[]={12,34,21,13,3,4,1};
        arr [5]=30/3;

    }catch (ArithmeticException e){
        System.out.println("arithmatic exception ");

    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("arrayindexoutofboundindex occured");

    }catch (NullPointerException e){
        System.out.println("null exception occured");

    }catch (java.lang.Exception e){
        System.out.println("exception occurs");
    }


    System.out.println("hii");






}
}


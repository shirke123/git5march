package practise;

public class EvenOrOdd {
    public static void main(String[] args) {


/**
 even numbers or odd numbers 1 to 100 display
 */
//        System.out.println("even numbers");
//        int[] a = {1, 10, 45, 79, 34, 89, 44, 52,100};
//        int num=100;
//        for (int i = 1; i <num; i++)
//            if (a[i] % 2 == 0) {
//                System.out.println(a[i]);
//            }
//        System.out.println();
//
//        System.out.println("odd numbers");
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 != 0) {
//                System.out.println(a[i]);
//            }
//        }


/**even odd numbers*/

        int[] arr1 = {101, 102, 45, 79, 34, 89, 44, 52};
        System.out.println("even numbers");

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
            }
        System.out.println();

        System.out.println("odd numbers");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                System.out.println(arr1[i]);
            }
        }

        /** display the number is negative positive or zero

        /*System.out.println();
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        num=scanner.nextInt();
        if(num>0){
            System.out.println("number is positive");
        } else if(num<0){
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is zero");
        }


    }
}*/
    }
}





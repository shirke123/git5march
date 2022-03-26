package ControlFlowStatment;

public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = {100, 30, 67, 105, 90, 102, 104};
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            System.out.println(sum);
        }

        /**
          even number or odd numbers
         */
        System.out.println();

        int[] arr1 = {101, 102, 45, 79, 34, 89, 44, 52};
        System.out.println("even numbers");
        // if(number%2==0){
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
        /**
         reverse number
         */
        System.out.println();
        int[] a = {101, 102, 45, 78, 34, 678, 780};
        for (int i =a.length - 1; i >= 0; i--) {
            System.out.println(a.length);
        }

    }
}



/*
sort
 */





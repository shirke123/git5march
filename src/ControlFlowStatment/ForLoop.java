package ControlFlowStatment;

//nested for loop
//while loop
//do-while loop
//switch

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) ;
//        {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(j);
//            }
//        }

//        for(int i=1;i<=5;i++){
//            for( int j=1;j<=i;j++){
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//        int i=1;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }
//        int i=1;
//        do {
//            System.out.println(i);
//            i++;
//            }while (i<=10);
//
     /*   int number=20;
        if(number%2==0) {
            System.out.println("even number");
        }else{
            System.out.println("prime number");

           }*/
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            default:
                System.out.println("1,2 and 3");

        }
///
        int month=1;
        String Stringmonths="";
        switch (month){
            case 1:System.out.println("1-jan");
                break;
            case 2:System.out.println("2-feb");
                break;
            case 3:System.out.println("3-mar");
                break;
            case 4:System.out.println("4-april");
                break;
        }
         System.out.println(Stringmonths );

       ///
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();

        switch(num){
            case 1:System.out.println("mon");
                break;
            case 2:System.out.println("tue");
                break;
            case 3:System.out.println("wed");
                break;
            case 4:System.out.println("thur");
                break;
            default:System.out.println("day");

        }
    }
    }

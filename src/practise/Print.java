package practise;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        /**
         print "hello" and "name"
         */
        System.out.println("Hello");
        System.out.println("name");


        /**
         sum of the two numbers
         */
        System.out.println();

        int a = 10, b = 20, c;
        int sum = 0;
        System.out.println("sum two numbers");
        sum = a + b;
        System.out.println(sum);




        /**
         divide two numbers on the screen
         */
        System.out.println();
        System.out.println(34 / 8);

        int num1, num2, res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        num1 = scanner.nextInt();
        System.out.println("enter the second number");
        num2 = scanner.nextInt();
        res = (num1 / num2);
        System.out.println("result:- "+res);



        /**
         swap two variables
         */
        System.out.println();

        int a1, b1,t;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("swapping  numbers");
        System.out.println("a:");
        a1 = scanner.nextInt();
        System.out.println();
        b1 = scanner.nextInt();
        System.out.println();
        t = a1;
        a1 = b1;
        b1 = t;
        System.out.println(a1);
        System.out.println(+b1);




        /**
         print the sum (addition)subtract divide multiply and reminder of two number
         */
        System.out.println();
        Scanner scanner3=new Scanner(System.in);
        System.out.println("enter the two number");
        num1=scanner3.nextInt();
        num2=scanner3.nextInt();

        int add=num1+num2;
        int sub = num1 - num2;
        int  div=num1/num2;
        int mul=num1+num2;
        int reminder=num1+num2;
        System.out.println("addition: "+add);
        System.out.println("subtract: "+sub);
        System.out.println("multiply: "+mul);
        System.out.println("divide: "+div);
        System.out.println("reminder: "+reminder);




        /**
         display table of a number
         */
        System.out.println();

        int num;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter the number");
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println("" + num * i);

        }
    }
}

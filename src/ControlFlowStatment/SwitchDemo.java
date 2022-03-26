package ControlFlowStatment;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        i = scanner.nextInt();

        switch (i){
            case 1:
                int j;
                System.out.println("enter the case1 values");
                j= scanner.nextInt();
                switch (j) {
                    case 10:
                        System.out.println("ten");
                        break;
                    case 20:
                        System.out.println("twenty");
                        break;
                }
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;

            default:
                System.out.println("do not match");

        }
    }
}

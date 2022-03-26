package ControlFlowStatment;

import java.util.Scanner;

public class ScannerDemo {
    public  static  void  main(String[]args){
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of A");
        a=scanner.nextInt();
        System.out.println("Enter the value of B");
        b=scanner.nextInt();
        int c=a+b;
        System.out.println("Addition of c:- "+c);

    }
}

package practise;

import java.util.Scanner;

/**
     prime number or not
 */
public class PrimeOrNot {
    public static void main(String[] args) {
        int num,fect=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a prime number");
        num=scanner.nextInt();
        if(num==1) {
            System.out.println("smallest value number");
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("not a prime");
                break;
            }
            if(num==i){
                System.out.println("prime no");
            }
        }


    }
}

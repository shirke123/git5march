package practise;

import java.util.Scanner;

/**
 * sum of all digit of a number entered by the user.
 */
public class SumAllDigit {
    public static void main(String[] args) {
        long num,sum;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        num=scanner.nextInt();
        for(sum=0;num!=0;num=num/10){
           sum=sum+num%10;

        }
        System.out.println("sum of digit:"+sum);
    }
}

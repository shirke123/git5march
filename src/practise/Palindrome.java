package practise;
import java.util.Scanner;

/**   palindrome or not
 */
public class Palindrome {
    public static void main(String[] args) {
        int num,a,b,temp=0;
        Scanner scanner1=new Scanner(System.in);
        System.out.println("enter the number");
        num=scanner1.nextInt();
        b=num;
        while (num>0){
            a=num%10;
            num=num/10;
            temp=temp*10+a;
        }
        if(temp==b){
            System.out.println("palindrome no");
        }else
        {
            System.out.println("palindrome not");
        }

    }
}

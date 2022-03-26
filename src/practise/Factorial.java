package practise;
import java.util.Scanner;

/**   factorial numbers
 **/
public class Factorial {
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
            System.out.println("factorial number: " + fact);



            }
        }










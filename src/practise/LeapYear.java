package practise;

import java.util.Scanner;

/**   display entered year is leap year or not.
*/
public class LeapYear {
    public static void main(String[] args) {

         int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the year");
        year=scanner.nextInt();
        if(year%400==0){
            System.out.println("enter the leap year");
        }else if (year%100==0){

        }
        else if (year%4==0){

        }
        if(false){
            System.out.println("enter the leap year");
        }else
        System.out.println(" not leap year");

    }
}

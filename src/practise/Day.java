package practise;

import java.util.Scanner;

/** convert days into years weeks and days
 */
public class Day {
    public static void main(String[] args) {
        int days, weeks, year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the days");
        days = scanner.nextInt();
        year = (days / 365);
        weeks = (days % 365) / 7;
        days = (days % 365) % 7;
        System.out.println("year=" + year);
        System.out.println("weeks=" + weeks);
        System.out.println("days=" + weeks);

/**
 display the corresponding  day of the week
 */
        int num;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a day");
        num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            default:
                System.out.println("day");

        }
        /**
          calculate and  sum percentage of the marks.
         */
        int percentage;
        Scanner scanner2=new Scanner(System.in);
        System.out.println("enter the percentage");
        percentage=scanner.nextInt();
        if(percentage>0){
            System.out.println();
        }else if(percentage>=98){
            System.out.println("Grade A");
        }
        else if(percentage>=80){
            System.out.println("grade B");
        }
        else if (percentage>=70){
            System.out.println("grade c");
        }
        else if (percentage>=60){
            System.out.println("grade D");
        }
        else if(percentage>=40){
            System.out.println("grade E");
        }
        else if(percentage<=40){
            System.out.println("grade F");
        }else {
            System.out.println("invalid");
        }
    }
}

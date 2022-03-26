package practise;

import java.util.Scanner;

public class PerimeterOfaRectangle {
    public static void main(String[] args) {
/*
       float perimeter,a,b,c,d;
       a=c=5;
       b=d=4;
       perimeter=2*(a+b);
        System.out.println("rectangle of perimeter: "+perimeter);
*/
        double width,length,area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the width rectangle");
        width=scanner.nextInt();
        System.out.println("enter the length rectangle");
        length=scanner.nextInt();
        area=length*width;
        System.out.println("Area of a rectangle: "+area);



    }
}

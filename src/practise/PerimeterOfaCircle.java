package practise;

import java.util.Scanner;

public class PerimeterOfaCircle {
    public static void main(String[] args) {
        int num;
        double radius = 9, cicrmference ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the area");
        num = scanner.nextInt();
        radius = scanner.nextDouble();
        cicrmference = Math.PI * 2 * radius;
        System.out.println("" + cicrmference);
    }
}

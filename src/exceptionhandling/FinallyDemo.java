package exceptionhandling;

import java.text.NumberFormat;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
           // System.exit(1);
            int i = 0;
            int j = i / 0;
            System.out.println("In first try Block");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException->" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat->"+e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception->"+e.getMessage());
        }
        finally
        {
            int i=1/1;
            System.out.println("hii");
            System.out.println("hii");
            System.out.println("hii");
            System.out.println("hii");
        }
    }
}

package exceptionhandling;

import java.text.NumberFormat;

public class NestedTry
{
    public static void main(String[] args)
    {
        try
        {
        int i = 10;
        int j = i / 0;
        System.out.println("in first try block");
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println("In second try Block");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    } catch(NullPointerException e){
        System.out.println("null pointer->" + e.getMessage());
    } catch(NumberFormatException e){
        System.out.println("Number format->" + e.getMessage());
    } catch(Exception e){
        System.out.println("class cast->" + e.getMessage());
    }
    System.out.println("hii");
    System.out.println("hii");
    System.out.println("hii");
}
}

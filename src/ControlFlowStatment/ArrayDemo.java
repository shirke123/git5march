package ControlFlowStatment;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public static  void  main(String[]args)
    {
        int i=10;
        int[] j=new int [5];
        j[0]=10;
        j[1]=20;
        j[2]=30;
        j[3]=40;
        j[4]=50;

        List<Integer> list =new ArrayList<>();
        System.out.println(j[0]);
    }
}

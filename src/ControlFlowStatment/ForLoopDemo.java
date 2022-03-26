package ControlFlowStatment;

import  java.util.List;
import java.util.Arrays;

public class ForLoopDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println();

        //tradition for(reverse String)
        for (int i =arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println();

        // enhanced for loop
        for(int i:arr);{
            System.out.println();
        }

        List<Integer>List=Arrays.asList(3,4,345,4);
        List.forEach(s->{
            System.out.println("s");
    });
    }
}
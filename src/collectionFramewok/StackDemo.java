package collectionFramewok;

import java.util.Stack;
import java.util.Vector;

public class StackDemo extends Vector {
    public static void main(String[] args) {

        Stack <Integer> stack=new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);

        System.out.println(stack.peek());  //top element of the stack.
        System.out.println(stack.pop());   //remove element of the stack.
        System.out.println(stack.empty());   //check the empty or not (true or false).
 //     System.out.println(stack.search(10));  // search the object
        System.out.println(stack.push(60));  //insert the element top of the stack.

        System.out.println(stack);

    }
}

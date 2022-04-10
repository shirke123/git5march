package collectionFramewok;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer>vector=new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);

        vector.remove(Integer.valueOf(40));
       System.out.println(vector.remove(5));
       System.out.println(vector.add(45));
        System.out.println(vector.lastElement());
        System.out.println(vector);
       System.out.println(vector.capacity());
    }
}

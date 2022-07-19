package collectionFramewok;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacity {
    public static void main(String[] args) throws NoSuchFieldException {
        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(56);
        list1.add(33);
        list1.add(77);

//        static int getCapacity System.out.println(getCapacity. (list1));
//
//        (List al) throws{
//            Field field = ArrayList.class.getDeclaredField("elementData");
//            field.setAccessible(true);
//            return ((Object[]) field.get(al)).length;

        }
    }

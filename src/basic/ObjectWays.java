package basic;

import com.sun.jdi.InvocationException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectWays {

    public void show()
    {
        System.out.println("in show");
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationException, InvocationTargetException {

        ObjectWays obj = new ObjectWays();
        obj.show();

        ObjectWays obj1 = ObjectWays.class.newInstance();
        obj1.show();

        Constructor<ObjectWays> Obj2 = ObjectWays.class.getConstructor();
        ObjectWays obj3= Obj2.newInstance();
        obj3.show();
    }
}

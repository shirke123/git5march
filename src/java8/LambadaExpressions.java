package java8;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 lambada exp:-anonymous class.
()-> :- body

 use->  1) it takes less code.
        2) it implements functional interface
 */

public class LambadaExpressions {

    public void show() {

    }

    public static void main(String[] args) {
      MyInterface myInterface=()->{
          System.out.println("in the show");
      };

        MyInterface2 myInterface2 =(i,j)-> System.out.println(i-j);
        myInterface.add();;
        myInterface2.sub(5,7);

        List<Integer>list=Arrays.asList(1,2,3,4);
        Consumer<Integer>consumer=new Consumer<Integer>(){

            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        list.forEach(System.out::println);
        MyInterface3 myInterface3=()->"hello";
        System.out.println(myInterface3.msg());
        }
    }

interface MyInterface{
    void add();
}
interface MyInterface2{
    void sub(int i,int j);
}
interface  MyInterface3{
    String msg();
}









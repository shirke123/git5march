package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 stream api:-  It is a    sequence of object and have any method
              ,we combine that method for produce desire result

 types:-1)sequential
        2)parallel (multithreading)

 operations:
 1)terminal:- foreach(),reduce(),collect().
 2)intermediate:- map(function),filter(predicate),sorted().

 */

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Function<Integer,Integer>function=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        //Function<Integer,Boolean>function1=(Integer,integer)-> integer >10;
       // System.out.println(function1.apply(40));


//        list.stream().map(function).forEach(s->{
//            System.out.println();
//        });


        int max=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
//        System.out.println(max);

        System.out.println(IntStream.of(1,2,3,4,5,6,7,8,9).max().getAsInt());
    }
}

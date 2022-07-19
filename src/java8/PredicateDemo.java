package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer>predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>3;
            }
        };
        Predicate<Integer> checkInteger=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer ==0;
            }
        };
        Integer integer=10;
        System.out.println(checkInteger.test(integer));
        list.stream().filter(predicate.and(predicate)).forEach(System.out::println);
    }
}

package java8;

import java.io.ObjectInputFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class ByFunctionDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> predicate = p -> p % 2 == 0;

       BiFunction<List<Integer>, Predicate < Integer >, List < Integer >> biFunction = (list1, predicate1) -> {
            List<Integer> result = new ArrayList<>();

            for (Integer i :list) {
                if (predicate.test(i)) {
                    result.add(i);

                }
            }
            return result;

        };
        biFunction.apply(list, predicate).stream().toList().forEach(System.out::println);

    }
}

package python.Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class list_operation {
    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(2,3,4,5,6,7,8);

        int result=nums.stream()
                .filter(n->n%2==0)        //Stream<T> filter(Predicate<? super T> predicate);
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);  // here first zero is the initial value that is zero and c is the
                                               //first element and e is the second element so we simpally add them
        System.out.println(result);

        Stream<Integer> sorted=nums.stream()
                .map(n->n*2)
                .sorted();

        sorted.forEach(x -> System.out.println(x));
        //sorted.forEach(System.out::println);

        //predicate(interface)  means true or false

        //back implementation of lambda expression
        //filter contain a interface called Predicate
        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if (n%4==0)
                return true;
                else
                    return false;
            }
        };

        //Map working
       // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        // map takes object of function and function is a Functional Interface that takes two
        //types which has a method called apply(T t);

        Function<Integer,Integer> fun=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        //reduce
        // reduce(T identity, BinaryOperator<T> accumulator);
    }

}

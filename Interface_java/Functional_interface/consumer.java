package python.Interface_java.Functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        List<Integer> p= Arrays.asList(2,3,4,5,6,7);
        // here consumer interface is a functional interface
        //creating an object of consumer

        //part 1 part by creating objects :
        Consumer<Integer> c=new ConsImpl();
        p.forEach(c);

        //part 2 part anonimus class
        Consumer<Integer> l=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        p.forEach(l);

        //part 3 using lambda expression for line 18-24
       Consumer<Integer> k=(i)-> System.out.println(i);

        //part 4 using method reference :
        Consumer<Integer> w= System.out::println;

        //more shot
        p.forEach(i -> System.out.println(i));
    }


}



//part 1 part
class ConsImpl implements Consumer<Integer>
{ //so insted of creating a named class we should create a anonimus class because
    //this calss is used only once
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
package python.Interface_java.Functional_interface;

import java.util.function.Function;

public class function {
    public static void main(String[] args) {


        // takes two arguments and hava apply function in it :

        Function<Integer ,String> getstr=t->t*10+" result data";
        System.out.println(getstr.apply(4));
    }
}

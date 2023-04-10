package python.Interface_java.Functional_interface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {

    public static void main(String[] args) {

        //checking the length of string
        // predicate hava test method in it :
         Predicate<String> check=str->str.length()>7;

        System.out.println(check.test("\"My  name is Jitender Mirdha"));

        List<String> names = Arrays.asList(
                "Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        Predicate<String> b=f->f.startsWith("G");
       for(String st:names){
           if(b.test(st))
               System.out.println(st);
       }



    }
}

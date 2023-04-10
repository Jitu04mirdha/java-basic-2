package python.Interface_java.Functional_interface;


interface  Square{
    int calculate(int x);
}

public class Fun_In_2 {
    public static void main(String[] args) {
      int a=5;
      // lambda expression to define the calculate method
    Fun_In_2 s=new Fun_In_2();
    //Square p= Fun_In_2::calculate;
        Square p= x -> {
            return calculate(x);
        };
    int ans=p.calculate(a);
        System.out.println(ans);

    }

    private static int calculate(int x) {
        return x * x;
    }
}

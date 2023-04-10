package python.Interface_java.Functional_interface;

public class Fun_In_1 {
    public static void main(String[] args) {

        // lambda expression to create the object
        new Thread(()->{
            System.out.println("hello world :");
        }).start();
    }
}

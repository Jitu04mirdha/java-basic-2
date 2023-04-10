package python.Interface_java;

public class nestedInterface {
    public static void main(String[] args) {
      Result r=new Result();
      r.show();
    }
}
class Test{
    interface A{
        interface B{
            void show();
        }
    }
}

class Result implements Test.A.B{
    @Override
    public void show() {
        System.out.println("hello Arya students :");
    }
}

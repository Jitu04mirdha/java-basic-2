package python.Interface_java;

public class Interface implements A {
    @Override
    public void show() {
        System.out.println("hello my friends");
    }

    public static void main(String[] args) {
     Interface in=new Interface();
     in.show();

    }

}
interface A{
    void show();
    int num=44;
}

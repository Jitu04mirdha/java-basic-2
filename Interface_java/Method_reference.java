package python.Interface_java;

public class Method_reference {
    public static void main(String[] args) {

        Method_reference m=new Method_reference();
      help j=m::show;
    }
    public void show(){
        System.out.println("play");
    }

}
interface help{
    public void pay();
}

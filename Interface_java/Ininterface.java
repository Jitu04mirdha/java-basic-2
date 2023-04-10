package python.Interface_java;

interface Showable{
    void show();
    interface Message{
        void msg();
    }
}
public class Ininterface implements Showable.Message {
 public void msg(){
     System.out.println("Hello nested interface");
 }

    public static void main(String[] args) {
        Showable.Message m=new Ininterface();
        m.msg();
    }

}

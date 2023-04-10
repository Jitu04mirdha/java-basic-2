package python.Interface_java.Functional_interface;

public class Functional_interface {

    public static void main(String[] args) {
//creating anonymous inner class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created :");
            }
        }).start();
    }
}




//Functional Interface is additionally recognized as Single Abstract Method Interfaces.
// In short, they are also known as SAM interfaces.
package python.threads.basic;

public class lamda_thread {
    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hello world");
            }
        };
        Thread t=new Thread(r);
        t.start();

        //more shorter way of doing this is direct passing the object code into thread
        Thread l=new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hello  ");
            }}
        );
        l.start();
    }
}


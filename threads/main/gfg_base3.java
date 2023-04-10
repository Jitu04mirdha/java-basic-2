package python.threads.main;

public class gfg_base3 extends Thread{

    //If two threads have the same priority then we can’t expect which thread will execute first. It depends on the thread
    //scheduler’s algorithm(Round-Robin, First Come First Serve, etc)

    public static void main(String[] args) {

        // Getting reference to Main thread
        Thread t=Thread.currentThread();
        // Getting name of Main thread
        System.out.println("current thread :"+t.getName());

        //Changing the name of main thread :
        t.setName("jitu");
        System.out.println("After changing thread name :"+t.getName());

        //Gettign priority of the Main thread :
        System.out.println("Main thread priority :"+t.getPriority());

        //setting priority
        t.setPriority(MAX_PRIORITY);
        // Print and display the main thread priority
        System.out.println("Main thread new priority: "+ t.getPriority());

        System.out.println("Main thread new priority :"+t.getPriority());


        for(int i=0;i<=5;i++){
            System.out.println("Main thread()");
        }

        Thread ct=new Thread() {
            // run method of thread
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child thread");
                }
            }
        };
        // Getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: "
                + ct.getPriority());

        // Setting priority of Main thread to MIN(1)
        ct.setPriority(MIN_PRIORITY);

        System.out.println("Child thread new priority: "
                + ct.getPriority());

        // Starting child thread
        ct.start();

    }
}

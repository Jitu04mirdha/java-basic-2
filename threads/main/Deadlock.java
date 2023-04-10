package python.threads.main;

public class Deadlock {
    public static void main(String[] args) {

        // Try block to check for exceptions
        try {

            // Print statement
            System.out.println("Entering into Deadlock");

            // Joining the current thread
            Thread.currentThread().join();

            // This statement will never execute
            System.out.println("This statement will never execute");

        }

        // Catch block to handle the exceptions
        catch (InterruptedException e) {

            // Display the exception along with line number
            // using printStackTrace() method
            e.printStackTrace();
        }
    }
}

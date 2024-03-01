package src;

public class DemoThread {

    // Process? Thread?

    public static void main(String[] args) {

        System.out.println("main Start ...");

        // Runnable
        //Runnable task1 = () -> System.out.println("task1 running ...");

        Runnable task1 = () -> {
            try {
                Thread.sleep(2000); // 2000ms or 2s
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            } 

            Thread current = Thread.currentThread();
            System.out.println("Thread ID:" + current.getId() + ", Thread Name: " + current.getName());
            System.out.println("task 1 running ...");
        };



        // Thread
        Thread thread1 = new Thread(task1);
        thread1.start(); // main thread split itself, anther thread is created

        Thread thread2 = new Thread(task1);
        thread2.start();

        CustomThread customThread = new CustomThread(); // Task is already defined in CustomThread class
        customThread.start();

        // Joinning multiple threads
        // main thread wait for the threads that calls .join() to be completed before ends.
        // use try-catch block to catch InterruptedException
        try {
            thread1.join();
            thread2.join();
            customThread.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("main End ...");



    }
}

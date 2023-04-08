public class Practical_15 {
    public static void main(String[] args) {
        // Create and start a new thread using the Thread class
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        // Main thread continues execution
        System.out.println("Main thread is running");
    }
    // A simple class that implements the Runnable interface
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("New thread is running");
        }
    }
}
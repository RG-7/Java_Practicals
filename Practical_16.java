public class Practical_16 implements Runnable {
    Thread thread;
    public Practical_16(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(thread.getName() + ": " + i);
                Thread.sleep(1000);
                Thread.yield();
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted.");
        }
    }
    public void stopThread() {
        thread.stop();
    }
    public static void main(String[] args) {
        Practical_16 demo1 = new Practical_16("Thread 1");
        Practical_16 demo2 = new Practical_16("Thread 2");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demo1.stopThread();
        demo2.stopThread();
    }
}
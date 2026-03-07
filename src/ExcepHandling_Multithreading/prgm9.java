package ExcepHandling_Multithreading;

class LifeCycleThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class prgm9 {
    public static void main(String[] args) {
        LifeCycleThread t = new LifeCycleThread();
        t.start();
        try { t.join();
        } catch (InterruptedException e) {}
        System.out.println("Thread finished.");
    }
}

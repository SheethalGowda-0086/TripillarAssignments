package ExcepHandling_Multithreading;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running ");
    }
}
public class prgm7 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

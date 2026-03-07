package ExcepHandling_Multithreading;

class AlternatePrinter {
    private boolean turn = true;
    synchronized void printNumber(int num, boolean isThread1) {
        while (turn != isThread1) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println(num);
        turn = !turn;
        notifyAll();
    }
}
public class prgm10 {
    public static void main(String[] args) {
        AlternatePrinter ap = new AlternatePrinter();
        Thread t1 = new Thread(() -> { for(int i=1;i<=5;i++) ap.printNumber(i,true); });
        Thread t2 = new Thread(() -> { for(int i=6;i<=10;i++) ap.printNumber(i,false); });
        t1.start(); t2.start();
    }
}

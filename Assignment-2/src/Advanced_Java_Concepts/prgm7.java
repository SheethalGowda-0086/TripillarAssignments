package Advanced_Java_Concepts;

public class prgm7 {
    public void finalize() {
        System.out.println("garbage collected");
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            prgm7 im = new prgm7();
            im = null;
        }
        System.gc();
    }
}

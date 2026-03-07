package Advanced_Java_Concepts;

public class prgm4 {
    static void stringappend() {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("original string is: " + sb);
        sb.append("world");
        System.out.println("modified: " + sb);
    }
    public static void main(String[] args) {
        stringappend();
    }
}

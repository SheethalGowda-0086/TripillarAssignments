package Advanced_Java_Concepts;

public class prgm8 {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);

        StringBuilder sb = new StringBuilder("Good");
        sb.append(" mrng");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbuf = new StringBuffer("I'm");
        sbuf.append(" a human");
        System.out.println("StringBuffer: " + sbuf);
    }
}

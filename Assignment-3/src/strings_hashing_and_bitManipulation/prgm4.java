package strings_hashing_and_bitManipulation;

import java.util.Arrays;

public class prgm4 {
    public static void main(String[] args) {
        String s1 = "stop";
        String s2 = "post";
        char[] a = s1.toCharArray();
        char[] b= s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if (Arrays.equals(a,b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("not a anagram");
        }
    }
}

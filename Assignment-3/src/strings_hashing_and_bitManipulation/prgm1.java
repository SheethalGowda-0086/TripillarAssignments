package strings_hashing_and_bitManipulation;

public class prgm1 {
    public static void main(String[] args) {
        String str = "malayalam";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reverse);
        if (str.equals(reverse)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }
}

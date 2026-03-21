package strings_hashing_bitManipulation_collections;

public class prgm4 {
    public static void main(String[] args) {
        String str = "Java is a object oriented programming language";
        System.out.println("Original string: "+str);
        String result = str.replace(" ", "%20");
        System.out.println("Modified string: " + result);
    }
}

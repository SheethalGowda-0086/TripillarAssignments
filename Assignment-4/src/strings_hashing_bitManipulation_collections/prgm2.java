package strings_hashing_bitManipulation_collections;

public class prgm2 {
    public static void main(String[] args) {
        String sentence = "Sapthagiri NPS university";
        System.out.println(sentence);
        String[] words = sentence.split(" ");
        for (String w : words) {
            System.out.print(new StringBuilder(w).reverse() + " ");
        }
    }
}
